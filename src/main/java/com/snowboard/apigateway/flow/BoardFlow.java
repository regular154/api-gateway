package com.snowboard.apigateway.flow;

import com.snowboard.apigateway.service.BoardService;
import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BoardFlow {

    private final BoardService boardService;

    public BoardFlow(BoardService boardService) {
        this.boardService = boardService;
    }

    public String getBoardById(String id) {
        return "";

    }

    public String searchBoards(Map<String, String> params) {
        return "";
    }

    public String getAllBoards(Map<String, String> params) {
        return "";
    }

}
