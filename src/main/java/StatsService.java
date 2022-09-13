public class StatsService {
    public long totalSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long meanSales(long[] sales) {
        return totalSales(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int monthsOfHighSales(long[] sales) {
        int result = 0;
        long mean = meanSales(sales);
        for (long sale : sales) {
            if (sale > mean) {
                result++;
            }
        }
        return result;
    }

    public int monthsOfLowSales(long[] sales) {
        int result = 0;
        long mean = meanSales(sales);
        for (long sale : sales) {
            if (sale < mean) {
                result++;
            }
        }
        return result;
    }
}
