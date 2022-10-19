package br.com.marcelo.redesocial.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor
public class User {

    @Id
    private String username;

    private String email;
    private String password;
    private Boolean enabled;

    @OneToMany
    private List<Post> posts;

    @Transient
    private Set<Skill> skills;

    private void addSkill(Skill skill) {
        List<String> skillnames = skills
                .stream()
                .map(s -> s.getSkillName())
                .collect(Collectors.toList());


    }

}
