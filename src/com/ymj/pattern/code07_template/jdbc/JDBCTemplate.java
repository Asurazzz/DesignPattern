package com.ymj.pattern.code07_template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname JDBCTemplate
 * @Description
 * 优点：
 *      1、利用模板方法将相同处理逻辑的代码放到抽象父类中，可以提高代码的复用性。
 *      2、将不同的代码不同的子类中，通过对子类的扩展增加新的行为，提高代码的扩展性。
 *      3、把不变的行为写在父类上，去除子类的重复代码，提供了一个很好的代码复用平台， 符合开闭原则。
 * 缺点：
 *      1、类数目的增加，每一个抽象类都需要一个子类来实现，这样导致类的个数增加。
 *      2、类数量的增加，间接地增加了系统实现的复杂度。
 *      3、继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍。
 *          模板方法模式比较简单，相信小伙伴们肯定能学会，也肯定能理解好！只要勤加练习，
 *          多结合业务场景思考问题，就能够把模板方法模式运用好。
 * @Date 2021/6/17 9:55
 * @Created by yemingjie
 */
public abstract class JDBCTemplate {
    private DataSource dataSource;

    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            // 1. 获取连接
            Connection conn = this.getConnection();
            // 2.创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);
            // 3.执行语句集
            ResultSet rs = this.executeQuery(pstm, values);
            // 4.处理结果集
            List<?> result = this.paresResultSet(rs, rowMapper);
            // 5.关闭结果集
            this.closeResultSet(rs);
            // 6.关闭语句集
            this.closeStatement(pstm);
            // 7.关闭连接
            this.closeConnection(conn);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected void closeConnection(Connection conn) throws Exception { 
        //数据库连接池，我们不是关闭 
        conn.close(); 
    }
    
    protected void closeStatement(PreparedStatement pstm) throws Exception { 
        pstm.close(); 
    }
    protected void closeResultSet(ResultSet rs) throws Exception { 
        rs.close(); 
    }
    protected List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception { 
        List<Object> result = new ArrayList<Object>(); 
        int rowNum = 1; 
        while (rs.next()){ 
            result.add(rowMapper.mapRow(rs,rowNum ++)); 
        }
        return result; 
    }
    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception { 
        for (int i = 0; i < values.length; i++) { 
            pstm.setObject(i,values[i]); 
        }
        return pstm.executeQuery(); 
    }
    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws Exception { 
        return conn.prepareStatement(sql); 
    }
    public Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
