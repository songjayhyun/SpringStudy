package com.example.personal.repository;

import com.example.personal.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testFindById() {
        Optional<Post> postOptional = postRepository.findById(1L);
        postOptional.ifPresent(post -> {
            System.out.println("post" + post.getId() + "/" + post.getTitle() + "/" + post.getContent());
        });
    }

}