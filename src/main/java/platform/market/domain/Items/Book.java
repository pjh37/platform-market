package platform.market.domain.Items;

import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
