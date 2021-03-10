package br.com.arq.back.service;

import br.com.arq.back.entity.Usuario;

public interface IUsuarioService {
 
	void  sendEmail(Usuario u);
	void  sendEmailEsquece(Usuario u)  throws Exception;
	void  sendEmailAltera(Usuario u);
}
