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

    private Integer sex;

    private String mobilePhone;

    private Integer isManagement;

    private Long companyId;

    private String companyName;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    private Integer deleteFlag;


    public User() {
    }

    public User(String name, Integer sex, Long companyId, String companyName) {
        this.name = name;
        this.sex = sex;
        this.companyId = companyId;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(user.mobilePhone) : user.mobilePhone != null) return false;
        if (companyId != null ? !companyId.equals(user.companyId) : user.companyId != null) return false;
        return companyName != null ? companyName.equals(user.companyName) : user.companyName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", isManagement=" + isManagement +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

}
