package br.com.marcelo.redesocial.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data @NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;
    private String image;
    private Integer likes;

    @ManyToOne @JoinColumn(name = "user_username")
    private User user;

}
