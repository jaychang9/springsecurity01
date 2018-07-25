package cn.jaychang.securitydemo.security;

import cn.jaychang.securitydemo.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.security
 * @description 自定义登出成功处理器
 * @create 2018-07-25 08:04
 */
@Slf4j
@Component
public class CustomLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler{

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        final String refererUrl = request.getHeader("Referer");
        log.debug("Logout from: " + refererUrl);
        Object principal = authentication.getPrincipal();
        log.debug("principal:{}",((SysUser)principal).toString());
        super.onLogoutSuccess(request, response, authentication);
    }
}
