package twd.aremiti.diy.backend.repository;

import org.springframework.data.repository.CrudRepository;
import twd.aremiti.diy.backend.repository.model.PackageEntity;

import java.util.List;

public interface PackageRepository extends CrudRepository<PackageEntity, Long> {

    List<PackageEntity> findAll();

}
