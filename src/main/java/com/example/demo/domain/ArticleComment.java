package com.example.demo.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article acticle;
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    private String createdBy;
    private String modifiedBy;
}
