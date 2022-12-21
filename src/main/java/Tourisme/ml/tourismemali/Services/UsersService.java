package Tourisme.ml.tourismemali.Services;

import Tourisme.ml.tourismemali.Models.Users;

import java.util.List;

public interface UsersService {
    // Methode pour la création d'un Utilisateur
    Users saveUtilisateur(Users a);

    // Methode pour la modification d'un Utilisateur
    Users updateUtilisateur(Users a);

    // Methode pour la suppression d'un Utilisateur à partir d'un Utilisateur
    void deleteUtilisateur(Users a);

    // Methode pour la liste des Utilisateurs à partir d'un Utilisateur
    List<Users> getAllUtilisateur();

}
