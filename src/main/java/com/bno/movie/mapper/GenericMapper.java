package com.bno.movie.mapper;

import com.bno.movie.dto.Object.AbstractIdDto;
import com.bno.movie.util.TsidUtil;
import org.mapstruct.BeanMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface GenericMapper<DTO, Entity> {

    DTO toDTO(Entity entity);
    Entity toEntity(DTO dto);

    List<Entity> toEntityList(List<DTO> dtoList);
    List<DTO> toDTOList(List<Entity> entityList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFormDto(DTO dto, @MappingTarget Entity entity);

    @BeforeMapping
    default void generatedId(DTO dto) {
        if (dto == null) return;

        if (dto instanceof AbstractIdDto) {
            AbstractIdDto abstractDto = (AbstractIdDto) dto;

            if (abstractDto.getId() == null) {
                abstractDto.setId(TsidUtil.getTsid());
            }
        }
    }
}
