package twd.aremiti.diy.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twd.aremiti.diy.backend.repository.PackageRepository;
import twd.aremiti.diy.backend.repository.model.PackageEntity;

import java.util.List;

@Service
public class PackageService {

    @Autowired
    private PackageRepository packageRepository;

    public List<PackageEntity> getAllPackages() {
        return packageRepository.findAll();
    }

    public PackageEntity createPackage(String descriptif) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setDescriptif(descriptif);
        return packageRepository.save(packageEntity);
    }
}
