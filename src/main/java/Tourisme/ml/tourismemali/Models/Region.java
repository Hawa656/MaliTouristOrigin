package Tourisme.ml.tourismemali.Models;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Region {
    // Déclaration des variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    private String nom;

    private int superficie;

    private String desciption;

    private File photo;

    @ManyToOne
    @JoinColumn(name = "codePays")
    private Pays pays;

    @ManyToMany
    @JoinTable(name = "PopulationRegion", joinColumns = { @JoinColumn(name = "idRegion") }, inverseJoinColumns = {
            @JoinColumn(name = "idPopulation") })
    List<Population> population = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "domaineActivite")
    private DomaineActivite domaineActivite;

    @ManyToOne
    @JoinColumn(name = "langue")
    private Langues langue;

    @JsonIgnore
    @OneToMany(mappedBy = "region")
    List<LieuTouristiques> lieuTouristiques = new ArrayList<>();

    @JsonIgnore
    @OneToMany
    List<Commentaire> commentaires = new ArrayList<>();

}
