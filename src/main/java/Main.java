import ru.netology.stats.StatsService;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = service.sum(sales);
        System.out.println("Сумма за все месяцы: " + sum);

        long average = service.average(sales);
        System.out.println("Средняя сумма: " + sum / 12);

        long minMonth = service.minSales(sales);
        System.out.println("Месяц с минимальным количеством продаж: " + minMonth);

        long maxMonth = service.maxSales(sales);
        System.out.println("Месяц с максимальным количеством продаж: " + maxMonth);

        int count = service.countAboveAverage(sales);
        System.out.println("Количество месяцев с доходом выше среднего: " + count);

        int count2 = service.countBelowAverage(sales);
        System.out.println("Количество месяцев с доходом ниже среднего: " + count2);


    }
}
