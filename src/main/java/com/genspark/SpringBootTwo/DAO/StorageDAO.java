package com.genspark.SpringBootTwo.DAO;

import com.genspark.SpringBootTwo.Entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageDAO extends JpaRepository<Storage, Integer>{
}
