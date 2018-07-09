package com.kenzh.web.portal.controller;

//import com.kenzh.service.core.db.LayWebProperties;
//import com.kenzh.service.core.service.DbTablesService;
import com.kenzh.web.portal.factory.DefaultTemplateFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述:
 * 自动生成代码控制器
 *
 * @author zhaoxuan
 * @create 2018-07-03 23:05
 */
@Controller
@RequestMapping("/code")
public class AutoGenCodeController {

    private static String PREFIX = "/code";
//    @Value("${spring.datasource.db-name}")
//    private String dbName;

//    @Autowired
//    private DbTablesService dbTablesService;
//
//    @Autowired
//    private LayWebProperties LayWebProperties;
//
//    /**
//     * 跳转到代码生成主页
//     */
//    @RequestMapping("")
//    public String blackboard(Model model) {
//        model.addAttribute("tables", dbTablesService.getAllTables(dbName));
//        model.addAttribute("params", null);
//        model.addAttribute("templates", DefaultTemplateFactory.getDefaultTemplates());
//        return PREFIX + "/code.html";
//    }

}