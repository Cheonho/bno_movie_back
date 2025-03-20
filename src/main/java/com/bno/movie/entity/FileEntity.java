package com.bno.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="files")
@Table(name="files")
public class FileEntity extends AbstractIdEntity {

    @Id
    String id;
    String fileName;
    @NotNull
    String boardNum;
    String filePath;
    String minioDataUrl; // 이미지 url
    String contentType;
    String fileExtension;
    LocalDateTime createAt;
    int size;
    Boolean status;
}
