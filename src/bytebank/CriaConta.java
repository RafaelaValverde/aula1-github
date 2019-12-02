package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(3232, 1111);
		c1.depositar(200);
		System.out.println(c1.getSaldo());
		
		c1.depositar(100);
		System.out.println(c1.getSaldo());
		
		Conta c2 = new Conta(2223, 5555);
		c2.depositar(50);
		
		System.out.println(c2.getSaldo());
		
		c1.depositar(100);
		c1.sacar(20);
		System.out.println(c1.getSaldo());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Machado");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissão("Programador");
		
		Conta contaDoPaulo = new Conta(1212, 9999);
		contaDoPaulo.depositar(100);
		
		contaDoPaulo.setTitular(paulo); //composição
		System.out.println(contaDoPaulo.getTitular().getNome());
		
	}

}
