package com.example.SalesData;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Immutable
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vw_FactSales", schema = "dbo")
public class FactInternetSales {

    @EmbeddedId
    private FactInternetSalesId id;

    private Integer productKey;
    private Integer orderDateKey;
    private Integer dueDateKey;
    private Integer shipDateKey;
    private Integer customerKey;
    private Integer promotionKey;
    private Integer currencyKey;
    private Integer salesTerritoryKey;

    private Integer revisionNumber;
    private Integer orderQuantity;

    private BigDecimal unitPrice;
    private BigDecimal extendedAmount;
    private BigDecimal unitPriceDiscountPct;
    private BigDecimal discountAmount;
    private BigDecimal productStandardCost;
    private BigDecimal totalProductCost;
    private BigDecimal salesAmount;
    private BigDecimal taxAmt;
    private BigDecimal freight;

    private String carrierTrackingNumber;
    private String customerPONumber;

    private LocalDate orderDate;
    private LocalDate dueDate;
    private LocalDate shipDate;


}
