package Tourisme.ml.tourismemali.Models;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;

    @ManyToMany
    @JoinTable(name="UsersRoles",
            joinColumns =    @JoinColumn(name = "idUsers"),
            inverseJoinColumns =  @JoinColumn (name = "idRoles ")
    )
    List<Users> utilisateurs = new ArrayList<>();
}
