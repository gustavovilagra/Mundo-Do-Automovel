package br.com.project.modelos;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	List<Carro>cadastro=new ArrayList<Carro>();
	private int quantidade;
	private Pessoa propretario;
	
	
	public Loja() {
		
	}


	public Loja(List<Carro> cadastro, int quantidade, Pessoa propretario) {
		super();
		this.cadastro = cadastro;
		this.quantidade = quantidade;
		this.propretario = propretario;
	}


	public List<Carro> getCadastro() {
		return cadastro;
	}


	public void setCadastro(List<Carro> lista) {
		this.cadastro = lista;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Pessoa getPropretario() {
		return propretario;
	}


	public void setPropretario(Pessoa propretario) {
		this.propretario = propretario;
	}


	@Override
	public String toString() {
		return "Loja [cadastro=" + cadastro + ", quantidade=" + quantidade + ", propretario=" + propretario + "]";
	}


}