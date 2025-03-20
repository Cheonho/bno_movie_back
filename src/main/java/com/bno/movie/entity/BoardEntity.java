package com.bno.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="boards")
@Table(name="boards")
public class BoardEntity extends AbstractIdEntity {

    @Id
    String id;
    @NotNull
    String title;
    @NotNull
    String writerEmail;
    @NotNull
    String content;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    int viewCount;
    Boolean status;
}
