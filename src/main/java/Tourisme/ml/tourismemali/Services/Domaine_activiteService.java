package Tourisme.ml.tourismemali.Services;

import Tourisme.ml.tourismemali.Models.DomaineActivite;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Domaine_activiteService {
    DomaineActivite saveDomaineActivite(DomaineActivite da);

    DomaineActivite updateDomaineActivite(DomaineActivite da);

    void deleteDomaineActivite(DomaineActivite da);

    List<DomaineActivite> getAllDomaineActivite();

    DomaineActivite FindByNom(String nom);

    // Methode pour recuperer le pays à travers le code
    DomaineActivite getDomaineByCode(String code);
}
