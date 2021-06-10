package dogmania.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class hiController implements Serializable{

	private String teste = "Hi World! How r u?";
	
	public String getTeste() {
		return teste;
	}
	
	public void setTeste(String teste) {
		this.teste = teste;
	}
}
