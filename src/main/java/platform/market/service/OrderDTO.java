package platform.market.service;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderDTO {
    private String name;
    private int quantity;

    @Builder
    public OrderDTO(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
