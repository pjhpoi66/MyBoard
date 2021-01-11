package com.pjh.test.domain.posts;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pjh.good.domain.posts.Posts;
import com.pjh.good.domain.posts.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After // 단위 테스트후 실행되는 메소드를 지정
    public void cleanUp() {
        postsRepository.deleteAll();
    }

    @Test
    public void boardSave_Load() {

        String title = "테스트 제목";
        String content = "테스트 내용";

        postsRepository.save(Posts.builder().title(title).content(content).author("pjhpoi66").build());

        // when
        List<Posts> postslist = postsRepository.findAll();
        Posts posts = postslist.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
