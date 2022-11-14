package platform.market.service.dto;

import lombok.Getter;
import platform.market.domain.order.OrderItem;

import java.util.List;

@Getter
public class OrderCreatedRequestDTO {
    private List<OrderItem> orderItems;
}
