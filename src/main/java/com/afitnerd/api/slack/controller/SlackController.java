package com.afitnerd.api.slack.controller;

import com.afitnerd.api.slack.model.FormSlackSlashCommand;
import com.afitnerd.api.slack.model.SlackSlashCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SlackController {

    private static final Logger log = LoggerFactory.getLogger(SlackController.class);

    // HttpMessageConverter approach - custom
    @RequestMapping(
            value = "/slack", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody SlackSlashCommand slack(@RequestBody SlackSlashCommand slackSlashCommand) {
        log.info("slackSlashCommand: {}", slackSlashCommand);

        return slackSlashCommand;
    }

    // HandlerMethodArgumentResolver approach
    @RequestMapping(
        value = "/slack2", method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody SlackSlashCommand slack2(SlackSlashCommand slackSlashCommand) {
        log.info("slackSlashCommand: {}", slackSlashCommand);

        return slackSlashCommand;
    }

    // Automatic HttpMessageConverter approach
    @RequestMapping(
        value = "/slack3", method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody FormSlackSlashCommand slack3(@ModelAttribute FormSlackSlashCommand slackSlashCommand) {
        log.info("slackSlashCommand: {}", slackSlashCommand);

        return slackSlashCommand;
    }
}