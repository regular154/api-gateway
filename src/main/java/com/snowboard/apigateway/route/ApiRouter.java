package com.snowboard.apigateway.route;


import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiRouter extends RouteBuilder {

    private final Processor flowDiscoverer;

    public ApiRouter(Processor flowDiscoverer) {
        this.flowDiscoverer = flowDiscoverer;
    }

    @Override
    public void configure() throws Exception {
        from("direct:ui")
                .bean(flowDiscoverer)
                .toD("direct:${header.flowName}")
                .end();


        from("direct:getBoardById")
                .bean("boardFlow", "getBoardByID")
                .toD("direct:board-service")
                .end();


    }
}
