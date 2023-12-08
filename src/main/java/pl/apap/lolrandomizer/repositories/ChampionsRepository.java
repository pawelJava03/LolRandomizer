package pl.apap.lolrandomizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.apap.lolrandomizer.models.Champions;

import java.util.List;
    @Repository
    public interface ChampionsRepository extends JpaRepository<Champions, Long> {

        @Query(value = "SELECT * FROM champions ORDER BY random() LIMIT 5", nativeQuery = true)
        List<Champions> findRandomUniqueChampions();
    }
