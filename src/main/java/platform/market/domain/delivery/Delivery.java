package platform.market.domain.delivery;

import platform.market.domain.BaseEntity;
import platform.market.domain.order.Order;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;

    private String street;

    private String zipcode;

    @Enumerated(value = EnumType.STRING)
    private DeliveryStatus deliveryStatus;
}
