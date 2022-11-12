package platform.market.domain.member;

import platform.market.domain.BaseEntity;
import platform.market.domain.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;

    private String street;

    @OneToMany(mappedBy = "member")
    private List<Order> orders=new ArrayList<>();
}
