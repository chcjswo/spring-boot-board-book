package com.mocadev.springbootboard.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-26
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
