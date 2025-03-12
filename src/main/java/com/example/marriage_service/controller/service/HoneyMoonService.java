package com.example.marriage_service.controller.service;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HoneyMoonService {
    private static final Logger log = LoggerFactory.getLogger(HoneyMoonService.class);
    @EventListener
    @Async
    public void getHoneyMoonLocation(MarriageEvent marraigeEvent) {
        log.info("Honey Moon Location: Paris, France {} with {}",marraigeEvent.getName(),Thread.currentThread().getName());
    }
}
