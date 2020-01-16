package com.mocadev.springbootboard.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-15
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}