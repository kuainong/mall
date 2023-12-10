package com.cn.admin.modules.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.admin.modules.pms.mapper.PmsProductCategoryMapper;
import com.cn.admin.modules.pms.model.PmsProductCategory;
import com.cn.admin.modules.pms.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author JunGan
 * @since 2023-10-28
 */
@Service
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements PmsProductCategoryService {

    @Override
    public Page list(Long parentId, Integer pageNum, Integer pageSize) {
        Page page = new Page<>(pageNum, pageSize);
        QueryWrapper<PmsProductCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(PmsProductCategory::getParentId, parentId);
        return this.page(page, queryWrapper);
    }

    /**
     * Modify nav bar status
     *
     * @param ids
     * @param navStatus
     * @return
     */
    @Override
    public Boolean updateNavStatus(List<Long> ids, Integer navStatus) {
        UpdateWrapper<PmsProductCategory> pmsProductCategoryUpdateWrapper = new UpdateWrapper<>();
        //The column needed to be updated.
        pmsProductCategoryUpdateWrapper.lambda().set(PmsProductCategory::getNavStatus, navStatus)
                //Condition
                .in(PmsProductCategory::getId, ids);
        return this.update(pmsProductCategoryUpdateWrapper);
    }
}
