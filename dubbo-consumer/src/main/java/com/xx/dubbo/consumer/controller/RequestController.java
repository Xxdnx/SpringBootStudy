package com.xx.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xx.dubbo.api.RequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-29 19:16
 * @since 1.0
 */
@RestController
public class RequestController {

    @Reference(version = "${request.service.version}")
    private RequestService requestService;

    @RequestMapping("/api/args")
    public String printRequestMessage(HttpServletRequest request) {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", request.getRequestURI());
        map.put("method", request.getMethod());
        map.put("host", request.getRemoteHost());
        map.put("address", request.getRemoteAddr());
        map.put("port", String.valueOf(request.getRemotePort()));
        return requestService.printRequestMessage(map);
    }
}
