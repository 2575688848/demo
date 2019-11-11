package com.example.demo.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 * 服务器端推送技术SSE演示控制器
 *
 * @author ZhangCheng
 * @version V1.0
 * @date 2017-04-04
 */
@Controller
public class SseController {

    /**
     * // 注意，这里使用输出的媒体类型为 text/event-stream，这是服务器端SSE的支持，本例演示每5秒钟向浏览器推送随机消息。
     *
     * @param response
     * @return
     */
    @RequestMapping(value = "/push", produces = "text/event-stream;charset=UTF-8")
    @ResponseBody
    public String push(HttpServletResponse response) {
        Random random = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + random.nextInt() + "\n\n";
    }

    @GetMapping("/sse")
    public String push() {
        return "sse";
    }
}
