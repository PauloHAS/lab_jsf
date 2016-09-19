package primefaces.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 7925452399955238534L;
	
	private String nome;
	private String email;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
	public void cadastrar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Senha: " + this.senha);
		
	}
	
	public void verificarDisponibilidade(){
		
		FacesMessage msg = null;
		if("joão".equalsIgnoreCase(this.nome)){
			msg=new FacesMessage("Usúario Indisponível");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		}else{
			msg=new FacesMessage("Usuario Disponivel");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
