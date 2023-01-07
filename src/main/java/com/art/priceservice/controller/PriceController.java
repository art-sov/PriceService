package com.art.priceservice.controller;

import com.art.priceservice.service.PriceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceapi")
@AllArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @RequestMapping(value = "/price/{type}", method = RequestMethod.GET)
    public Double getPrice(@PathVariable(value = "type") String type) {
        return priceService.getPriceByType(type);
    }

}
