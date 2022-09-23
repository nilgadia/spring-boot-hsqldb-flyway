package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
}
