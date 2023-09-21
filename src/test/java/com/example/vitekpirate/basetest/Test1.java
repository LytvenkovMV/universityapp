package com.example.vitekpirate.basetest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Test1 {

    @Test
    void test1()
    {

        // given
        int a = 2;
        int b = 2;
        int actual;

        // when
        actual = a + b;

        // then
        assertEquals(4, actual);
    }
}
