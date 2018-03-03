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

    private Long artivityId;

    private String remark;

    private Date createTime;

    private Integer deleteFlag;

    public SaleRecord() {
    }

    public SaleRecord(String customer, String idCard, Long companyId, String companyShortName, Long artivityId) {
        this.customer = customer;
        this.idCard = idCard;
        this.companyId = companyId;
        this.companyShortName = companyShortName;
        this.artivityId = artivityId;
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

    public Long getArtivityId() {
        return artivityId;
    }

    public void setArtivityId(Long artivityId) {
        this.artivityId = artivityId;
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
                ", artivityId=" + artivityId +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

}
