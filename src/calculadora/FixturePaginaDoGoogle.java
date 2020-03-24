package calculadora;

import org.openqa.selenium.By;

import net.douglashiura.us.Fixture;

@Fixture("PaginaDoGoogle")
public class FixturePaginaDoGoogle {
	public void setPesquisa(String value) {
		Selenium.getInstancia().digite(By.name("q"),value);
	}

	public String getPesquisa() {
		return Selenium.getInstancia().getValor(By.name("btnK"));
	}

	public String getResultado() {
		return Selenium.getInstancia().getTexto(By.cssSelector("#cwos"));
	}

	public String getTitulo() {
		return Selenium.getInstancia().getTitulo();
	}

	public void toPaginaDoGoogle(String action) {
		if("Pesquisa Google".equals(action)) {
			Selenium.getInstancia().submeter(By.name("btnK"));
		}
		
		
	}
}