package com.bno.movie.dto.Object;

import com.bno.movie.entity.AbstractIdEntity;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDto extends AbstractIdEntity {

    String id;
    String content;
    String parentNum;
    String writerEmail;
    String BoardNum;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    Boolean status;
}
