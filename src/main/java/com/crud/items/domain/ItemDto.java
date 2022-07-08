package com.crud.items.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItemDto {
    private Long id;
    private String name;
    private double price;
}
