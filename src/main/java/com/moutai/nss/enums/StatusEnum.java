package com.moutai.nss.enums;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/12 21:43
 */
public enum StatusEnum {

    SUCCESS(1, "操作成功"),
    FAIL(0, "操作失败"),
    SYS_ERROR(-1, "系统异常"),
    NO_AUTHORITY(-2, "权限受限");

    private int status;

    private String statusInfo;

    private StatusEnum(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public static StatusEnum statusOf(int index) {
        for (StatusEnum status : values()) {
            if (status.getStatus() == index) {
                return status;
            }
        }
        return null;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

}
