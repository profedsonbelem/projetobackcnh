package br.com.arq.back.util;

import java.io.Serializable;
import java.util.Date;

 
public class DetalheErro implements Serializable {

  
	private static final long serialVersionUID = 1L;

	private String titulo;

    private Long status;

    private Date data;

    private String mensagemDesenvolvedor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMensagemDesenvolvedor() {
        return mensagemDesenvolvedor;
    }

    public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
        this.mensagemDesenvolvedor = mensagemDesenvolvedor;
    }
}
