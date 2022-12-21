package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Models.Pays;
import Tourisme.ml.tourismemali.Repository.PaysRepository;
import Tourisme.ml.tourismemali.Services.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaysServiceImpl implements PaysService {
    @Autowired
    PaysRepository repos;

    @Override
    public Pays savePays(Pays a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public Pays getPaysByNom(String nom) {
        // TODO Auto-generated method stub
        return repos.findByNom(nom);
    }

    @Override
    public Pays updatePays(Pays a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public void deletePays(Pays a) {
        // TODO Auto-generated method stub
        repos.delete(a);
    }

    @Override
    public List<Pays> getAllPays() {
        // TODO Auto-generated method stub
        return repos.findAll();
    }

    @Override
    public Pays getPaysByCode(String code) {
        // TODO Auto-generated method stub
        return repos.findByCode(code);
    }

}
