package com.jenifera.apimongodb.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jenifera.apimongodb.app.documents.Usuario;

public interface UsuarioDao extends MongoRepository<Usuario, String>{

}
