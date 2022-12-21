package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Models.Population;
import Tourisme.ml.tourismemali.Repository.PopulationRepository;
import Tourisme.ml.tourismemali.Services.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PopulationServiceImpl implements PopulationService {
    @Autowired
    PopulationRepository Repos;

    @Override
    public Population savePopulation(Population p) {
        // TODO Auto-generated method stub
        return Repos.save(p);
    }

    @Override
    public Population updatePopulation(Population p) {
        // TODO Auto-generated method stub
        return Repos.save(p);
    }

    @Override
    public void deletePopulation(Population p) {
        Repos.delete(p);

    }

    @Override
    public List<Population> getAllPopulation() {

        return Repos.findAll();
    }

    @Override
    public Population FindByCode(Long code) {
        // TODO Auto-generated method stub
        return Repos.findByCode(code);
    }
}
