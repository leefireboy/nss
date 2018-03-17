package com.moutai.nss.web.vo;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/17 11:14
 */
public class ActivityParams {

    private String name;

    private String time;

    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ActivityParams{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

}
