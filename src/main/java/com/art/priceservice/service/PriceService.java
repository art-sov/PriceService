package com.art.priceservice.service;

import com.art.priceservice.repository.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriceService {

    private final PriceRepository priceRepository;

    public Double getPriceByType(String type) {
        var priceEntity = priceRepository.findByType(type)
                .orElseThrow(() -> new RuntimeException(String.format("Type %s is not found", type)));
        return priceEntity.getPrice();
    }
}
