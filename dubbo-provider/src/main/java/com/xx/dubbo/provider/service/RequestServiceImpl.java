package com.xx.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xx.dubbo.api.RequestService;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-29 17:54
 * @since 1.0
 */
@Service(version = "${request.service.version}")
public class RequestServiceImpl implements RequestService {

    /**
     * 打印请求相关信息
     *
     * @param map 请求相关信息
     * @return 请求相关信息
     */
    @Override
    public String printRequestMessage(HashMap<String, String> map) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" : ").append(entry.getValue()).append(" ");
        }
        return builder.toString();
    }
}
