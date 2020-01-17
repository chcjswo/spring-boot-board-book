package com.mocadev.springbootboard.web.controller;

import com.mocadev.springbootboard.domain.posts.Posts;
import com.mocadev.springbootboard.web.dto.PostsSaveRequestDto;
import com.mocadev.springbootboard.web.dto.PostsResponseDto;
import com.mocadev.springbootboard.web.service.PostsService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-16
 */
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @GetMapping("/posts")
    public List<Posts> findAll() {
        return postsService.findAll();
    }

    @PostMapping("/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsSaveRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
