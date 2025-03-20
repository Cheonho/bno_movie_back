package com.bno.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="users")
@Table(name="users")
public class UserEntity extends AbstractIdEntity {

    @Id
    String id;
    String email;
    String userNickname;
    String password;
    String address;
    String role;
    Boolean is_available;
}
