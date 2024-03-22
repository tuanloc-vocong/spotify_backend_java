package com.tuanloc.spotify.core.controller;

import com.tuanloc.spotify.core.business.abstracts.UserService;
import com.tuanloc.spotify.core.entities.User;
import com.tuanloc.spotify.core.utilities.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public DataResult<User> getById(@PathVariable int id){
        return userService.getById(id);
    }
}
