package com.snowboard.apigateway.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class FlowDiscoverer implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String destinationUri;
        HttpServletRequest request = exchange.getIn().getBody(HttpServletRequest.class);
        String requestMethod = request.getMethod();
        String requestUri = request.getRequestURI();
        destinationUri = matchUri(requestMethod, requestUri);
        exchange.getIn().setHeader("destinationUri", destinationUri);
    }

    private String matchUri(String method, String requestUri) {
        return "flowName";
    }
}
