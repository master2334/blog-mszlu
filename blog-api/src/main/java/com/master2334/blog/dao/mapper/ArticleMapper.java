package com.master2334.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.master2334.blog.dao.Archives;
import com.master2334.blog.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {


//    List<Archives> listArchives();
//
//
//    IPage<Article> listArticle(Page<Article> page,
//                               Long categoryId,
//                               Long tagId,
//                               String year,
//                               String month);
}

