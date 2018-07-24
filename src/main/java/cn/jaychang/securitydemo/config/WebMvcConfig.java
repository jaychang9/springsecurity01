package cn.jaychang.securitydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.config
 * @description TODO
 * @create 2018-07-24 18:04
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 直接可以用来做为映射的，这样就不用专门写一个Controller了
        registry.addViewController("/login").setViewName("login");
    }
}
