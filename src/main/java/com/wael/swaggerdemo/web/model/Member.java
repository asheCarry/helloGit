package com.wael.swaggerdemo.web.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("member会员说明")
public class Member {
    @ApiModelProperty("名字")
    String firstName;
    @ApiModelProperty("姓氏")
    String lastName;
    /**
     * 状态 可为空属性，仅当 equals ok时 代表系统认可
     */
    @ApiModelProperty(value = "缺省参数，无需用户提供",hidden = true)
    String status;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public Member setStatus(String status) {
        this.status = status;
        return this;
    }

    public Member() {
    }
}
