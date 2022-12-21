package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Models.Langues;
import Tourisme.ml.tourismemali.Repository.LangueRepository;
import Tourisme.ml.tourismemali.Services.LanguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LangueServiceImpl implements LanguesService {
    @Autowired
    LangueRepository repos;

    @Override
    public Langues saveLangue(Langues l) {
        // TODO Auto-generated method stub
        return repos.save(l);
    }

    @Override
    public Langues updateLangue(Langues l) {
        // TODO Auto-generated method stub
        return repos.save(l);
    }

    @Override
    public void deleteLangue(Langues l) {
        // TODO Auto-generated method stub
        repos.delete(l);

    }

    @Override
    public List<Langues> getAllLangue() {
        // TODO Auto-generated method stub
        return repos.findAll();
    }

    @Override
    public Langues findByLibele(String nom) {
        // TODO Auto-generated method stub
        return repos.findByLibele(nom);
    }

    @Override
    public Langues getLangueByCode(String code) {
        // TODO Auto-generated method stub
        return repos.findByCode(code);
    }

}
