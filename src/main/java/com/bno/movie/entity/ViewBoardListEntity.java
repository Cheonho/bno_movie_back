package com.bno.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="board_list_view")
public class ViewBoardListEntity extends AbstractIdEntity {

    @Id
    String id;
    String title;
    String content;
    int viewCount;
    LocalDateTime createAt;
    LocalDateTime updateAt;
    String writerEmail;
    String writerNickname;
}
