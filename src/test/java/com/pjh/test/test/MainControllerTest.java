package com.pjh.test.test;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.pjh.good.web.MainController;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello_return() throws Exception {
        String hello = "Hello";

        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
    }

    @Test
    public void helloDto_return() throws Exception {
        String name = "중호";
        int age = 27;

        mvc.perform(get("/hello/dto").param("name", name).param("age", String.valueOf(age)))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name", is(name))) //json 응답값을 필드별로 검증할수있는 메소드
            .andExpect(jsonPath("$.age", is(age)));

    }
}
