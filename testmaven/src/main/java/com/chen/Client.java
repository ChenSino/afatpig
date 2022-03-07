package com.chen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/25 下午1:57
 */
public class Client {
    public static void main(String[] args) {
        Log abc = LogFactory.getLog("abc");
        System.out.println(abc);
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://10.10.102.105:3306/abc123", "root", "sonoscape");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from users");
//            while (resultSet.next()) {
//                String string = resultSet.getString(7);
//                System.out.println(string);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
