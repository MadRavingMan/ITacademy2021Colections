package net.swedbank.gyk.collections.productmap;

import java.time.LocalDateTime;

public class ProductStatistics {

    /*
    Add fields to ProductStatistics:
    firstSaleOn (LocalDateTime type)
    lastSaleOn (LocalDateTime type)
    salesAmount (double)
     */

    private LocalDateTime firstSaleOn;
    private LocalDateTime lastSaleOn;
    private double salesAmount;


    // implement constructor

    public ProductStatistics() {
    }

    public ProductStatistics(LocalDateTime firstSaleOn, LocalDateTime lastSaleOn, double salesAmount) {
        this.firstSaleOn = firstSaleOn;
        this.lastSaleOn = lastSaleOn;
        this.salesAmount = salesAmount;
    }

    private LocalDateTime getMinDate(LocalDateTime d1, LocalDateTime d2) {
        if (d1.compareTo(d2) < 0) return d1;
        return d2;
    }

    private LocalDateTime getMaxDate(LocalDateTime d1, LocalDateTime d2) {
        if (d1.compareTo(d2) > 0) return d1;
        return d2;
    }

    public LocalDateTime getFirstSaleOn() {
        return firstSaleOn;
    }

    public LocalDateTime getLastSaleOn() {
        return lastSaleOn;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    //implement this
    public void updateSalesAmount(double amount) {
        salesAmount += amount;

    }

    //implement this
    public void updateFirstSalesDate(LocalDateTime dt) {
        firstSaleOn = getMinDate(firstSaleOn, dt);
    }

    //implement this
    public void updateLastSalesDate(LocalDateTime dt) {
        lastSaleOn = getMaxDate(lastSaleOn, dt);
    }

    @Override
    public String toString() {
        return "ProductStatistics{" +
                "firstSaleOn=" + firstSaleOn +
                ", lastSaleOn=" + lastSaleOn +
                ", salesAmount=" + salesAmount +
                '}';
    }
}
