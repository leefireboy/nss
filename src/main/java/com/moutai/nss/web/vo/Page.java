package com.moutai.nss.web.vo;

/**
 * @Description: 分页数据
 * @Auther: LEE
 * @Date: Create in 2018/3/6 0:26
 */
public class Page {

    public final static Integer DEFAULT_PAGE_NO = 10;

    /**
     * 页数
     */
    private Integer pageNo;

    /**
     * 每页数据数
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer pageTotal;

    public Page() {
    }

    public Page(Integer pageNo) {
        this(pageNo, null);
    }

    public Page(Integer pageNo, Integer pageTotal) {
        this(pageNo, DEFAULT_PAGE_NO, pageTotal);
    }

    public Page(Integer pageNo, Integer pageSize, Integer pageTotal) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageTotal = pageTotal;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", pageTotal=" + pageTotal +
                '}';
    }

}
