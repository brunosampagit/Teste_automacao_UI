package steps;

import drivers.DriversFactory;
import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class PesquisarProdutosMLTeste extends DriversFactory {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@After
	public void fecharTeste() {
		Executa.fecharNavegador();
	}


	@Given("que eu esteja no site")
	public void queEuEstejaNoSite() {
		metodos.clicar(el.cookies);
		
	    
	}
	@When("pesquisar por duas produtos")
	public void pesquisarPorDuasProdutos() {
		metodos.escrever(el.campoBusca, "Iphone 13");
		metodos.enter(el.enter);
		metodos.clicar(el.iphone);
		metodos.evidencia("CT01 - Busca por Iphone");
		metodos.escrever(el.campoBusca, "PC gamer");
		metodos.enter(el.enter);
		metodos.clicar(el.pcGamer);
		metodos.scroll(0, 200);
		
		
		
	}
	
	@Then("validar o teste")
	public void validarOTeste() {
		metodos.evidencia("CT02 - Busca por Pc Gamer");
	}





}
