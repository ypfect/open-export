package com.overstar.open.export.controller;

import com.alibaba.fastjson.JSON;
import com.overstar.core.vo.Result;
import com.overstar.order.export.api.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/10/21 15:05
 */
@RestController
@Slf4j
public class OrderController {

    @Reference
    private IOrderService orderService;

    @RequestMapping("/create")
    public Result createOrder(){
        Result ret = orderService.create(null, null, null);
        log.info("order create result = {}", JSON.toJSONString(ret));
        return ret;
    }
}
