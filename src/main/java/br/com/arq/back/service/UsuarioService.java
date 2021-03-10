package br.com.arq.back.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.arq.back.entity.Usuario;
import br.com.arq.back.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private UsuarioRepository dao;
	
	public void sendEmail(Usuario u) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(u.getEmail());
		msg.setSubject("<h2>Bem vindo a Cnh Help, Obrigado pela escolha<h2>");
		msg.setText("<br><b>Obrigado, agora faz parte de um grande time. " + u.getEmail());
		javaMailSender.send(msg);

	}
	

	public void sendEmailEsquece(Usuario u) throws Exception {
        	 MimeMessage msg = javaMailSender.createMimeMessage();
             
        	 Usuario resp = dao.findByEmail(u.getEmail());
        
             MimeMessageHelper helper = new MimeMessageHelper(msg, true);
             helper.setTo(u.getEmail());
             helper.setSubject("Esqueci minha senha");
             helper.setText("<h1>Esqueci minha senha<h1>", true);
             helper.setText("<br>Clicar para nesse Link <br/><a href='http://cnhhelp.com.br/#/authentication/forgot'>Esqueci Minha Senha</a>", true);
            
              javaMailSender.send(msg);

	}
	
	public void sendEmailAltera(Usuario u) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(u.getEmail());
		msg.setSubject("<h2>Senha Alterada Com sucesso <h2>" + u.getEmail());
		javaMailSender.send(msg);

	}

}