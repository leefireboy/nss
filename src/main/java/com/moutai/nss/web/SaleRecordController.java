package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.service.SaleRecordService;
import com.moutai.nss.web.vo.SaleRecordParams;
import com.moutai.nss.web.vo.SaleRecordQueryParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/2 23:26
 */
@RestController
public class SaleRecordController extends BaseController {

    @Autowired
    private SaleRecordService saleRecordService;

    /**
     * 跳转到新增消费记录表单页
     * @return
     */
    @RequestMapping(value = "/saleRecordForm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mv = new ModelAndView("addSalerecord");
        return addBaseAttribute(mv);
    }

    /**
     * 新增消费记录
     * @param params
     * @return
     */
    @RequestMapping(value = "/saleRecord", method = RequestMethod.POST)
    public ModelAndView add(SaleRecordParams params) {
        ModelAndView mv = new ModelAndView("addSalerecord");
        mv.addObject("status", saleRecordService.save(params).getStatusInfo());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/saleRecord/{id}", method = RequestMethod.DELETE)
    public ModelAndView remove(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", saleRecordService.remove(id).getStatusInfo());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/saleRecord", method = RequestMethod.PUT)
    public ModelAndView modify(SaleRecordParams params) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", saleRecordService.modify(params).getStatusInfo());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/saleRecord/{id}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("saleRecord", saleRecordService.detail(id));
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "saleRecord/list", method = RequestMethod.GET)
    public ModelAndView list(SaleRecordQueryParams params) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("list", saleRecordService.queryByParams(params));
        return addBaseAttribute(mv);
    }

}
