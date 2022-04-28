package com.master2334.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.master2334.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {


    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIDs(int limit);

    List<Tag> findTagsByTagIDs(List<Long> tagIDs);
}

