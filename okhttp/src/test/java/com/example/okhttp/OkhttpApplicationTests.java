package com.example.okhttp;

import com.example.tester.TestPrintLog;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestPrintLog.class)
public class OkhttpApplicationTests {

    @Autowired
    TestPrintLog testClass;

    @Test
    public void contextLoads() {
        testClass.print("hello");
    }

    @Test
    public void contextLoads2() {
        testClass.print("hello");
    }

    @Test
    public void testTwo(){
        System.out.println("test hello 2");
        TestCase.assertEquals(1, 1);
    }

//    @Test
//    public void testWrong(){
//        System.out.println("test hello 2");
//        TestCase.assertEquals(1, 2);
//    }

    @Test
    public void testReturn(){
        System.out.println("test return int 1");
        TestCase.assertEquals(1, testClass.return1());
    }

    @Before
    public void testBefore(){
        System.out.println("before");
    }

    @After
    public void testAfter(){
        System.out.println("after");
    }

}

