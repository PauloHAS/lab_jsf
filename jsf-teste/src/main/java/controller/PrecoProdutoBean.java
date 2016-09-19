package controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class PrecoProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3010195067263433371L;

	public double getPreco() {
		return 12.55;
	}
}
