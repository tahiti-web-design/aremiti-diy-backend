package twd.aremiti.diy.backend.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PackageEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String descriptif;

    private Integer nb_adultes;

    private Integer nb_jeunes;

    private Integer nb_bebe;

    private Integer nb_voiture;

    private Integer nb_moto;

    private Integer nb_velo;

    private Integer categorie;

    private Boolean actif;


}
