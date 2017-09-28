package proxy;

import java.util.Scanner;
import java.lang.SecurityException;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		AgenciaSecreta agencia;
		String nome = new String();
		String senha = new String();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("None:");
		nome = scanner.nextLine();
		System.out.println("Senha");
		senha = scanner.nextLine();
	
		try {
			agencia = new Missao(nome,senha);
		}
		catch (SecurityException except){
			agencia = new ProxyMissao();	
		}
		
		agencia.pegaInformacaoPublica();
		agencia.pegaInformacaoSecreta();
		
		scanner.close();
		
	}

}
