package com.chen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.*;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/25 下午1:57
 */
public class Client {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql:///abc123", "root", "123");
    }
}
