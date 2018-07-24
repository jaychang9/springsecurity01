package cn.jaychang.securitydemo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author zhangjie
 * @package cn.jaychang.securitydemo.entity
 * @description TODO
 * @create 2018-07-24 14:38
 */
@Table(name = "t_sys_user")
@Entity
public class SysUser implements UserDetails,Serializable{
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.REFRESH})
    @JoinTable(name = "t_sys_user_role", joinColumns = {
            @JoinColumn(name = "sys_user_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "sys_role_id", referencedColumnName = "id")})
    private List<SysRole> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        List<SysRole> roleList = getRoles();
        if(!CollectionUtils.isEmpty(roleList)){
            for(SysRole sysRole : roleList){
                GrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(sysRole.getName());
                grantedAuthorityList.add(simpleGrantedAuthority);
            }
        }
        return grantedAuthorityList;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
