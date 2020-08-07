package com.eatza.order.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeliveryRequestDto {

	private Long orderId;
	private String status;
	private Long customerId;
	private Long restaurantId;

	public DeliveryRequestDto(Long orderId, String status, Long customerId, Long restaurantId) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
	}

}
