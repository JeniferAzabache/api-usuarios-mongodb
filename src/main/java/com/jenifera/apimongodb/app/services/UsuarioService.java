package com.jenifera.apimongodb.app.services;

import java.util.List;
import java.util.Optional;

import com.jenifera.apimongodb.app.documents.Usuario;

public interface UsuarioService {
	public List<Usuario> findAll();
	public Optional<Usuario> findById(String id);
	public void save(Usuario usuario);
	public void delete(Usuario usuario);
}
