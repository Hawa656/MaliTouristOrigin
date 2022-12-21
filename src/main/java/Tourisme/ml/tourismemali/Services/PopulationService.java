package Tourisme.ml.tourismemali.Services;

import Tourisme.ml.tourismemali.Models.Population;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PopulationService {
    Population FindByCode(Long code);

    Population savePopulation(Population p);

    Population updatePopulation(Population p);

    void deletePopulation(Population p);

    List<Population> getAllPopulation();

}
