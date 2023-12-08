package pl.apap.lolrandomizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.apap.lolrandomizer.models.Champions;

@Repository
public interface ChampionsRepository extends JpaRepository<Champions, Long> {

}
