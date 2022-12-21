package Tourisme.ml.tourismemali.Services;

import Tourisme.ml.tourismemali.Models.Langues;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LanguesService {
    Langues saveLangue(Langues l);

    Langues updateLangue(Langues l);

    void deleteLangue(Langues l);

    List<Langues> getAllLangue();

    Langues findByLibele(String nom);

    // Methode pour recuperer le pays à travers le code
    Langues getLangueByCode(String code);
}
