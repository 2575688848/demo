package com.example.demo.web;

import com.example.demo.es.ESUserInfoService;
import com.example.demo.es.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ytp
 * @date 2019/08/22
 */
@RestController
public class ElasticSearchController {


    @Autowired
    private ESUserInfoService eSUserInfoService;

    @RequestMapping("/es/{id}")
    public UserInfo queryAccountInfo(@PathVariable("id") String id) {
        return eSUserInfoService.queryUserInfoById(id);
    }

    @RequestMapping("/es/query/{userName}")
    public UserInfo queryAccountInfoByAccountName(@PathVariable("userName") String userName) {
        UserInfo userInfo = eSUserInfoService.queryUserInfoByUserName(userName);
        return userInfo;
    }

    @RequestMapping("/es/save")
    public String save(UserInfo accountInfo) {
        eSUserInfoService.save(accountInfo);
        return "ddd";
    }
}
