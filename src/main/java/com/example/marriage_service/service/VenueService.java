package com.example.marriage_service.service;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class VenueService {

    private static final Logger logger = LoggerFactory.getLogger(VenueService.class);

    @EventListener
    @Async
    public void getVenue(MarriageEvent event) {
       logger.info("VenueService arrived for {} with {}",event.getName(),Thread.currentThread().getName());
    }
}
