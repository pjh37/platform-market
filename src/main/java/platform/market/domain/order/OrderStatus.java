package platform.market.domain.order;

public enum OrderStatus {
    SUCCESS("주문완료"),CANCELED("주문취소");

    private String name;

    OrderStatus(String name) {
        this.name = name;
    }
}
