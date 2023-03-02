package com.citsoft.dao.impl;

import com.citsoft.pojo.Student;
import com.citsoft.pojo.User;
import com.citsoft.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 执行dml语句
     * 返回值为改变的行数
     * 如果返回-1说明执行失败
     */
    public int update(String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            int update = queryRunner.update(connection, sql, args);
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 查询返回一条javaBean的sql语句
     * @param sql
     * @param type
     * @param args
     * @param <T>
     * @return
     */
    public <T> Object queryForOne(String sql, Class<T> type, Object... args) {
        Connection connection = JDBCUtils.getConnection();

        try {
            return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection);
        }
        return null;
    }

    /**
     * 执行一行一列的sql语句
     * @param sql
     * @param args
     * @return
     */
    public Object queryForSingleValue(String sql, Object... args) {
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> queryUser() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT * FROM t_user";
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> queryStudent() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT * FROM t_student";
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<Student>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
