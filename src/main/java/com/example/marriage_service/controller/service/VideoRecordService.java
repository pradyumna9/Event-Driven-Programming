package com.example.marriage_service.controller.service;

import com.example.marriage_service.event.MarriageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class VideoRecordService {
    private static final
    Logger logger = LoggerFactory.getLogger(VideoRecordService.class);
    @EventListener
    @Async
    public void recordVideo(MarriageEvent marraigeEvent) {
        logger.info("Recording video {} with {}",marraigeEvent.getName(),Thread.currentThread().getName());
    }
}
