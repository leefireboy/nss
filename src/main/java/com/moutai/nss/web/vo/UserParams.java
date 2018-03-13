package com.moutai.nss.web.vo;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/7 17:51
 */
public class UserParams {

    private Long id;

    private String name;

    private String password;

    private String repeatPassword;

    private Integer sex;

    private String mobilePhone;

    private Integer isManagement;

    private Long companyId;

    private String companyShortName;

    private String remark;

    public UserParams() {
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

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
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

    @Override
    public String toString() {
        return "UserParams{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", repeatPassword='" + repeatPassword + '\'' +
                ", sex=" + sex +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", isManagement=" + isManagement +
                ", companyId=" + companyId +
                ", companyShortName='" + companyShortName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

}
