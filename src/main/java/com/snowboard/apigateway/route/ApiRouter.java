package com.snowboard.apigateway.route;


import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ApiRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:getBoardById")
                .bean("flow", "getBoardByID")
                .end();

        from("direct:searchBoards")
                .bean("flow", "searchBoards")
                .end();

        from("direct:getAllBoards")
                .bean("flow", "getAllBoards")
                .end();


    }
}
