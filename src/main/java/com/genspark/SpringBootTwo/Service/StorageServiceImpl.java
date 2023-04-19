package com.genspark.SpringBootTwo.Service;

import com.genspark.SpringBootTwo.DAO.StorageDAO;
import com.genspark.SpringBootTwo.Entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDAO;

    @Override
    public List<Storage> getAllStorage() {
        return this.storageDAO.findAll();
    }

    @Override
    public Storage getStorageById(int storageID) {
        Optional<Storage> s = this.storageDAO.findById(storageID);
        Storage storage = null;

        if(s.isPresent()) {
            storage = s.get();
        }
        else {
            throw new RuntimeException("Storage not found for: " + storageID);
        }

        return storage;

    }

    @Override
    public Storage addStorage(Storage storage) {
        return this.storageDAO.save(storage);
    }

    @Override
    public Storage updateStorage(Storage storage) {
        return this.storageDAO.save(storage);
    }

    @Override
    public String deleteStorage(int storageId) {
        this.storageDAO.deleteById(storageId);
        return "Storage item deleted with ID: " + storageId;
    }
}
