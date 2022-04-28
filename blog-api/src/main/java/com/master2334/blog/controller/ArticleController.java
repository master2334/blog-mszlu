package com.master2334.blog.controller;

import com.master2334.blog.service.ArticleService;
import com.master2334.blog.vo.ArticleVo;
import com.master2334.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.master2334.blog.vo.params.PageParams;

import javax.annotation.Resource;
import java.util.List;

// json 数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    //Result是统一结果返回
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }

}


