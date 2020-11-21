package com.snowboard.apigateway.controller;

import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController("/api")
public class ApiController {

    private final ProducerTemplate producerTemplate;

    public ApiController(ProducerTemplate producerTemplate) {
        this.producerTemplate = producerTemplate;
    }

    @GetMapping("/item/{id}")
    @ResponseBody
    public Object getBoardById(@PathVariable String id) {
        return producerTemplate.sendBody("direct:getBoardById", ExchangePattern.InOut, id);
    }

    @GetMapping("/search")
    @ResponseBody
    public Object searchBoards(@RequestParam Map<String, String> allParams) {
        return producerTemplate.sendBody("direct:searchBoards", ExchangePattern.InOut, allParams);
    }

    @GetMapping
    @ResponseBody
    public Object getAllBoards(@RequestParam Map<String, String> allParams) {
        return producerTemplate.sendBody("direct:getAllBoards", ExchangePattern.InOut, allParams);
    }


}
