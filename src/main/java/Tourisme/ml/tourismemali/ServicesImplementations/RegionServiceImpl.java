package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Message.ResponseMessage;
import Tourisme.ml.tourismemali.Models.Pays;
import Tourisme.ml.tourismemali.Models.Region;
import Tourisme.ml.tourismemali.Repository.PaysRepository;
import Tourisme.ml.tourismemali.Repository.RegionRepository;
import Tourisme.ml.tourismemali.Services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository repos;
    @Autowired
    PaysRepository paysRepository;

    @Override
    public Region saveRegion(Region a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public Region updateRegion(Region a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public void deleteRegion(Region a) {
        // TODO Auto-generated method stub
        repos.delete(a);
    }

    @Override
    public List<Region> getAllRegion() {
        // TODO Auto-generated method stub
        return repos.findAll();
    }

    @Override
    public Region getRegionByNom(String nom) {
        // TODO Auto-generated method stub
        return repos.findByNom(nom);
    }

    @Override
    public Region getRegion(Region a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object postRegion(Region region, String codePays) {
        if (paysRepository.findByCode(codePays) == null){
            return ResponseMessage.generateResponse("Ce Pays n'existe pas", HttpStatus.OK, null);
        }else {
            Pays pays = paysRepository.findByCode(codePays);
            region.setPays(pays);
        }
        return null;
    }

    @Override
    public Region getRegionByCode(String code) {
        // TODO Auto-generated method stub
        return repos.findByCode(code);
    }

    @Override
    public List<Object> getRegionSansPay() {
        // TODO Auto-generated method stub
        return repos.RegionsSansPays();
    }
}
