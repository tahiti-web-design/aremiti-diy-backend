package twd.aremiti.diy.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
    public PackageEntity createPackage(@RequestParam(value = "descriptif", required = true) String descriptif) {
        return packageService.createPackage(descriptif);
    }





}
