package com.xx.web.server.controller;

import com.xx.web.server.bean.RequestMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-29 16:22
 * @since 1.0
 */
@RestController
public class ApiController {

    @RequestMapping("/api/args")
    public RequestMessage printRequestArgs(HttpServletRequest request) {
        RequestMessage requestMessage = new RequestMessage(request.getRequestURI(),
                                                    request.getMethod(),
                                                    request.getRemoteHost(),
                                                    request.getRemoteAddr(),
                                                    request.getRemotePort());
        System.out.println(requestMessage.toString());
        return requestMessage;
    }

}
