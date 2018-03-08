package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.service.SaleRecordService;
import com.moutai.nss.web.vo.SaleRecordAddParams;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ModelAndView add(SaleRecordAddParams params) {
        ModelAndView mv = new ModelAndView("addSalerecord");
        mv.addObject("status", saleRecordService.save(params).getStatusInfo());
        return addBaseAttribute(mv);
    }

}
