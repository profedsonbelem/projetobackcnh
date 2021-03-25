package br.com.arq.controllers;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Usuario;
import br.com.arq.repository.ClienteRepository;
import br.com.arq.repository.UploadImagemRepository;
import br.com.arq.repository.UsuarioRepository;
import br.com.arq.service.UsuarioService;

@ResponseBody
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UsuarioController {


	@Autowired
	UploadImagemRepository imageRepository;

	@Autowired
	ClienteRepository cdao;

	@Autowired
	UsuarioRepository dao;

	@Autowired
	UsuarioService emailservice;
	
	@PostMapping("/gravar")
	public ResponseEntity<?> gravar(@RequestBody Usuario usu) {
		try {
			Usuario usuario = dao.save(usu);
			if (usuario == null) {
				throw new Exception("usuario nao gravado");
			}
			usuario.setEmail(usu.getEmail());
			emailservice.sendEmail(usuario);
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

//	ESSE AQUI FUNCIONA PELO POSTMAN
//	@PostMapping("/teste")
//	public ResponseEntity<?> testeEmail( @RequestBody Usuario usu){
//		try {
//			Usuario usuario = new Usuario();
//			usuario.setEmail(usu.getEmail());
//			emailservice.sendEmail(usuario);
//			return ResponseEntity.status(200).body(usuario);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return ResponseEntity.status(500).body(ex.getMessage());
//		}
//	}
//	
//	@PostMapping("/loginmin")
//	public ResponseEntity<?> logar( @RequestBody Usuario usu) {
//		try {
//			Usuario resp = usu;
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//			md.update((resp.getPassword() + chave).getBytes());
//			BigInteger hash = new BigInteger(1, md.digest());
//			String resposta1 = hash.toString(16);
//
//			resp.setPassword(resposta1);
//			Usuario resposta = dao.findByEmailAndPassword(usu.getEmail(), usu.getPassword());
//			if (resposta == null) {
//				throw new Exception("Email ou senha invalido");
//			}
//			return ResponseEntity.status(200).body("Logado: " + resposta);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
//
//		}
//	}

	@GetMapping("/buscarId/id/{id}")
	public ResponseEntity<?> buscarId(@PathVariable Long id) {
		Usuario resp = null;
		try {
			resp = dao.findById(id).get();

			if (resp == null) {
				throw new Exception("Email ou senha nao alterado");
			}

			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

	@PostMapping(value = "/sendmailcondfirma")
	public String sendmail(@RequestBody Usuario u) {
		try {
			Usuario resp = u;
			emailservice.sendEmail(u);
			Usuario resp2 = dao.findByEmail(u.getEmail());
			return "emailsent:" + resp2;
		} catch (Exception ex) {
			return "error:" + ex.getMessage();
		}
	}

	@GetMapping(value = "/confirmasenha/email/{email}")
	public String sendmailAlteraSenha(@PathVariable String email) {
		try {
			Usuario resp = dao.findByEmail(email);
			// emailservice.sendEmail(resp);
			Usuario resp2 = dao.findByEmail(resp.getEmail());
			return "emailsent:" + resp2;
		} catch (Exception ex) {
			ex.printStackTrace();
			return "error:" + ex.getMessage();
		}
	}

	@RequestMapping(value = "/createmin", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> createMin(@RequestBody Usuario usuario) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);
			usuario.setPassword(resposta1);
			Usuario resposta = dao.save(usuario);
			
			resposta.setEmail(usuario.getEmail());
			emailservice.sendEmail(resposta);
			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			ex2.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@RequestMapping(value = "/loginmin", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> loginMin(@RequestBody Usuario usuario) {
		try {
			Usuario resp = usuario;

			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((resp.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);
			resp.setPassword(resposta1);

			Usuario resposta = dao.findByEmailAndPassword(resp.getEmail(), resp.getPassword());
			if (resposta == null) {
				throw new Exception("Login Invalido");
			}
			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			ex2.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@RequestMapping(value = "/usuario/id/{id}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable("id") Long id) {
		try {
			Usuario usuario = dao.findById(id).get();
			if (usuario == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

	@RequestMapping(value = "/updateusuario/id/{id}", produces = "application/json", method = RequestMethod.PUT)
	public ResponseEntity<?> updateById(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
		try {
			Usuario u = dao.findById(id).get();
			if (u == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			u.setEmail(usuario.getEmail());
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);
			u.setPassword(resposta1);

			return ResponseEntity.status(200).body(u);
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

	@PostMapping("/esqueci")
	public ResponseEntity<?> buscarPorEmail(@RequestBody Usuario usu) {
		try {
			Usuario usuario = usu;
			Usuario resposta = dao.findByEmail(usu.getEmail());
			if (resposta == null) {
				throw new Exception("Email não encontrado");
			}
			usuario.setIdUsuario(resposta.getIdUsuario());
			usuario.setEmail(resposta.getEmail());
			usuario.setPassword("-1");
			usuario.setUsername(resposta.getUsername());
			usuario.setPerfil(resposta.getPerfil());
			usuario.setNivel(resposta.getNivel());
			dao.save(usuario);
			emailservice.sendEmailEsquece(usuario);
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

	@PutMapping("/alterar/email/{email}")
	public ResponseEntity<?> alterarSenha(@PathVariable String email, @RequestBody Usuario usu) {
		try {
			Usuario resp = dao.findByEmail(email);

			Usuario excluir = new Usuario();
			excluir.setUsername(resp.getUsername());
			excluir.setEmail(email);
			excluir.setPassword(resp.getPassword());
			excluir.setIdUsuario(resp.getIdUsuario());
			dao.delete(excluir);

			if (resp.getPassword().equals("-1")) {

				String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update((usu.getPassword() + chave).getBytes());
				BigInteger hash = new BigInteger(1, md.digest());
				String resposta1 = hash.toString(16);
				resp.setPassword(resposta1);
				resp.setEmail(email);

				dao.save(resp);
			} else {
				throw new Exception("Email ou senha nao alterado");
			}
			return ResponseEntity.status(200).body(usu);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

}
