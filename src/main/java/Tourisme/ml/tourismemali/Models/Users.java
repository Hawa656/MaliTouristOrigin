package Tourisme.ml.tourismemali.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomUtilisateur;
    private String motDePasse;

    @ManyToMany
    @JoinTable(name="UsersRoles",joinColumns = {
            @JoinColumn(name = "idUsers")
    },
            inverseJoinColumns = {
                    @JoinColumn (name = "idRoles")
            })
    private Collection<Roles> role = new ArrayList();
}

