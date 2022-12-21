package Tourisme.ml.tourismemali.ServicesImplementations;

import Tourisme.ml.tourismemali.Models.Users;
import Tourisme.ml.tourismemali.Repository.UsersRepository;
import Tourisme.ml.tourismemali.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository repos;

    @Override
    public Users saveUtilisateur(Users a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public Users updateUtilisateur(Users a) {
        // TODO Auto-generated method stub
        return repos.save(a);
    }

    @Override
    public void deleteUtilisateur(Users a) {
        // TODO Auto-generated method stub
        repos.delete(a);
    }

    @Override
    public List<Users> getAllUtilisateur() {
        // TODO Auto-generated method stub
        return repos.findAll();
    }
}
