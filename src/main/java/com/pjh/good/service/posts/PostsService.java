package com.pjh.good.service.posts;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pjh.good.domain.posts.PostsRepository;
import com.pjh.good.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;
    
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
