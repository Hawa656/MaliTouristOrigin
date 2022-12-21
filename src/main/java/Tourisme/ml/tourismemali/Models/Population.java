package Tourisme.ml.tourismemali.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long code;
    private Long nombre_habitants;
    private Long annee;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "population")
    List<Region> region = new ArrayList<>();
}
