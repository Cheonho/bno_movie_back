package com.bno.movie.service;

import com.bno.movie.dto.responseDto.board.GetBoardListDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface BoardService {

    ResponseEntity<GetBoardListDto> getBoardList(Pageable pageable);

}
