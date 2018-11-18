package com.yet.spring.core.loggers;

import com.yet.spring.core.beans.Event;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        log.info(event.toString());
    }
}