package Tourisme.ml.tourismemali.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.File;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LieuTouristiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private File photo;

    @ManyToOne
    @JoinColumn
    Region region;

}