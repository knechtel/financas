package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.*;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titular;
    private String banco;
    private String agencia;
    private String numero;

    @OneToMany(mappedBy="conta")
    private List<Movimentacao> listMoviementacao;

    public List<Movimentacao> getListMoviementacao() {
		return listMoviementacao;
	}

	public void setListMoviementacao(List<Movimentacao> listMoviementacao) {
		this.listMoviementacao = listMoviementacao;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
