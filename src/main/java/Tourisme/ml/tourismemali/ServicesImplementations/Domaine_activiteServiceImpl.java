package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Models.DomaineActivite;
import Tourisme.ml.tourismemali.Repository.Domaine_activiteRepository;
import Tourisme.ml.tourismemali.Services.Domaine_activiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Domaine_activiteServiceImpl implements Domaine_activiteService {
    @Autowired
    Domaine_activiteRepository repos;

    @Override
    public DomaineActivite saveDomaineActivite(DomaineActivite da) {
        // TODO Auto-generated method stub
        return repos.save(da);
    }

    @Override
    public DomaineActivite updateDomaineActivite(DomaineActivite da) {
        // TODO Auto-generated method stub
        return repos.save(da);
    }

    @Override
    public void deleteDomaineActivite(DomaineActivite da) {
        // TODO Auto-generated method stub
        repos.delete(da);
    }

    @Override
    public List<DomaineActivite> getAllDomaineActivite() {
        // TODO Auto-generated method stub
        return repos.findAll();
    }

    @Override
    public DomaineActivite FindByNom(String nom) {
        // TODO Auto-generated method stub
        return repos.findByNom(nom);
    }

    @Override
    public DomaineActivite getDomaineByCode(String code) {
        // TODO Auto-generated method stub
        return repos.findByCode(code);
    }

}
