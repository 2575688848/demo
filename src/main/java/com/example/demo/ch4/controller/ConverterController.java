package com.example.demo.ch4.controller;

import com.example.demo.ch4.domain.DemoObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义HttpMessageConverter演示控制器
 *
 * @author ZhangCheng
 * @version V1.0
 * @date 2017-04-04
 */
@Controller
@Slf4j
public class ConverterController {

    /**
     * // 指定返回的媒体类型为我们自定义的媒体类型application/x-zccoder
     *
     * @param demoObj
     * @return
     */
    @RequestMapping(value = "/convert", produces = {"application/x-zccoder"})
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj) {
        log.info("DemoObj:id={},name={}", demoObj.getId(), demoObj.getName());
        log.debug("==========>convert<==========");

        return demoObj;
    }

//    @RequestMapping(value = "/converter", method = RequestMethod.GET)
//    public String convert() {
//        return "converter";
//    }

}
