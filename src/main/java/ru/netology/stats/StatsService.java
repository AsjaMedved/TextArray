package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long averageSales = sumSales(sales) / sales.length;
        return  averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minAverageSales(long[] sales) {

        long minAverageSales = averageSales(sales);
        int sumMonths = 0;
        for (long sale : sales) {
            if (sale < minAverageSales) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }

    public int maxAverageSales(long[] sales) {
        long maxAverageSales = averageSales(sales);
        int sumMonths = 0;
        for (long sale : sales) {
            if (sale > maxAverageSales) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }
}