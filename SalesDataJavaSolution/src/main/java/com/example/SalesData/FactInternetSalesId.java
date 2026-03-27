package com.example.SalesData;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Objects;

@Data
@Embeddable
public class FactInternetSalesId {

    private String salesOrderNumber;
    private Integer salesOrderLineNumber;

    public FactInternetSalesId() {
    }

    public FactInternetSalesId(String salesOrderNumber, Integer salesOrderLineNumber) {
        this.salesOrderNumber = salesOrderNumber;
        this.salesOrderLineNumber = salesOrderLineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactInternetSalesId)) return false;

        FactInternetSalesId that  = (FactInternetSalesId) o;

        return Objects.equals(salesOrderNumber, that.salesOrderNumber) &&
                Objects.equals(salesOrderLineNumber, that.salesOrderLineNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderNumber, salesOrderLineNumber);
    }

}
