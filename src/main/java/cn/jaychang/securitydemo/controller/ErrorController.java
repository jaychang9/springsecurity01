package cn.jaychang.securitydemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import javax.servlet.RequestDispatcher;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.controller
 * @description 覆盖spring boot默认的错误处理
 * @create 2018-07-25 09:05
 */
@Controller
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController{

    @RequestMapping("/error")
    public String error(){
        Object errorCodeObj = RequestContextHolder.currentRequestAttributes().getAttribute(RequestDispatcher.ERROR_STATUS_CODE, RequestAttributes.SCOPE_REQUEST);
        Integer errorCode = Integer.valueOf(errorCodeObj.toString());
        if(HttpStatus.NOT_FOUND.value() == errorCode.intValue()){
            return "error_404";
        }
        if(HttpStatus.UNAUTHORIZED.value() == errorCode.intValue()){
            return "error_401";
        }
        if(HttpStatus.BAD_REQUEST.value() == errorCode.intValue()){
            return "error_400";
        }
        if(HttpStatus.INTERNAL_SERVER_ERROR.value() == errorCode.intValue()){
            return "error_500";
        }
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
