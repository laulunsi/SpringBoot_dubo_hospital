package com.jk.model.user;

import java.io.Serializable;
import java.util.Date;

public class UserWeb implements Serializable {

    private static final long serialVersionUID = -5302364446091161813L;
    private Integer userId; 	//主键id

    private String userAccount;	//账号

    private String userPhone;	//电话

    private String userNiki;	//昵称

    private String userPass;	//密码

    private String userHeadId;	//头像id

    private Date loginTime;		//登录时间

    private Date registerTime;	//注册时间

    private Integer userState;	//用户状态

    private Integer userType;	//用户类型 (普通，医生，医院机构)

    private Integer userLevel;	//等级

    private Integer userScore;	//积分

    private Integer userMoney;	//钱

    private Integer infoId;		//详情id(链接不同类型的ID)

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserNiki() {
        return userNiki;
    }

    public void setUserNiki(String userNiki) {
        this.userNiki = userNiki == null ? null : userNiki.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserHeadId() {
        return userHeadId;
    }

    public void setUserHeadId(String userHeadId) {
        this.userHeadId = userHeadId == null ? null : userHeadId.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Integer getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Integer userMoney) {
        this.userMoney = userMoney;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
}