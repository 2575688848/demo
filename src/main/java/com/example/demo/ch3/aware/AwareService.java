package com.example.demo.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author ytp
 */

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;


    @Override
    public void setBeanName(String s) {
        beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("bean名称" + beanName);
        Resource resource = loader.getResource("classpath:text.txt");
        try {
            System.out.println("加载文件内容是：" + IOUtils.toString(resource.getInputStream()));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
