package twd.aremiti.diy.backend.model;

import lombok.Data;
import twd.aremiti.diy.backend.repository.model.PackageEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
public class NewUserPackage {

    private String descriptif;

    private Integer nb_adultes;

    private Integer nb_jeunes;

    private Integer nb_bebes;

    private Integer nb_voitures;

    private Integer nb_motos;

    private Integer nb_velos;

    private String categorie;

    private String bateau;

    private Boolean actif;


}
