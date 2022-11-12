package platform.market.domain.delivery;

public enum DeliveryStatus {
    //배송 준비,배송 시작,배송중,배송완료,배송취소
    READY("배송준비"),
    BEGIN("배송시작"),
    SHIPPING("배송중"),
    COMPLETED("배송완료"),
    CANCELED("배송취소");

    private String name;

    DeliveryStatus(String name) {
        this.name = name;
    }
}
