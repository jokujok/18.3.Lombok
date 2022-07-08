package com.crud.items;

import com.crud.items.domain.ItemDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemsApplication {
	public static void main(String[] args) {
	ItemDto itemDto = new ItemDto(
			1L,
			"Test Item",
			100.00
	);

	Long id = itemDto.getId();
	String name = itemDto.getName();
	double price = itemDto.getPrice();

		System.out.println(id + " " + name + " " + price);

		SpringApplication.run(ItemsApplication.class, args);
	}

}
