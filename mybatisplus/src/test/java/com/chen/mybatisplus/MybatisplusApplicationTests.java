package com.chen.mybatisplus;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.chen.mybatisplus.entity.Address;
import com.chen.mybatisplus.entity.Hospital;
import com.chen.mybatisplus.entity.User;
import com.chen.mybatisplus.entity.enums.GradeEnum;
import com.chen.mybatisplus.service.IHospitalService;
import com.chen.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private IUserService userService;

    @Autowired
    private IHospitalService hospitalService;

    @Test
    @DS("slave_1")
    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);

        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

    @Test
    @DS("slave_1")
    public void testInsert() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
        User user = new User();
        user.setAge(10);
        user.setEmail("aaa.@com");
        user.setGrade(GradeEnum.SECONDARY);
        user.setName("张三那");
        userService.save(user);
    }

    /**
     * 测试级联查询，包含一对一、一对多
     */
    @Test
    public void testAssociationQuery() {
        Hospital hospital = hospitalService.findHospitalsById(20L);
        System.out.println(hospital);
    }

    /**
     * cascade delete
     */
    @Test
    public void testCascadeDelete() {
        hospitalService.cascadeDelete(20L);
    }

    /**
     * cascade add
     */
    @Test
    public void testCascadeAdd() {
        Hospital hospital = new Hospital();
        hospital.setHospitalName("医院名字");
        Address address = new Address();
        address.setAddressName("测试地址");
        hospital.setAddress(address);
        hospitalService.save(hospital);
    }
}
