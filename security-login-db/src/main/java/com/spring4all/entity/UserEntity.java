package com.spring4all.entity;

import lombok.Data;

@Data public class UserEntity
{

    private Long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 权限
     */
    private String roles;

    public Long getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getRoles()
    {
        return roles;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public void setRoles(String roles)
    {
        this.roles = roles;
    }
}
