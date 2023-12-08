package pl.apap.lolrandomizer.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "champions")
@Data
public class Champions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long champion_id;
    private String champion_name;
}
