package cn.jaychang.securitydemo.dao;

import cn.jaychang.securitydemo.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.dao
 * @description TODO
 * @create 2018-07-24 15:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositoryTest {
    @Autowired
    SysUserRepository sysUserRepository;

    @Test
    public void findOne(){
        SysUser sysUser = sysUserRepository.findOne(1L);
        System.out.println(sysUser);
    }
}