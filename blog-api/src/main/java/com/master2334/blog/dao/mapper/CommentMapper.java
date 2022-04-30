package com.master2334.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.master2334.blog.dao.pojo.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> commentsByArticleId(Long id);
}
