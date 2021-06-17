package com.ymj.pattern.code07_template.jdbc;

import java.util.List;

/**
 * @Classname MemberDaoTest
 * @Description TODO
 * @Date 2021/6/17 10:05
 * @Created by yemingjie
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
