package calculadora;

import net.douglashiura.us.Fixture;

@Fixture("Inicio")
public class FixtureInicio {
	public void setUrl(String value) {
		Selenium.getInstancia().irNaUrl(value);
	}

	public void toPaginaDoGoogle(String action) {
	}
}