package com.pjh.good.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pjh.good.service.posts.PostsService;
import com.pjh.good.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsService postService;
    
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        return postService.save(postsSaveRequestDto);
    }
}
