package org.shahid.service;

import lombok.AllArgsConstructor;
import org.shahid.converter.UserConverter;
import org.shahid.dto.UserDto;
import org.shahid.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserConverter converter;
    private final UserRepository repository;

    public UserDto getUserById(Integer id){
        return converter.toDto(repository.getReferenceById(id));
    }

    public List<UserDto> getAllUsers(){
        return converter.toDtos(repository.findAll());
    }

    public UserDto createUser(UserDto user){
        return converter.toDto(repository.save(converter.toEntity(user)));
    }

    public UserDto updateUser(Integer userId, UserDto user){
        return converter.toDto(repository.save(converter.toEntity(user)));
    }

    public void deleteUser(Integer id){
        repository.deleteById(id);
    }
}
