package com.jenifera.apimongodb.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenifera.apimongodb.app.dao.UsuarioDao;
import com.jenifera.apimongodb.app.documents.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}

	@Override
	public Optional<Usuario> findById(String id) {
		return usuarioDao.findById(id);
	}

	@Override
	public void save(Usuario usuario) {
		usuario.setNombre(usuario.getNombre().toUpperCase());
		usuarioDao.save(usuario);
	}

	@Override
	public void delete(Usuario usuario) {
		usuarioDao.delete(usuario);;
	}

	
}
