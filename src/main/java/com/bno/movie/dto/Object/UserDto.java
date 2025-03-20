package com.bno.movie.dto.Object;

import com.bno.movie.entity.AbstractIdEntity;
import lombok.*;

@EqualsAndHashCode(callSuper = false, of="id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto extends AbstractIdEntity {

    String id;
    String email;
    String userNickname;
    String password;
    String address;
    String role;
    Boolean is_available;
}
