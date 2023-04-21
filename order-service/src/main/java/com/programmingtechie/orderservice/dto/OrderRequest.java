package com.programmingtechie.orderservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtos;
    
    public List<OrderLineItemsDto> getOrderLineItemsDtoList() {
		return orderLineItemsDtos;
	}
    
}
