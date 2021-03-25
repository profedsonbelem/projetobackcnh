package br.com.arq.service;

import br.com.arq.entity.Usuario;

public interface IUsuarioService {
 
	void  sendEmail(Usuario u) throws Exception;
	void  sendEmailEsquece(Usuario u)  throws Exception;
	void  sendEmailAltera(Usuario u);
}
