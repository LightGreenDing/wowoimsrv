package com.wowokuaiyun.wowoimsrv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author DingJie on 2018/11/26
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "测试";
    }
}
