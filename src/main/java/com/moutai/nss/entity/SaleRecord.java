package com.moutai.nss.entity;

import java.util.Date;

/**
 * @Description: 销售记录
 * @Auther: LEE
 * @Date: Create in 2018/2/25 9:28
 */
public class SaleRecord {

    private Long id;

    private String customer;

    private String idCard;

    private String mobilePhone;

    private Long companyId;

    private String companyShortName;

    private Long activityId;

    private String remark;

    private Long createId;

    private Date createTime;

    private Long modifyId;

    private Date modifyTime;

    private Integer deleteFlag;

    public SaleRecord() {
    }

    public SaleRecord(String customer, String idCard, Long companyId, String companyShortName, Long activityId) {
        this.customer = customer;
        this.idCard = idCard;
        this.companyId = companyId;
        this.companyShortName = companyShortName;
        this.activityId = activityId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyId() {
        return modifyId;
    }

    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
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
    public String toString() {
        return "SaleRecord{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", companyId=" + companyId +
                ", companyShortName='" + companyShortName + '\'' +
                ", activityId=" + activityId +
                ", remark='" + remark + '\'' +
                ", createId=" + createId +
                ", createTime=" + createTime +
                ", modifyId=" + modifyId +
                ", modifyTime=" + modifyTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

}
