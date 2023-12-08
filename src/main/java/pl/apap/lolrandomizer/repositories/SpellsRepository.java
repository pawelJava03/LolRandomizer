package pl.apap.lolrandomizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.apap.lolrandomizer.models.Spells;

@Repository
public interface SpellsRepository extends JpaRepository<Spells, Long> {

}
