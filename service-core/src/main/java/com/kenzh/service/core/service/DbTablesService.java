package com.kenzh.service.core.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 类描述:
 * 获取数据库所有的表信息
 *
 * @author zhaoxuan
 * @create 2018-07-03 23:19
 */
public interface DbTablesService {

    /**
     * 获取数据库所有的表信息
     * @param dbName
     * @return
     */
    List<Map<String, Object>> getAllTables(String dbName);
}