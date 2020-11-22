package com.snowboard.apigateway.controller;

import com.snowboard.apigateway.flow.BoardFlow;
import com.snowboard.apigateway.flow.OrderFlow;
import org.springframework.web.bind.annotation.*;

@RestController("/api/order")
public class OrderController {

    private final OrderFlow flow;

    public OrderController(OrderFlow flow) {
        this.flow = flow;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Object getOrderById(@PathVariable String id) {
        return flow.getOrderById(id);
    }

}
