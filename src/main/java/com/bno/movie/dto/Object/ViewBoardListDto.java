package com.bno.movie.dto.Object;

import com.bno.movie.entity.AbstractIdEntity;
import com.bno.movie.entity.ViewBoardListEntity;
import lombok.*;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ViewBoardListDto extends AbstractIdEntity {

    String id;
    String title;
    String content;
    int viewCount;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    String writerEmail;
    String writerNickname;
//    List<FileDto> fileList;

    public Page<ViewBoardListDto> pageToDto(Page<ViewBoardListEntity> entity) {
        Page<ViewBoardListDto> viewBoardListDtoPage = entity.map(m -> ViewBoardListDto.builder()
                .id(m.getId())
                .title(m.getTitle())
                .content(m.getContent())
                .viewCount(m.getViewCount())
                .createAt(m.getCreateAt())
                .updateAt(m.getUpdateAt())
                .writerEmail(m.getWriterEmail())
                .writerNickname(m.getWriterNickname())
                .build()
        );
        return viewBoardListDtoPage;
    }
}
