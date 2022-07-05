package ru.netology.stats;

public class StatsService {
    public int totalAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int averAmount = totalAllSales(sales) / 12;
        return averAmount;
    }

    public int numberMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countMonthBelowAverageSales(int[] sales) {
        int countMonth = 0;
        int monthAverSales = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < monthAverSales)
                countMonth++;
        }
        return countMonth;
    }

    public int countMonthOverAverageSales(int[] sales) {
        int countMonth = 0;
        int monthAverSales = averageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > monthAverSales)
                countMonth++;
        }
        return countMonth;
    }
}
