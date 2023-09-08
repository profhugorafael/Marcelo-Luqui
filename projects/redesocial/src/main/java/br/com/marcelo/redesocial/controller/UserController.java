package br.com.marcelo.redesocial.controller;

import br.com.marcelo.redesocial.controller.dto.UserDTO;
import br.com.marcelo.redesocial.controller.dto.UserFormDTO;
import br.com.marcelo.redesocial.entity.User;
import br.com.marcelo.redesocial.service.UserService;
import br.com.marcelo.redesocial.service.exceptions.UserNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/0.0.1/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> users = userService
                .findAll()
                .stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserDTO> findByUsername(@PathVariable String username) {

        User user = null;

        try {
            user = userService.findByUsername(username);
        } catch (UserNotFoundException notFoundException) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(new UserDTO(user));
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserFormDTO userDTO) {
        User registeredUser = userService.register(userDTO);
        return ResponseEntity.accepted().body(new UserDTO(registeredUser));
    }


}
