package com.example.marriage_service.service;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TransportationService {

    private static final Logger logger = LoggerFactory.getLogger(TransportationService.class);
    @EventListener
    @Async
    public void getTransportation(MarriageEvent marraigeEvent) {
       logger.info("Transportation are available for the wedding {} with {}",marraigeEvent.getName(),Thread.currentThread().getName());
    }
}
