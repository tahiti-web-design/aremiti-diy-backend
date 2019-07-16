package twd.aremiti.diy.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twd.aremiti.diy.backend.model.NewUserPackage;
import twd.aremiti.diy.backend.repository.PackageRepository;
import twd.aremiti.diy.backend.repository.model.PackageEntity;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Service
public class PackageService {

    @Autowired
    private PackageRepository packageRepository;

    public List<PackageEntity> getAllPackages() {
        return packageRepository.findAll();
    }

    public PackageEntity createPackage(NewUserPackage newUserPackage) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setActif(newUserPackage.getActif());
        packageEntity.setBateau(newUserPackage.getBateau());
        packageEntity.setDescriptif(newUserPackage.getDescriptif());
        packageEntity.setNb_adultes(newUserPackage.getNb_adultes());
        packageEntity.setNb_bebes(newUserPackage.getNb_bebes());
        packageEntity.setNb_jeunes(newUserPackage.getNb_jeunes());
        packageEntity.setNb_motos(newUserPackage.getNb_motos());
        packageEntity.setNb_velos(newUserPackage.getNb_velos());
        packageEntity.setNb_voitures(newUserPackage.getNb_voitures());
        packageEntity.setCategorie(newUserPackage.getCategorie());
        return packageRepository.save(packageEntity);
    }

    public PackageEntity updatePackage(PackageEntity packageEntity) {
        Optional<PackageEntity> packageEntity1 = packageRepository.findById(packageEntity.getId());

        if (packageEntity1.isPresent()){
            PackageEntity p = packageEntity1.get();
            p.setActif(packageEntity.getActif());
            p.setDescriptif(packageEntity.getDescriptif());
            p.setNb_voitures(packageEntity.getNb_voitures());
            p.setNb_velos(packageEntity.getNb_velos());
            p.setNb_motos(packageEntity.getNb_motos());
            p.setNb_jeunes(packageEntity.getNb_jeunes());
            p.setNb_adultes(packageEntity.getNb_adultes());
            p.setNb_bebes(packageEntity.getNb_bebes());
            return packageRepository.save(p);
        }
        else{
        return null;
        }

    }
}
