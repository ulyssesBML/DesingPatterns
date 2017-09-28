package proxy;
import java.lang.SecurityException;

public class Missao implements AgenciaSecreta{
	
	public Missao(String agente, String senha){
		if(!(agente.trim().equals("Milene") & senha.trim().equals("desenho"))) {
			throw new SecurityException();
		}
	}

	@Override
	public void pegaInformacaoPublica() {
		System.out.println("Informação publica: A Russia é uma aliada");
	}

	@Override
	public void pegaInformacaoSecreta() {
		System.out.println("Informação secreta: A Russia é uma rival");
	}

}
