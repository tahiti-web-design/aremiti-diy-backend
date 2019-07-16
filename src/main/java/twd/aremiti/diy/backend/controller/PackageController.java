package twd.aremiti.diy.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import twd.aremiti.diy.backend.model.NewUserPackage;
import twd.aremiti.diy.backend.repository.model.PackageEntity;
import twd.aremiti.diy.backend.service.PackageService;

import java.util.List;

@RestController
@RequestMapping(value = "/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PackageEntity> getAllPackages() {
        return packageService.getAllPackages();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PackageEntity createPackage(@RequestBody NewUserPackage newUserPackage) {
        return packageService.createPackage(newUserPackage);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public PackageEntity updatePackage(@RequestBody PackageEntity packageEntity) {
        return packageService.updatePackage(packageEntity);
    }





}
