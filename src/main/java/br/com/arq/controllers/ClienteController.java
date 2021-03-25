package br.com.arq.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Cliente;
import br.com.arq.repository.ClienteRepository;

@ResponseBody
@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository cdao;

	@GetMapping()
	public ResponseEntity<List<Cliente>> buscarTodos() {
		List<Cliente> resp = cdao.findAll();
		return ResponseEntity.status(200).body(resp);
	}

	@PostMapping("/create")
	public ResponseEntity<?> createCliente(@RequestBody Cliente cliente) {
		try {
			Cliente resp = cdao.save(cliente);
			if (resp == null) {
				throw new IllegalArgumentException("Dados Invalidos do Cliente");
			}
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

	@GetMapping("/findByEmail/{email}")
	public ResponseEntity<?> logarCliente(@PathVariable("email") String vemail) {
		try {
			Cliente resp = cdao.findByEmailCliente(vemail);
			if (resp == null) {
				throw new IllegalArgumentException("Dados Invalidos do Cliente");
			}
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ex.printStackTrace();
			Map<String, Object> mapa = new HashMap<String, Object>();
			mapa.put("usuario-error", ex.getMessage());
			mapa.put("status", "nao gravado");
			return ResponseEntity.status(500).body(mapa);
		}
	}

}
