package com.fernandez.redirection.cron;

import com.fernandez.redirection.controller.RedirectionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private RedirectionController redirectionController;

    // Se ejecuta todos los días a las 2 AM, puedes ajustar la expresión cron según tus necesidades
    @Scheduled(cron = "0 45 14 * * *")
    public void executeAllScheduled() {
        redirectionController.executeAll(null);
    }
}

