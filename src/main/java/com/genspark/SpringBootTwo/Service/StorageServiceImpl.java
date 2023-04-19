package com.genspark.SpringBootTwo.Service;

import com.genspark.SpringBootTwo.DAO.StorageDAO;
import com.genspark.SpringBootTwo.Entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDAO;

    @Override
    public List<Storage> getAllStorages() {
        return null;
    }

    @Override
    public Storage getStorageById(int storageID) {
        return null;
    }

    @Override
    public Storage addStorage(Storage storage) {
        return null;
    }

    @Override
    public Storage updateStorage(Storage storage) {
        return null;
    }

    @Override
    public Storage deleteStorage(int storageId) {
        return null;
    }
}
