package platform.market.domain.Items;

import platform.market.domain.BaseEntity;
import platform.market.domain.category.CategoryItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@MappedSuperclass
//@EntityListeners(value = {AuditingEntityListener.class})
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Item extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    @OneToMany(mappedBy = "item")
    private List<CategoryItem> categoryItems=new ArrayList<>();


//    @ManyToMany
//    @JoinTable(name = "ITEM_CATEGORY"
//            ,joinColumns = @JoinColumn(name="ITEM_ID")
//            ,inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
//    @ManyToMany(mappedBy = "items")
//    private List<Category> categories=new ArrayList<>();
}
