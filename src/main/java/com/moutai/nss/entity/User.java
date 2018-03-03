package com.moutai.nss.entity;

import java.util.Date;

/**
 * @Description: 用户
 * @Auther: LEE
 * @Date: Create in 2018/2/24 1:06
 */
public class User {

    private Long id;

    private String name;

    private String password;

    private Integer sex;

    private String mobilePhone;

    private Integer isManagement;

    private Long companyId;

    private String companyShortName;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    private Integer deleteFlag;


    public User() {
    }

    public User(String name, Integer sex, Long companyId, String companyShortName) {
        this.name = name;
        this.sex = sex;
        this.companyId = companyId;
        this.companyShortName = companyShortName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getIsManagement() {
        return isManagement;
    }

    public void setIsManagement(Integer isManagement) {
        this.isManagement = isManagement;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(user.mobilePhone) : user.mobilePhone != null) return false;
        return companyId != null ? companyId.equals(user.companyId) : user.companyId == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", isManagement=" + isManagement +
                ", companyId=" + companyId +
                ", companyShortName='" + companyShortName + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

}
