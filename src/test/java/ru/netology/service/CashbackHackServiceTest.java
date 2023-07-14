package ru.netology.service;

import org.testng.Assert;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected1 = 990;
        Assert.assertEquals(expected1, service.remain(10));
        //проверка ввода отрицательного числа
        int expected2 = 1010;
        Assert.assertEquals(expected2, service.remain(-10));
        //проверка ввода нулевого числа
        int expected3 = 1000;
        Assert.assertEquals(expected3, service.remain(0));

    }
}