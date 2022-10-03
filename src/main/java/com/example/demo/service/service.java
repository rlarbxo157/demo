package com.example.demo.service;

import com.example.demo.domain.Article;
import java.util.List;


public interface service {
    List<Article> getArticle() throws Exception;
    void postArticle(Article article) throws Exception;
    void deleteArticle(Long Id) throws Exception;
}
