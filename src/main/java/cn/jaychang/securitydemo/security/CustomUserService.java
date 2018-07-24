package cn.jaychang.securitydemo.security;

import cn.jaychang.securitydemo.dao.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.service
 * @description TODO
 * @create 2018-07-24 17:23
 */
@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return sysUserRepository.findByUsername(username);
    }
}
