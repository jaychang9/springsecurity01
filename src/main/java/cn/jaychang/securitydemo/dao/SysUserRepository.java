package cn.jaychang.securitydemo.dao;

import cn.jaychang.securitydemo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.dao
 * @description TODO
 * @create 2018-07-24 15:04
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
