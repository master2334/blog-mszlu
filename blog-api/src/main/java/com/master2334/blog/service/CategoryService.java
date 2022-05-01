package com.master2334.blog.service;

import com.master2334.blog.vo.CategoryVo;
import com.master2334.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result findAllDetailById(Long id);
}
