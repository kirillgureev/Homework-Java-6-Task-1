package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void calcSumAllSales() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.totalAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSalesAmount() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchNumberMonthMaxSales() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.numberMonthMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchNumberMonthMinSales() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.numberMonthMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchCountMonthBelowAverageSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.countMonthBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchCountMonthOverAverageSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.countMonthOverAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
