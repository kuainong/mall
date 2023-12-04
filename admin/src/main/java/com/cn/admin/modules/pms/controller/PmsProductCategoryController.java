package com.cn.admin.modules.pms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cn.admin.modules.pms.model.PmsProductCategory;
import com.cn.admin.modules.pms.service.PmsProductCategoryService;
import com.cn.common.api.CommonPage;
import com.cn.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 产品分类 前端控制器
 * </p>
 *
 * @author JunGan
 * @since 2023-10-28
 */
@RestController
@RequestMapping("/pms/pmsProductCategory")
public class PmsProductCategoryController {
    @Autowired
    PmsProductCategoryService productCategoryService;

    @RequestMapping(value = "/list/{parentId}", method = RequestMethod.GET)
    public CommonResult<CommonPage<PmsProductCategory>> getList(@PathVariable Long parentId,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page result = productCategoryService.list(parentId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(result));
    }
}

