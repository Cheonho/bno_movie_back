package com.bno.movie.dto.Object;

import com.bno.movie.entity.AbstractIdEntity;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDto extends AbstractIdEntity {

    String id;
    String fileName;
    String boardNum;
    String filePath;
    String minioDataUrl; // 이미지 url
    String contentType;
    String fileExtension;
    LocalDateTime createAt;
    int size;
    Boolean status;
}
