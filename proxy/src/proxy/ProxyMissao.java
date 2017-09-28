package proxy;
import java.lang.SecurityException;


public class ProxyMissao implements AgenciaSecreta {

	private Missao missao;
	
	public ProxyMissao() {
		missao = new Missao("Milene", "desenho");
		System.out.println("Falha ao loggar. Essas são as unicas informações que voce pode ler:");
	}
	
	@Override
	public void pegaInformacaoPublica() {
		missao.pegaInformacaoPublica();
	}

	@Override
	public void pegaInformacaoSecreta() {
		System.out.println("Informação secreta: Confidencial.");
	}

}
