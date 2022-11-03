package br.com.project.service;

import java.util.ArrayList;
import java.util.List;



import br.com.project.modelos.Carro;
import br.com.project.modelos.Loja;
import br.com.project.modelos.Pessoa;

public class Service {
	
	
	Loja l=new Loja();
	
	List<Carro>lista=new ArrayList<>();
		
	
	public void salvar(String marca, String modelo, String placa, int ano, Double valorPromedio,String nome,String cpf,String tel) {
		Carro c=new Carro();
		c.setMarca(marca);
		c.setModelo(modelo);
		c.setPlaca(placa);
		c.setAno(ano);
		c.setValorPromedio(valorPromedio);
		
		
		Pessoa p=new Pessoa();
		p.setNome(nome);
		p.setCpf(cpf);
		p.setTelefone(tel);
		
		c.setDono(p);
		
		lista.add(c);
		
		l.setCadastro(lista);
		
		
		}
	
	public void listarCarros(){
		for(int i=0;i<l.getCadastro().size();i++) {
			System.out.println("cadastrado numero "+(i+1)+":");
			System.out.println(l.getCadastro().get(i));
			}
		
	}
	
	public void listarPorAno() {
		for(int i=0;i<l.getCadastro().size();i++) {
			System.out.println("ano : ");
			System.out.println(l.getCadastro().get(i).getAno());
		}
	}
	public void marcasModelos() {
		for(int i=0;i<l.getCadastro().size();i++) {
			System.out.println("marca : ");
			System.out.println(l.getCadastro().get(i).getMarca());
			System.out.println("modelo");
			System.out.println(l.getCadastro().get(i).getModelo());
			
		}
		
	}
	public void placas() {
		for(int i=0;i<l.getCadastro().size();i++) {
			System.out.println("placa : ");
			System.out.println(l.getCadastro().get(i).getPlaca());
		}
		
	}
	public void quantidade() {
		l.setQuantidade(l.getCadastro().size());
		System.out.println(l.getQuantidade()+" Automovel cadastrados");
		
		Pessoa p=new Pessoa();
		p.setNome("rodrigo alvarez");
		p.setTelefone("(81)989614455");
		
		l.setPropretario(p);
		System.out.println("proprietario da loja: "+l.getPropretario().getNome());
		System.out.println("numero de contato: "+l.getPropretario().getTelefone());
	}

}
