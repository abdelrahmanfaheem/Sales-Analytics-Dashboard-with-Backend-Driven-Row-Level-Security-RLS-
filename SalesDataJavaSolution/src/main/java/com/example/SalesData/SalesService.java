package com.example.SalesData;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SalesService {

    private final SalesJPA salesJPA;

    public List<FactInternetSales> getAll_Data() {
        return salesJPA.findAll().stream().toList();
    }


    public List<FactInternetSales> get_Data_ByUser(String userMail) {
        return salesJPA.allSales_ByUser(userMail).stream().toList();
    }

}
