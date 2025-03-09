package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Сумма продаж: " + service.sumSales(sales));
        System.out.println("Сумма продаж: " + service.averageSales(sales));
        System.out.println("Сумма продаж: " + service.maxSales(sales));
        System.out.println("Сумма продаж: " + service.minSales(sales));
        System.out.println("Сумма продаж: " + service.minAverageSales(sales));
        System.out.println("Сумма продаж: " + service.maxAverageSales(sales));
    }
}