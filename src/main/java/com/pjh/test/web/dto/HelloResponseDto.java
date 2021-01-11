package com.pjh.test.web.dto;

import lombok.*;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int age;
    
}
