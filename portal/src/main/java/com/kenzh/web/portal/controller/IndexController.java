package com.kenzh.web.portal.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述:
 * 首页
 *
 * @author zhaoxuan
 * @create 2018-07-02 20:52
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/index/index.html";
    }


    @RequestMapping(path = "/heartbeat", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String heartbeat() {
        return "ok";
    }

}