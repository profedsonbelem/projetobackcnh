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
public class UsuarioControllerMD {

	@Autowired
	UploadImagemRepository imageRepository;

	@Autowired
	ClienteRepository cdao;

	@Autowired
	UsuarioRepository dao;

	@Autowired
	UsuarioService emailservice;

	@PostMapping("/gerar")
	public ResponseEntity<?> generateToken(@RequestBody Usuario respusuario) throws NoSuchAlgorithmException {
		Usuario usuario = respusuario;
		usuario.setUsername(respusuario.getUsername());
		String token = UUID.randomUUID().toString();
		usuario.setToken(token);
		MessageDigest md = MessageDigest.getInstance("MD5");
		String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
		md.update((usuario.getPassword() + chave).getBytes());
		BigInteger hash = new BigInteger(1, md.digest());
		String resposta = hash.toString(16);
		usuario.setPassword(resposta);
		usuario.setToken(resposta + token);
		usuario.gerenciarPerfil();
		dao.save(usuario);
		return ResponseEntity.status(200).body("token:" + usuario.getToken());
	}

	@RequestMapping(value = "/createminPassw", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> createMinPassw(@RequestBody Usuario usuario) {
		try {

			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);
			Usuario resposta = dao.save(usuario);

			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			ex2.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

	@RequestMapping(value = "/login/token/{token}", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> login(@PathVariable("token") String token, @RequestBody Usuario usuario) {
		try {

			Usuario resp = usuario;
			String vtoken = token;
			System.out.println("token" + token);

			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((resp.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta = hash.toString(16);
			resp.setPassword(resposta);
			System.out.println(resp.getPassword());

			Usuario u = dao.findByEmailAndPassword(resp.getEmail(), resp.getPassword());

			System.out.println("usuario " + u);
			if (u == null) {
				throw new IllegalArgumentException("Erro no no dado do usuario");
			}
			if (!u.getToken().equals(vtoken)) {
				throw new IllegalArgumentException("Token Invalido");
			}

			return ResponseEntity.status(200).body(u);
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
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

			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			ex2.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@PostMapping("/gravar")
	public ResponseEntity<?> gravar(@RequestBody Usuario usu) {
		try {
			Usuario usuario = dao.save(usu);
			if (usuario == null) {
				throw new Exception("usuario nao gravado");
			}
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}

//	@GetMapping("/esqueci/{token}")
//	public ResponseEntity<?> buscarPorEmail(@PathVariable("token") String token) {
//		try {
//			String vtoken = token;
//			Usuario resposta = dao.findByToken(vtoken);
//			if (resposta == null) {
//				throw new Exception("Email não encontrado");
//			}
//			resposta.setIdUsuario(resposta.getIdUsuario());
//			resposta.setUsername(resposta.getUsername());
//			resposta.setEmail(resposta.getEmail());
//			resposta.setPassword("-1");
//			dao.save(resposta);
//			return ResponseEntity.status(200).body(resposta);
//		} catch (Exception ex) {
//			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
//		}
//	}

//	@PutMapping("/alterar/{id}/token/{token}")
//	public ResponseEntity<?> alterarSenha(@PathVariable Long id, @PathVariable String token, @RequestBody Usuario usu) {
//		try {
//			Usuario resp1 = dao.findByToken(token);
//			Usuario resp = dao.findById(id).get();
//			if ((resp1.equals(resp)) && (resp.getPassword().equals("-1"))) {
//				usu.setIdUsuario(resp.getIdUsuario());
//				usu.setUsername(resp.getUsername());
//				usu.setEmail(resp.getEmail());
//				usu.setPerfil(resp.getPerfil());
//				usu.setNivel(resp.getNivel());
//				dao.saveAndFlush(usu);
//			} else {
//				throw new Exception("Email ou senha nao alterado");
//			}
//			return ResponseEntity.status(200).body(usu);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
//		}
//	}

	@PostMapping("/loginmin")
	public ResponseEntity<?> logar(@PathVariable String token, @RequestBody Usuario usu) {
		try {
			Usuario resp = usu;
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((resp.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);

			resp.setPassword(resposta1);
			Usuario resposta = dao.findByEmailAndPassword(usu.getEmail(), usu.getPassword());
			if (resposta == null) {
				throw new Exception("Email ou senha invalido");
			}
			return ResponseEntity.status(200).body("Logado: " + resposta);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());

		}
	}

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

//	ENVIA EMAIL COM LINK
	@PostMapping(value = "/esqueci")
	public String esqueci(@RequestBody Usuario u) {
		try {
			Usuario resp = u;
			emailservice.sendEmailEsquece(u);
			Usuario resp2 = dao.findByEmail(u.getEmail());
			return "emailsent:" + resp2;
		} catch (Exception ex) {
			ex.printStackTrace();
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

	@RequestMapping(value = "/loginmin", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> loginMin(@RequestBody Usuario usuario) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
			md.update((usuario.getPassword() + chave).getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			String resposta1 = hash.toString(16);

			usuario.setPassword(resposta1);
			Usuario resposta = dao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
			if (resposta == null) {
				throw new Exception("Login Invalido");
			}
			return ResponseEntity.status(200).body(resposta);
		} catch (Exception ex2) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex2.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}

	}

	@RequestMapping(value = "/listaradm", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> findListar(@RequestBody Usuario usuario) {

		Usuario u = null;
		try {
			u = dao.findByEmail(usuario.getEmail());
			if (!u.getPerfil().equals("admin")) {
				throw new Exception("Email ou senha nao alterado");
			}

			return ResponseEntity.status(200).body(dao.findAll());

		} catch (Exception ex) {
			return ResponseEntity.status(500).body("usuario invalido");
		}
	}

	@RequestMapping(value = "/usuario/{token}", produces = "application/json", method = RequestMethod.POST)
	public ResponseEntity<?> findAll(@RequestBody Usuario usuario, @PathVariable("token") String token) {
		try {
			if (!usuario.getToken().equals(token)) {
				throw new IllegalArgumentException("Token Invalido");
			}
			return ResponseEntity.status(200).body(dao.findAll());
		} catch (Exception ex) {
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex.getMessage());
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

	// BUSCAR EMAIL
	@RequestMapping(value = "/usuario/email/{email}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<?> findByEmail(@PathVariable("email") String email) {
		try {
			Usuario usuario = dao.findByEmail(email);
			if (usuario == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

	@RequestMapping(value = "/usuario/{id}/token/{token}", produces = "application/json", method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable("id") Long id, @RequestBody Usuario usuario,
			@PathVariable("token") String token) {
		try {
			if (!usuario.getToken().equals(token)) {
				throw new IllegalArgumentException("Token Invalido");
			}

			Usuario u = dao.findById(id).get();
			if (u == null) {
				throw new IllegalAccessException("nao encontrado");
			}
			dao.delete(u);
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("msg-exclusao", "Dados Excluidos com sucesso");
			return ResponseEntity.status(200).body(mapa);
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
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("error-find", ex.getMessage());
			return ResponseEntity.status(404).body(mapa);
		}
	}

//	METODO DE ALTERAR AS SENHAS
//	@RequestMapping(value = "/usuario/id/{id}", produces = "application/json", method = RequestMethod.PUT)
//	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
//		try {
//			Usuario u = dao.findById(id).get();
//			if (u == null) {
//				throw new IllegalAccessException("nao encontrado");
//			}
//			u.setUsername(usuario.getUsername());
//			u.setPassword(usuario.getPassword());
//			u.setEmail(usuario.getEmail());
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			String chave = "profedsonbelem@gmail.comwww.arq.com.br=1=1+123;";
//			md.update((usuario.getPassword() + chave).getBytes());
//			BigInteger hash = new BigInteger(1, md.digest());
//			String resposta1 = hash.toString(16);
//
//			u.setPassword(resposta1);
//			// dao.setUsuarioInfoById(u.getPassword(), u.getIdUsuario());
//			return ResponseEntity.status(200).body("Dados gravados");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			Map<String, Object> mapa = new HashMap<String, Object>();
//			mapa.put("error-find", ex.getMessage());
//			return ResponseEntity.status(404).body(mapa);
//		}
//	}

//	@PatchMapping("/updatePassword/{idUsuario}")
//	public ResponseEntity<?> alterarCampo(@PathVariable("idUsuario") Long idUsuario, @RequestBody Usuario usuario) {
//		try {
//			Usuario buscaId = dao.findById(idUsuario).get();
//			if (buscaId == null) {
//				throw new Exception("Usuario nao encontrado");
//			}
//			Usuario dados = usuario;
//			buscaId.setPassword(dados.getPassword());
//			Usuario resposta = dao.save(buscaId);
//			return ResponseEntity.status(200).body(resposta);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			Map<String, String> mapa = new HashMap<String, String>();
//			mapa.put("error", ex.getMessage());
//			return ResponseEntity.status(500).body(mapa);
//		}
//	}
	
	
//	ALTERAÇÃO DA AULA
	@PostMapping("/esqueci")
	public ResponseEntity<?> buscarPorEmail(@RequestBody Usuario usu){
		try {
			Usuario usuario = usu;
			Usuario resposta = dao.findByEmail(usu.getEmail());
			if(resposta == null) {
				throw new Exception("Email não encontrado");
			}
			usuario.setIdUsuario(resposta.getIdUsuario());
			usuario.setEmail(resposta.getEmail());
			usuario.setPassword("-1");
			dao.save(usuario);
			return ResponseEntity.status(200).body(usuario);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}
	
	
	@PutMapping("/alterar/{id}")
	public ResponseEntity<?> alterarSenha(@PathVariable Long id, @RequestBody Usuario usu){
		try {
			Usuario resp = dao.findById(id).get();
			if(resp.getPassword().equals("-1")) {
				usu.setIdUsuario(resp.getIdUsuario());
				usu.setUsername(resp.getUsername());
				usu.setEmail(resp.getEmail());
				dao.saveAndFlush(usu);
			}else {
				throw new Exception("Email ou senha nao alterado");
			}
			return ResponseEntity.status(200).body(usu);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("Erro: " + ex.getMessage());
		}
	}
	

}
