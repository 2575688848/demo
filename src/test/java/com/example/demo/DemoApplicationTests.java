package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 1) {
                iterator.remove();
            }
        }
        System.out.println(s);

    }

    @Test
    public void testUUId() {
        int i = 4;
        for (; i >= 1; i--) {
            System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        }
    }

    @Test
    public void testString() throws Exception{
        String fileName = "公交车临时租用合同+-工程公司-批注版 (1).docx";
        String type = fileName.substring(fileName.lastIndexOf("."));
        fileName = fileName.lastIndexOf(".") > 0 ? fileName.substring(0, fileName.lastIndexOf(".")) : fileName;
        fileName = fileName.replaceAll("\\s|\\u00a0|\\u3000", "");
        fileName = fileName.endsWith("-修订版") ? fileName.replaceAll("-修订版", "") : fileName;


        String filename = "交车临时租用合同+-工程公司-批注版 (1).docx";
        filename = filename.replaceAll("\\+", "%2B");
        String headerValue = "attachment;";
        headerValue += " filename=\"" + URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20") + "\";";
        headerValue += " filename*=utf-8''" + URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20");

        System.out.println(type);
        System.out.println(fileName);
        System.out.println(headerValue);
        headerValue = URLDecoder.decode(headerValue, "UTF-8");
        headerValue = URLDecoder.decode(headerValue, "UTF-8");
        System.out.println(headerValue);
    }

    @Test
    public void testS() throws Exception{
        String filename = "交车临时租用合同+-工程公司-批注版 (1).docx";
        filename = filename.replaceAll("\\+", "%2B");
        String headerValue = "attachment;";
        headerValue += " filename=\"" + URLEncoder.encode(filename, "UTF-8") + "\";";
        headerValue += " filename*=utf-8''" + URLEncoder.encode(filename, "UTF-8");

        System.out.println(headerValue);

        headerValue = URLDecoder.decode(headerValue, "UTF-8");
        headerValue = URLDecoder.decode(headerValue, "UTF-8");
        System.out.println(headerValue);

    }
}
