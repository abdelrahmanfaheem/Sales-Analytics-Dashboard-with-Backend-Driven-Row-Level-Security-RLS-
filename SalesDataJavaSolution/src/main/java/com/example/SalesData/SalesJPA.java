package com.example.SalesData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesJPA extends JpaRepository<FactInternetSales,FactInternetSalesId> {


    @Query(value =
            "SELECT s.* " +
                    "FROM FactInternetSales s " +
                    "INNER JOIN user_Security us " +
                    "ON us.authorityTerritoryNeed = s.SalesTerritoryKey " +
                    "WHERE us.userMail = :user",
            nativeQuery = true)
    List<FactInternetSales> allSales_ByUser(@Param("user") String user);

}
