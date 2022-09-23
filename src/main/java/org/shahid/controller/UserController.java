package org.shahid.controller;

import lombok.AllArgsConstructor;
import org.shahid.dto.UserDto;
import org.shahid.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService service;

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable(name = "id") Integer id){
        return service.getUserById(id);
    }
    @GetMapping()
    public List<UserDto> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping()
    public UserDto addUser(@RequestBody UserDto userDto){
        return service.createUser(userDto);
    }

    @PutMapping("/{id}")
    public UserDto addUser(@PathVariable(name = "id") Integer id,@RequestBody UserDto userDto){
        return service.updateUser(id,userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(name = "id") Integer id){
        service.deleteUser(id);
    }

}
