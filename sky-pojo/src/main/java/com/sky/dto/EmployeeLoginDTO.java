package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@ApiModel(description = "员工登录时传递的数据模型")
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名")
    @NotEmpty(message = "用户名不可为空！")
    private String username;

    @ApiModelProperty("密码")
    @NotEmpty(message = "密码不可为空！")
    private String password;

}
