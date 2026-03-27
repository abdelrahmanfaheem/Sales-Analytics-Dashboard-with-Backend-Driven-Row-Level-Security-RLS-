package com.example.SalesData;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SalesController {

    private final SalesService service;

    @GetMapping("/getAll")
    public ResponseEntity<?> allData() {
        return ResponseEntity.ok(service.getAll_Data());
    }


    @GetMapping("/getByUser/{userMail}")
    public ResponseEntity<?> getByUser(@PathVariable String userMail) {
        return ResponseEntity.ok(service.get_Data_ByUser(userMail));
    }




}
