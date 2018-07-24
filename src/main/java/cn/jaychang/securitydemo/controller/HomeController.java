package cn.jaychang.securitydemo.controller;

import cn.jaychang.securitydemo.vo.MsgVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.controller
 * @description TODO
 * @create 2018-07-24 18:25
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/index"})
    public String index(Model model) {
        MsgVO msg = new MsgVO("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }
}
