package net.yyh.frame.controller;

import net.yyh.frame.model.Sample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/5.
 */
@RequestMapping(value = "/sample")
@Controller
public class SampleController {

    @RequestMapping("/StringToSample")
    @ResponseBody
    public Sample StringToSample(@RequestParam("sample")Sample sample){
        return sample;
    }
}
