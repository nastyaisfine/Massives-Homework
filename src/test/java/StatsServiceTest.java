import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sum() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.sum(sales);
        long expected = 80 + 0 + 1 + 15 + 20 + 40 + 19 + 7 + 7 + 19 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void average() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.average(sales);
        long expected = (80 + 0 + 1 + 15 + 20 + 40 + 19 + 7 + 7 + 19 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.minSales(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void maxMonth() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void howMuchMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.countAboveAverage(sales);
        long expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void howMuchMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {80, 0, 1, 15, 20, 40, 19, 7, 7, 19, 14, 18};
        long actual = service.countBelowAverage(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

}