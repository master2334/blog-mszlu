package com.master2334.blog.controller;

import com.master2334.blog.service.TagService;
import com.master2334.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Resource
    private TagService tagService;

    @GetMapping("hot")
    public Result hot(){
        int limit = 6;

        return tagService.hots(limit);
    }

    @GetMapping
    public Result findAll(){
        /**
         * 查询所有的文章标签
         * @return
         */
        return tagService.findAll();
    }
}
