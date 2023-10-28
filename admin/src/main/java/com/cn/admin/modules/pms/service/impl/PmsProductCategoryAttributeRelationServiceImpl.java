package com.cn.admin.modules.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cn.admin.modules.pms.mapper.PmsProductCategoryAttributeRelationMapper;
import com.cn.admin.modules.pms.model.PmsProductCategoryAttributeRelation;
import com.cn.admin.modules.pms.service.PmsProductCategoryAttributeRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author JunGan
 * @since 2023-10-28
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

}
