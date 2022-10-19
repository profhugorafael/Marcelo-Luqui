package br.com.marcelo.redesocial.service;

import br.com.marcelo.redesocial.controller.dto.UserFormDTO;
import br.com.marcelo.redesocial.entity.User;
import br.com.marcelo.redesocial.repository.UserRepository;
import br.com.marcelo.redesocial.service.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByUsername(String username) throws UserNotFoundException {
        return userRepository
                .findById(username)
                .orElseThrow(() -> new UserNotFoundException("usuario nao cadastrado"));
    }

    public User register(UserFormDTO userDTO) {
        User user = userDTO.toUser();
        return userRepository.save(user);
    }
}
