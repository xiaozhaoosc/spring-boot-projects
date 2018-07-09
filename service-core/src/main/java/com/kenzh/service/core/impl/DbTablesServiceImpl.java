package com.kenzh.service.core.impl;

import com.baomidou.mybatisplus.mapper.SqlRunner;
import com.kenzh.service.core.service.DbTablesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 类描述:
 * 获取数据库表信息的实现类
 *
 * @author zhaoxuan
 * @create 2018-07-03 23:22
 */
@Service
public class DbTablesServiceImpl implements DbTablesService {

    /**
     * 获取数据库所有的表信息
     *
     * @param dbName
     * @return
     */
    @Override
    public List<Map<String, Object>> getAllTables(String dbName) {
        String sql = "select TABLE_NAME as tableName,TABLE_COMMENT as tableComment from information_schema.`TABLES` where TABLE_SCHEMA = '" + dbName + "'";
        return SqlRunner.db().selectList(sql);
    }
}