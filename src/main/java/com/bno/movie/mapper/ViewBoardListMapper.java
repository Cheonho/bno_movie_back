package com.bno.movie.mapper;

import com.bno.movie.dto.Object.ViewBoardListDto;
import com.bno.movie.entity.ViewBoardListEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ViewBoardListMapper extends GenericMapper<ViewBoardListDto, ViewBoardListEntity> {

    ViewBoardListMapper INSTANCE = Mappers.getMapper(ViewBoardListMapper.class);
}
