package com.master2334.blog.service;

import com.master2334.blog.vo.ArticleVo;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.params.ArticleParam;
import com.master2334.blog.vo.params.PageParams;

import java.util.List;

public interface ArticleService {

    Result listArticle(PageParams pageParams);

    List<ArticleVo> listArticlesPage(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticle(int limit);

    Result listArchives();

    Result findArticleById(Long articleId);

    Result publish(ArticleParam articleParam);
}
