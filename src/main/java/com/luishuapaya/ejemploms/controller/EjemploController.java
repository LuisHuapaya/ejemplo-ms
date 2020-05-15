package com.luishuapaya.ejemploms.controller;

import com.luishuapaya.ejemploms.model.PingRequest;
import com.luishuapaya.ejemploms.model.PingResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sadr")
public class EjemploController {
    
    private static final Logger LOG = LoggerFactory.getLogger(EjemploController.class);

    @PostMapping(value = "/ping", produces = "application/json; charset=utf-8")
    public PingResponse ping(@RequestBody(required = true) PingRequest  request){
        LOG.debug("--> ping received");
        LOG.debug("--> id: {}",request.getId());
        LOG.debug("--> content: {}", request.getMessage());

        return new PingResponse("Hello from Sadr - " + request.getId() + " - " + request.getMessage());
    } 

}