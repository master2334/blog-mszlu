package com.master2334.blog.service;

import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.params.CommentParam;

public interface CommentsService {
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
