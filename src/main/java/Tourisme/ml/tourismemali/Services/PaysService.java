package Tourisme.ml.tourismemali.Services;

import Tourisme.ml.tourismemali.Models.Pays;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaysService {
    // Methode pour la création d'un pays
    Pays savePays(Pays a);

    // Methode pour recuperer le pays à travers le code
    Pays getPaysByCode(String code);

    // Methode pour la recuperation d'un pays à travers le nom
    Pays getPaysByNom(String nom);

    // Methode pour la modification d'un Pays
    Pays updatePays(Pays a);

    // Methode pour la surpression d'un Pays à partir d'un Pays
    void deletePays(Pays a);

    // Methode pour la liste des Pays
    List<Pays> getAllPays();

}
