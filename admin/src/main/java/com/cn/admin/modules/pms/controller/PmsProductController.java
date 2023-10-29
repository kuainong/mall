package com.cn.admin.modules.pms.controller;


import com.cn.admin.modules.pms.model.PmsProduct;
import com.cn.admin.modules.pms.service.PmsProductService;
import com.cn.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author JunGan
 * @since 2023-10-28
 */
@RestController
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    PmsProductService productService;

    @RequestMapping("/list")
    public CommonResult<List<PmsProduct>> getAllProduct() {
        return CommonResult.success(productService.list());
    }
}

