package com.citsoft.test;

import com.citsoft.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class JDBCUtilsTest {
    @Test
    public void testJDBCUtils() {

        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
        JDBCUtils.close(connection);
    }
}
