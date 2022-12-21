package Tourisme.ml.tourismemali.Controller;

import Tourisme.ml.tourismemali.Message.ResponseMessage;
import Tourisme.ml.tourismemali.Models.Users;
import Tourisme.ml.tourismemali.ServicesImplementations.UsersServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(value = "utilisateur", description = "Les actions de l'utilisateur")
@RequestMapping("/utilisateur")
@Controller
public class UsersController {
    @Autowired
    private UsersServiceImpl service;

    // methode pour la création d'un Admin
    @ApiOperation(value = "Création d'un utilisateur.")
    @PostMapping("/creer")
    public ResponseEntity<Object> CreerUtilisateur(@RequestBody Users users) {

        Users enregistreUtilisateur = service.saveUtilisateur(users );
        return ResponseMessage.generateResponse("Admin ajouté avec succes", HttpStatus.OK, enregistreUtilisateur);

    }
    // Fin

    // methode pour la mise à jour d'un Admin
    @ApiOperation(value = "Mis à jour d'un administrateur.")
    @PutMapping("/mettreajour")
    public ResponseEntity<Object> MiseAJourAdmin(@RequestBody Users Utilisateur) {

        Users enregistreUtilisateur = service.updateUtilisateur(Utilisateur);
        return ResponseMessage.generateResponse("Admin modifié avec succes", HttpStatus.OK, enregistreUtilisateur);

    }
    // Fin

    // methode pour la surpression d'un Admin
    @ApiOperation(value = "Surpression d'un utilisateur.")
    @DeleteMapping("/suprimer")
    public ResponseEntity<Object> SuprimerAdmin(@RequestBody Users users) {

        try {
            service.deleteUtilisateur(users);
            return ResponseMessage.generateResponse("Admin suprimer!", HttpStatus.OK, null);

        } catch (Exception e) {
            return ResponseMessage.generateResponse("Erreur lors de la surpression.", HttpStatus.OK, null);
        }

    }
    // Fin

    // methode pour la liste des utilisateurs
    @ApiOperation(value = "Récuperation de la liste des utilisateurs.")
    @GetMapping("/liste")
    public ResponseEntity<Object> ListeUtilisateur() {

        try {
            return ResponseMessage.generateResponse("La liste des utilisateurs:", HttpStatus.OK, service.getAllUtilisateur());

        } catch (Exception e) {
            return ResponseMessage.generateResponse("Erreur lors du retour de  utilisateur.", HttpStatus.OK, null);
        }

    }
    // Fin
}
