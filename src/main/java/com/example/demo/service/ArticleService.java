package com.example.demo.service;

import com.example.demo.domain.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements service {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getArticle() throws Exception {
        return articleRepository.findAll();
    }

    @Override
    public void postArticle(Article article) throws Exception {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Long Id) throws Exception {
        articleRepository.deleteById((Id));
    }
}
