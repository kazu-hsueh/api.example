package com.example.api.domain.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.validation.constraints.*;

@JsonSerialize
public class UserReq {

    @NotBlank
    private String name;

    private String nickName;

    @NotNull
    @Min(0) @Max(100)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
