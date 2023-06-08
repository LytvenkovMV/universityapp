package com.example.vitekpirate.basetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
