package ru.netology.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected1 = 990;
        AssertJUnit.assertEquals(expected1, service.remain(10));
        int expected2 = 1010;
        AssertJUnit.assertEquals(expected2, service.remain(-10));
        int expected3 = 1000;
        AssertJUnit.assertEquals(expected3, service.remain(0));

    }
}