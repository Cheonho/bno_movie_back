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
@Entity(name="comments")
@Table(name="comments")
public class CommentEntity extends AbstractIdEntity {

    @Id
    String id;
    @NotNull
    String content;
    String parentNum;
    @NotNull
    String writerEmail;
    @NotNull
    String BoardNum;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    Boolean status;
}
