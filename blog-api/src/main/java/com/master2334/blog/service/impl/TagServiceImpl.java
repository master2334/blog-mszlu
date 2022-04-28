package com.master2334.blog.service.impl;

import com.master2334.blog.dao.mapper.TagMapper;
import com.master2334.blog.dao.pojo.Tag;
import com.master2334.blog.service.TagService;
import com.master2334.blog.vo.Result;
import com.master2334.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;

    /**
     * ms_article_tag是文章和标签的关联表
     * ms_tag为单纯的标签的表
     * @param articleId
     * @return
     */

    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        //mybatisplus无法进行多表查询
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copyList(tags);
    }

    @Override
    public Result hots(int limit) {
        List<Long> tagIDs = tagMapper.findHotsTagIDs(limit);
        if(CollectionUtils.isEmpty(tagIDs)){
            return Result.success(Collections.emptyList());
        }

        List<Tag> tagList =  tagMapper.findTagsByTagIDs(tagIDs);
        return Result.success(tagList);
    }

    private List<TagVo> copyList(List<Tag> tagList) {
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;

    }

    private TagVo copy(Tag tag) {
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag, tagVo);
        return tagVo;
    }
}

