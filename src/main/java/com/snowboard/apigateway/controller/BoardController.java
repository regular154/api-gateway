package com.snowboard.apigateway.controller;

import com.snowboard.apigateway.flow.BoardFlow;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/api/board")
public class BoardController {

    private final BoardFlow flow;

    public BoardController(BoardFlow flow) {
        this.flow = flow;
    }

    @GetMapping("/item/{id}")
    @ResponseBody
    public Object getBoardById(@PathVariable String id) {
        return flow.getBoardById(id);
    }

    @GetMapping("/search")
    @ResponseBody
    public Object searchBoards(@RequestParam Map<String, String> params) {
        return flow.searchBoards(params);
    }

    @GetMapping
    @ResponseBody
    public Object getAllBoards(@RequestParam Map<String, String> params) {
        return flow.getAllBoards(params);
    }


}
