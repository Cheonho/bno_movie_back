package com.bno.movie.dto.responseDto.board;

import com.bno.movie.dto.Object.GenerecResponseDto;
import com.bno.movie.dto.Object.ViewBoardListDto;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Getter
@ToString
public class GetBoardListDto {

    private final Page<ViewBoardListDto> boardList;

    public GetBoardListDto(Page<ViewBoardListDto> boardList) {
        GenerecResponseDto resDto = new GenerecResponseDto();
        resDto.setCode("Su");
        resDto.setMessage("성공");
        this.boardList = boardList;
    }

    public static ResponseEntity<GetBoardListDto> success(Page<ViewBoardListDto> boardList) {
        GetBoardListDto result = new GetBoardListDto(boardList);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
