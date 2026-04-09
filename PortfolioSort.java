import java.util.*;

class Asset {
    String name;
    double returnRate;

    Asset(String name, double r) {
        this.name = name;
        this.returnRate = r;
    }
}

public class PortfolioSort {
    public static void main(String[] args) {
        Asset[] arr = {
            new Asset("AAPL", 12),
            new Asset("TSLA", 8),
            new Asset("GOOG", 15)
        };

        Arrays.sort(arr, Comparator.comparingDouble(a -> a.returnRate));
        System.out.println("Ascending:");
        for (Asset a : arr)
            System.out.println(a.name + " " + a.returnRate);

        Arrays.sort(arr, (a, b) -> Double.compare(b.returnRate, a.returnRate));
        System.out.println("\nDescending:");
        for (Asset a : arr)
            System.out.println(a.name + " " + a.returnRate);
    }
}