package Tourisme.ml.tourismemali.Controller;

import Tourisme.ml.tourismemali.Message.ResponseMessage;
import Tourisme.ml.tourismemali.Models.Pays;
import Tourisme.ml.tourismemali.ServicesImplementations.PaysServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pays")
@Api(value = "pays", description = "Les actions à réaliser sur la table pays(creation, modification, etc ...).")
@Controller
public class PaysController {
    @Autowired
    private PaysServiceImpl service;

    // methode pour la création d'un pays
    @ApiOperation(value = "Création d'un pays.")
    @PostMapping("/creer")
    public ResponseEntity<Object> CreerPays(@RequestBody Pays pays) {

        Pays verif_pays = service.getPaysByNom(pays.getNom());
        if (verif_pays == null) {
            Pays Enregistrepays = service.savePays(pays);
            return ResponseMessage.generateResponse("Pays ajouté avec succes", HttpStatus.OK, Enregistrepays);
        } else {
            return ResponseMessage.generateResponse("Ce pays existe déja", HttpStatus.OK, verif_pays);
        }
    }
    // Fin

    // methode pour la mise à jour d'un pays
    @ApiOperation(value = "Modification d'un pays.")
    @PutMapping("/mettreajour/{codePays}")
    public ResponseEntity<Object> MiseAJourPays(@RequestBody Pays pays, @PathVariable(value = "CodePays") String code) {

        Pays verif_pays = service.getPaysByCode(code);
        if (verif_pays != null) {
            Pays Enregistrepays = service.updatePays(pays);
            return ResponseMessage.generateResponse("Pays modifié avec succes", HttpStatus.OK, Enregistrepays);
        } else {
            return ResponseMessage.generateResponse("Ce pays n'existe pas, donc vous ne pouvez pas le modifié.",
                    HttpStatus.OK, null);
        }

    }
    // Fin

    // methode pour la surpression d'un pays
    @ApiOperation(value = "Recuperation d'un pays.")
    @DeleteMapping("/{codePays}")
    public ResponseEntity<Object> SuprimerPays(@PathVariable(value = "CodePays") String code) {

        Pays pays = service.getPaysByNom(code);

        if (pays != null) {
            service.deletePays(pays);
            return ResponseMessage.generateResponse("Pays suprimer", HttpStatus.OK, null);
        } else {
            return ResponseMessage.generateResponse("Ce pays n'existe pas!", HttpStatus.OK, null);
        }

    }
    // Fin

    // methode pour la liste des pays
    @ApiOperation(value = "Récuperation  de la liste des pays.")
    @GetMapping("/liste")
    public ResponseEntity<Object> ListePays() {

        try {
            return ResponseMessage.generateResponse("La liste des pays:", HttpStatus.OK, service.getAllPays());

        } catch (Exception e) {
            return ResponseMessage.generateResponse("Erreur lors du retour de la liste.", HttpStatus.OK, null);
        }

    }
    // Fin
}
