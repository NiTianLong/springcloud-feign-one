package com.longe.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROVIDER-SERVICE")
public interface ProviderService {

    /**
     * @FeignClient(value = "PROVIDER-SERVICE") 和 @RequestMapping("provider")
     * 唯一确定了是请求 provider模块中的provider接口。
     * @return
     */
    @RequestMapping("provider")
    public String requestProviderService();
}
