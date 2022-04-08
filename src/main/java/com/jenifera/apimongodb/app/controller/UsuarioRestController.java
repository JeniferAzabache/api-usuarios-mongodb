package com.jenifera.apimongodb.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenifera.apimongodb.app.dao.UsuarioDao;
import com.jenifera.apimongodb.app.documents.Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

	@Autowired
	private UsuarioDao usuarioDao;

	@GetMapping()
	public List<Usuario> index() {
		List<Usuario> list = usuarioDao.findAll();
		return list;
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Usuario usuario){
		usuarioDao.save(usuario);
		return new ResponseEntity("Usuario creado",HttpStatus.CREATED);
	}
	
	

}
