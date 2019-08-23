package com.example.demo.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ESUserInfoService implements EsService{

    @Autowired
    private ESUserInfoRepository eSUserInfoRepository;

    @Override
    public UserInfo queryUserInfoById(String id) {
        return eSUserInfoRepository.findById(id).get();
    }

    @Override
    public UserInfo queryUserInfoByUserName(String userName) {
        return eSUserInfoRepository.findByUserName(userName);
    }

    @Override
    public void save(UserInfo userInfo) {
        eSUserInfoRepository.save(userInfo);
    }
}
