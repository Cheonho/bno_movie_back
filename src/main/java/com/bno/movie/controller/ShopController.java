package com.bno.movie.controller;

import com.bno.movie.dto.Object.BoardDto;
import com.bno.movie.dto.responseDto.board.GetBoardListDto;
import com.bno.movie.service.BoardService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop/")
public class ShopController {

    private final BoardService boardService;

    ShopController(BoardService boardService){
        this.boardService = boardService;
    }

    @GetMapping("list")
    public ResponseEntity<GetBoardListDto> getShopList(
            @PageableDefault(size = 20, sort = "createAt", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        ResponseEntity<GetBoardListDto> response = boardService.getBoardList(pageable);
        return response;
    }

    @PostMapping("write")
    public ResponseEntity<?> postWriteBoard(
            @Valid @RequestBody BoardDto boardDto
    ) {
        return null;
    }
}
