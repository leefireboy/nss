package com.moutai.nss.web.vo;

/**
 * @Description: 新增销售记录参数
 * @Auther: LEE
 * @Date: Create in 2018/3/3 9:29
 */
public class SaleRecordParams {

    private String customer;

    private String idCard;

    private String mobilePhone;

    private Long companyId;

    private String companyShortName;

    private Long activityId;

    private String remark;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SaleRecordParams{" +
                "customer='" + customer + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", companyId=" + companyId +
                ", companyShortName='" + companyShortName + '\'' +
                ", activityId=" + activityId +
                ", remark='" + remark + '\'' +
                '}';
    }

}
