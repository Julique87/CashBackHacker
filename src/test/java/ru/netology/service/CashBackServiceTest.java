package ru.netology.service;

import static org.testng.Assert.*;

public class CashBackServiceTest {

    @org.testng.annotations.Test
    public void shouldRemain() {                               // Работа сервиса в классе эквивалетности до 1000 руб.
        CashBackService service = new CashBackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldNotRemainIfAmountAbove1000() {               // Класс эквавалентности > 1000
        CashBackService service = new CashBackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldNotRemainWhenBoundary() {                  // Граничное значение
        CashBackService service = new CashBackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldRemainWhenBelowBoundary() {                 // Ниже граничного значения на 1 позицию
        CashBackService service = new CashBackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldNotRemainWhenUpperBoundary() {              // Выше граничного значения на 1 позицию
        CashBackService service = new CashBackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

}