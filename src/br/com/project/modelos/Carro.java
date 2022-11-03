package br.com.project.modelos;

public class Carro {
	
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private Double valorPromedio;
	private Pessoa dono;
	
	
	
	public Carro() {
		
	}



	public Carro(String marca, String modelo, String placa, int ano, Double valorPromedio, Pessoa dono) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.valorPromedio = valorPromedio;
		this.dono = dono;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public Double getValorPromedio() {
		return valorPromedio;
	}



	public void setValorPromedio(Double valorPromedio) {
		this.valorPromedio = valorPromedio;
	}



	public Pessoa getDono() {
		return dono;
	}



	public void setDono(Pessoa dono) {
		this.dono = dono;
	}



	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", valorPromedio="
				+ valorPromedio + ", dono=" + dono + "]";
	}


	
	
}
