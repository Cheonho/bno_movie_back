package com.bno.movie.service.Impl;

import com.bno.movie.dto.Object.ViewBoardListDto;
import com.bno.movie.dto.responseDto.board.GetBoardListDto;
import com.bno.movie.entity.ViewBoardListEntity;
import com.bno.movie.repository.BoardRepository;
import com.bno.movie.repository.ViewBoardListRepository;
import com.bno.movie.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;
    private final ViewBoardListRepository viewBoardListRepository;

    @Override
    public ResponseEntity<GetBoardListDto> getBoardList(Pageable pageable) {
        Page<ViewBoardListEntity> viewBoardListEntityPage;
        Page<ViewBoardListDto> viewBoardListDtoPage;
        try {
            viewBoardListEntityPage = viewBoardListRepository.findAllByOrderByCreateAt(pageable);
            viewBoardListDtoPage = new ViewBoardListDto().pageToDto(viewBoardListEntityPage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return GetBoardListDto.success(viewBoardListDtoPage);
    }
}
