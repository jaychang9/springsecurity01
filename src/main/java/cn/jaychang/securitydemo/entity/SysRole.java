package cn.jaychang.securitydemo.entity;

import lombok.Builder;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.entity
 * @description TODO
 * @create 2018-07-24 14:37
 */
@Table(name = "t_sys_role")
@Entity
@Data
@Builder
public class SysRole implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
