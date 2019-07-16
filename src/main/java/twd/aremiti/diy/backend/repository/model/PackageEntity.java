package twd.aremiti.diy.backend.repository.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PackageEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="designation")
    private String descriptif;

    @Column(name="nb_adultes")
    private Integer nb_adultes;

    @Column(name="nb_jeunes")
    private Integer nb_jeunes;

    @Column(name="nb_bebes")
    private Integer nb_bebes;

    @Column(name="nb_voitures")
    private Integer nb_voitures;

    @Column(name="nb_motos")
    private Integer nb_motos;

    @Column(name="nb_velos")
    private Integer nb_velos;

    @Column(name="type_categorie")
    private String categorie;

    @Column(name="code_societe")
    private String bateau;

    @Column(name="actif")
    private Boolean actif;


}
