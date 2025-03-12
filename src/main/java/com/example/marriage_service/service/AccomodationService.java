package com.example.marriage_service.service;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AccomodationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccomodationService.class);

    @EventListener
    @Async
    public void getAccomodationDetails(MarriageEvent marraigeEvent) {

     LOGGER.info("Accomodation details fixed for {} with {} " , marraigeEvent.getName(),Thread.currentThread().getName());
    }
}
