package cn.jaychang.securitydemo.config;

import cn.jaychang.securitydemo.security.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.config
 * @description TODO
 * @create 2018-07-24 18:05
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserService customUserService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/index").failureUrl("/login?error").permitAll()
                // 开启cookie保存用户数据
                .and().rememberMe()
                // 设置cookie有效期7天
                .tokenValiditySeconds(60 * 60 * 24 * 7)
                // 设置cookie私钥
                .key("zc-u-key")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll();
    }
}
