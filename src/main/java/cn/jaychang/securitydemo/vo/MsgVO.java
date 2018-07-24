package cn.jaychang.securitydemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.vo
 * @description TODO
 * @create 2018-07-24 18:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MsgVO {
    private String title;
    private String content;
    private String extraInfo;
}

