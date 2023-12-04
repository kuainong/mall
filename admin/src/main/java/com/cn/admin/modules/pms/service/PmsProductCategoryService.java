package com.cn.admin.modules.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.admin.modules.pms.model.PmsProductCategory;
import com.cn.common.api.CommonPage;
import com.cn.common.api.CommonResult;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author JunGan
 * @since 2023-10-28
 */
public interface PmsProductCategoryService extends IService<PmsProductCategory> {

    /**
     *
     * @param parentId
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page list(Long parentId, Integer pageNum, Integer pageSize);
}
