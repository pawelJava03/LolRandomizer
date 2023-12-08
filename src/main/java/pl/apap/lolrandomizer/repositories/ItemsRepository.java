package pl.apap.lolrandomizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.apap.lolrandomizer.models.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {

}
