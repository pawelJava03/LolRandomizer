package pl.apap.lolrandomizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.apap.lolrandomizer.models.Spells;

import java.util.List;

@Repository
public interface SpellsRepository extends JpaRepository<Spells, Long> {

    @Query(value = "SELECT * FROM spells WHERE spell_identification <> 1 ORDER BY random() LIMIT 2", nativeQuery = true)
    List<Spells> spellForEveryone();

    @Query(value = "(SELECT * FROM spells WHERE spell_identification <> 1 ORDER BY random() LIMIT 1) UNION ALL (SELECT * FROM spells WHERE spell_identification = 1 ORDER BY random() LIMIT 1)", nativeQuery = true)
    List<Spells> spellsForJungler();

}
