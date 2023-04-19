package com.genspark.SpringBootTwo.Service;

import com.genspark.SpringBootTwo.Entity.Storage;

import java.util.List;

public interface StorageService {

    List<Storage> getAllStorages();
    Storage getStorageById(int storageID);
    Storage addStorage(Storage storage);
    Storage updateStorage(Storage storage);
    Storage deleteStorage(int storageId);
}
