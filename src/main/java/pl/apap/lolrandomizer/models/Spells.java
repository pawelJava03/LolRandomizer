package pl.apap.lolrandomizer.models;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "spells")
@Data
public class Spells {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long spell_id;
    private String spell_name;
    private int spell_identification;

}
