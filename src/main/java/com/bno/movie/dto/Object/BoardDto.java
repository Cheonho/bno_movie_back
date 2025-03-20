package com.bno.movie.dto.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto extends AbstractIdDto {

    String id;
    String title;
    String writerEmail;
    String content;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    int viewCount;
    Boolean status;
}
