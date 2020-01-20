package com.mocadev.springbootboard.web.dto;

import com.mocadev.springbootboard.domain.posts.Posts;
import java.time.LocalDateTime;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-20
 */
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate();
        this.modifiedDate = entity.getModifiedDate();
    }

}
