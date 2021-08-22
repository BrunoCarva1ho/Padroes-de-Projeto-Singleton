package pacote;

public class Main {
	public static void main(String[] args) {
		
		AprendendoSingleton teste = AprendendoSingleton.ConstroiObj();
		
		teste.setNome("Bruno");
		teste.setAnoNascimento(2021);
		
		System.out.println(teste);
		
		AprendendoSingleton teste2 = AprendendoSingleton.ConstroiObj();

		System.out.println(teste2);
		
		if(teste == teste2) 
			System.out.println("As duas instâncias possuem o mesmo endereço");
		
	}
}
