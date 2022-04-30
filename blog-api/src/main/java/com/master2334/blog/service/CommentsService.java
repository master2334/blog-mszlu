package com.master2334.blog.service;

import com.master2334.blog.vo.Result;

public interface CommentsService {
    Result commentsByArticleId(Long id);
}
