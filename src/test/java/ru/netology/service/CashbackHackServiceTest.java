package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        //проверка ввода обычного числа
        int expected1 = 990;
        Assertions.assertEquals(expected1, service.remain(10));
        //проверка ввода отрицательного числа
        int expected2 = 1010;
        Assertions.assertEquals(expected2, service.remain(-10));
        //проверка ввода нулевого числа
        int expected3 = 1000;
        Assertions.assertEquals(expected3, service.remain(0));
    }
}