package com.mocadev.springbootboard.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mocadev.springbootboard.domain.posts.Posts;
import com.mocadev.springbootboard.domain.posts.PostsRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PostsRepositoryTest {

	@Autowired
    PostsRepository postsRepository;

	@AfterEach
	void cleanup() {
		//postsRepository.deleteAll();
	}

	@Test
	@DisplayName("게시글저장 불러오기")
	void selectBoard() {
		// given
		String title = "테스트 게시글";
		String content = "테스트 본문";

		postsRepository.save(Posts.builder()
								.title(title)
								.content(content)
								.author("chcjswo")
								.build());

		// when
		List<Posts> postsList = postsRepository.findAll();

		// then
		Posts posts = postsList.get(0);
		assertThat(posts.getTitle()).isEqualTo(title);
		assertThat(posts.getContent()).isEqualTo(content);
	}


    @Test
    public void BaseTimeEntity_등록() {
        //given
        LocalDateTime now = LocalDateTime.of(2020, 1, 17, 0, 0, 0);
        postsRepository.save(Posts.builder()
            .title("title")
            .content("content")
            .author("author")
            .build());
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>>> createDate=" + posts.getCreatedDate() + ", modifiedDate=" + posts.getModifiedDate());

        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }
}
