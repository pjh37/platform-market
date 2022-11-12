package platform.market.domain.Items;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long>,ItemRepositoryCustom {
}
