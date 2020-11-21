package com.snowboard.apigateway.controller;

import com.snowboard.apigateway.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("api/board")
public class BoardController {

//    private final BoardService boardService;
//
//    public BoardController(BoardService boardService) {
//        this.boardService = boardService;
//    }
//
//    @GetMapping("/item/{id}")
//    @ResponseBody
//    public Object getBoardById(@PathVariable String id) {
//        return boardService.getBoardById(id);
//    }
//
//    @GetMapping("/search")
//    @ResponseBody
//    public Object searchBoards(@RequestParam Map<String, String> allParams) {
//        return boardService.searchBoard(allParams);
//    }
//
//    @GetMapping
//    @ResponseBody
//    public Object getAllBoards(@RequestParam Map<String, String> allParams) {
//        return boardService.getAllBoards(allParams);
//    }

}
