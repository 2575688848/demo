package com.example.demo.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author icourt
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class Main {

    @Autowired
    private TestBean testBean;

    @Test
    public void prod() {
        String s = "dd";
        String s1 = testBean.getContent();
        Assert.assertEquals(s ,s1);
    }
}
