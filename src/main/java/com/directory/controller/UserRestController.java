package com.directory.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.directory.model.dto.ErrorMessage;
import com.directory.model.entity.User;
import com.directory.service.user.IUserService;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getUserByUserId(@PathVariable Long userId) {
        Optional<User> userOptional = this.userService.findById(userId);
        if (!userOptional.isPresent()) {
            return new ResponseEntity<>(new ErrorMessage("Tài khoản không tồn tại!"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userOptional.get(), HttpStatus.OK);
    }
}
