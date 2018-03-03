package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.service.SaleRecordService;
import com.moutai.nss.web.vo.SaleRecordAddParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SaleRecordService saleRecordService;

    @RequestMapping(value = "/saleRecord", method = RequestMethod.POST)
    public ModelAndView addSaleRecord(SaleRecordAddParams params) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", saleRecordService.save(params).getStatusInfo());
        return mv;
    }

}