package com.springbatch.arquivodelimitado.repository;

import com.springbatch.arquivodelimitado.entity.ClienteDAO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteDAO, String> {
}
