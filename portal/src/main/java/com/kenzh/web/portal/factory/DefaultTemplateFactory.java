package com.kenzh.web.portal.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类描述:
 * 模板种类构建器
 *
 * @author zhaoxuan
 * @create 2018-07-03 23:41
 */
public class DefaultTemplateFactory {

    /**
     * 获取所有的模板种类
     */
    public static List<Map<String,Object>> getDefaultTemplates(){
        ArrayList<Map<String, Object>> templates = new ArrayList<>();
        templates.add(create("controllerSwitch","controller-控制器模板"));
        templates.add(create("entitySwitch","entity-实体模板"));
        templates.add(create("serviceSwitch","service-service模板"));
        templates.add(create("daoSwitch","dao-dao模板"));
        templates.add(create("indexPageSwitch","indexPage-首页模板"));
        templates.add(create("addPageSwitch","addPage-添加页面模板"));
        templates.add(create("editPageSwitch","editPage-编辑页面模板"));
        templates.add(create("jsSwitch","indexJs-主页js模板"));
        templates.add(create("infoJsSwitch","infoJs-详情页js模板"));
        templates.add(create("sqlSwitch","sql-sql语句模板"));
        return templates;
    }


    private static Map<String,Object> create(String key,String desc){
        HashMap<String, Object> template = new HashMap<>();
        template.put("key",key);
        template.put("desc",desc);
        return template;
    }
}