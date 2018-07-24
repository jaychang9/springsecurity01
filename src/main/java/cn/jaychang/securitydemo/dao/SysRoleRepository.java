package cn.jaychang.securitydemo.dao;

import cn.jaychang.securitydemo.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.dao
 * @description TODO
 * @create 2018-07-24 15:06
 */
public interface SysRoleRepository extends JpaRepository<SysRole,Long> {
}
