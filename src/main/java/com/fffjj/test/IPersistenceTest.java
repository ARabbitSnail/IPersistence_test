package com.fffjj.test;

import com.fffjj.io.Resources;

import java.io.InputStream;

public class IPersistenceTest {

    public void test(){
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    }
}
