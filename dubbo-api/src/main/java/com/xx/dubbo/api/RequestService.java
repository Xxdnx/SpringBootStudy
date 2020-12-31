package com.xx.dubbo.api;

import java.util.HashMap;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-29 17:11
 * @since 1.0
 */
public interface RequestService {

    /**
     * 打印请求相关信息
     *
     * @param map 请求相关信息
     * @return 请求相关信息
     */
    String printRequestMessage(HashMap<String, String> map);

}
