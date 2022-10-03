package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/articles")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getArticle() throws Exception {
        List<Article> article = articleService.getArticle();
        return ResponseEntity.ok(article);
    }

    @PostMapping
    public ResponseEntity<String> postArticle(@RequestBody Article article) throws Exception {
        articleService.postArticle(article);
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
}
