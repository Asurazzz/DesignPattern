package com.ymj.pattern.code07_template.jdbc;

import java.sql.ResultSet;

/**
 * @Classname RowMapper
 * @Description TODO
 * @Date 2021/6/17 9:54
 * @Created by yemingjie
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
