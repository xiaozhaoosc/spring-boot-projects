package com.kenzh.web.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 类描述:
 * 登陆接口
 *
 * @author zhaoxuan
 * @create 2018-07-09 15:25
 */
@RestController
public class LoginController {


    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping("/login")
    public Object index(HttpServletRequest req, HttpServletResponse res, String username, String userpass, String codein) {
        res.setHeader("Access-Control-Allow-Origin","*");
        Map user = new HashMap();
        user.put("access_token", "649cb7cb-e8f7-42c1-bbc8-80e682d6e573");
        user.put("token_type", "bearer");
        user.put("refresh_token", "286ee692-eb30-42ad-86df-14024a28f296");
        user.put("expires_in", "43199");
        user.put("scope", "select");
        if ("admin".equals(username)) {
            return user;
        }else{
            user.put("access_token", null);
            return user;
        }
    }
}