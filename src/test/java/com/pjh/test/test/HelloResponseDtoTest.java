package com.pjh.test.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.pjh.test.web.dto.HelloResponseDto;

public class HelloResponseDtoTest {

    @Test
    public void lombok_Test() {
        //given
        String name = "test";
        int age = 27;
        
        //when
        HelloResponseDto dto = new HelloResponseDto(name, age);
        
        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAge()).isEqualTo(age);
    }
}
