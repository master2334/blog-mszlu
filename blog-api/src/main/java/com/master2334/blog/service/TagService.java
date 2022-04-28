package com.master2334.blog.service;

import com.master2334.blog.dao.pojo.Tag;
import com.master2334.blog.vo.TagVo;

import java.util.List;

public interface TagService {


    List<TagVo> findTagsByArticleId(Long id);
}


