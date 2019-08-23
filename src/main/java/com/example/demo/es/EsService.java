package com.example.demo.es;

public interface EsService {

     UserInfo queryUserInfoById(String id);

     UserInfo queryUserInfoByUserName(String userName);

     void save(UserInfo userInfo);
}
