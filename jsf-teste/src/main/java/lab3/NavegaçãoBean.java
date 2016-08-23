package lab3;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Navega��oBean implements Serializable {

	private static final long serialVersionUID = -4085796118678663233L;

	public String navegacaoDinamicaIndex() {
		return "index";
	}
	
	public String navegacaoDinamicaPagina1(){
		return "pagina1";
	}
	
	public String navegacaoDinamicaExplicaIndex(){
		return "navegacaoExplicitaIndex";
	}
	
	public String navegacaoDinamicaExplicaPagina1(){
		return "navegacaoExplicitaPagina1";
	}

}
