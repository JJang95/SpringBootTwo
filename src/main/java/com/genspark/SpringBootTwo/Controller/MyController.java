package com.genspark.SpringBootTwo.Controller;

import com.genspark.SpringBootTwo.Entity.Storage;
import com.genspark.SpringBootTwo.Service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to the Storage Room!</H1></HTML>";
    }

    @GetMapping("/storage")
    public List<Storage> getStorage() {
        return this.storageService.getAllStorage();
    }

    @GetMapping("/storage/{storageID}")
    public Storage getStorage(@PathVariable String storageID) {
        return this.storageService.getStorageById(Integer.parseInt(storageID));
    }

    @PostMapping("/storage")
    public Storage addStorage(@RequestBody Storage storage) {
        return this.storageService.addStorage(storage);
    }

    @PutMapping("/storage")
    public Storage updateStorage(@RequestBody Storage storage) {
        return this.storageService.updateStorage(storage);
    }

    @DeleteMapping("/storage/{storageID}")
    public Storage deleteStorage(@PathVariable String storageID) {
        return this.storageService.deleteStorage(Integer.parseInt(storageID));
    }

}
