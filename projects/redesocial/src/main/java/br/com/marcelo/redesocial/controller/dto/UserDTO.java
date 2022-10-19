package br.com.marcelo.redesocial.controller.dto;

import br.com.marcelo.redesocial.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {

    private String username;
    private String email;
    private Boolean enabled;

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.enabled = user.getEnabled();
    }

}
