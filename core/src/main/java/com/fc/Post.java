package com.fc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
public class Post {
    private Long id;
    private Long userId;
    private String imageUrl;
    private String content;

}
