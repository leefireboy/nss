package com.moutai.nss.web.vo;

import java.util.Date;

/**
 * @Description: 销售记录查询参数
 * @Auther: LEE
 * @Date: Create in 2018/2/28 0:05
 */
public class SaleRecordQueryParams {

    private Long activityId;

    private String customer;

    private String idCard;

    private String mobilePhone;

    private Long companyId;

    private Date startTime;

    private Date endTime;

    private Integer pageNo;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "SaleRecordQueryParams{" +
                "activityId=" + activityId +
                ", customer='" + customer + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", companyId=" + companyId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", pageNo=" + pageNo +
                '}';
    }

}
