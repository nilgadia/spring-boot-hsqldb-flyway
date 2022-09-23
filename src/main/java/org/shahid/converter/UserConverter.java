package org.shahid.converter;

import org.mapstruct.Mapper;
import org.shahid.dto.UserDto;
import org.shahid.model.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserConverter {
    User toEntity(UserDto dto);
    UserDto toDto(User entity);
    List<UserDto> toDtos(List<User> entities);
}
