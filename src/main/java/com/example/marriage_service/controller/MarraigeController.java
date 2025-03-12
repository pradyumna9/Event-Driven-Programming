package com.example.marriage_service.controller;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarraigeController {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(MarraigeController.class);

    private final ApplicationEventPublisher applicationEventPublisher;

    public MarraigeController(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

 /*   private final AccomodationService accomodationService;
    private final HoneyMoonService honeyMoonService;
    private final TransportationService transportationService;
    private final VenueService venueService;
    private final VideoRecordService videoRecordService;

    public MarraigeController(AccomodationService accomodationService, HoneyMoonService honeyMoonService, TransportationService transportationService, VenueService venueService, VideoRecordService videoRecordService) {
        this.accomodationService = accomodationService;
        this.honeyMoonService = honeyMoonService;
        this.transportationService = transportationService;
        this.venueService = venueService;
        this.videoRecordService = videoRecordService;
    }*/

    @GetMapping("/marriage/{name}")
    public String marriage(@PathVariable String name){
    //call all services
     /*   accomodationService.getAccomodationDetails(name);
        honeyMoonService.getHoneyMoonLocation(name);
        transportationService.getTransportation(name);
        venueService.getVenue(name);
        videoRecordService.recordVideo(name);*/
        logger.info("Marriage Event Started for  {}", Thread.currentThread().getName());
        applicationEventPublisher.publishEvent(new MarriageEvent(this, name));
        logger.info("Marriage Event Ended for  {}", Thread.currentThread().getName());
        return "Marriage is arranged";
    }


    //check the candidate for marriage
    //arrange venue
    //arrange videographer
    //arrange transportation
    //arrange accommodation
    //arrange honeymoon

}
