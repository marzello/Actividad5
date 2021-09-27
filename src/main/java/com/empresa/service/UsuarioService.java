package com.empresa.service;

import java.util.List;


import com.empresa.entity.Usuario;

public interface UsuarioService {
	
	
	public abstract List<Usuario> listaUsuario();

	public abstract Usuario insertaActualizaUsuario(Usuario obj);

}
