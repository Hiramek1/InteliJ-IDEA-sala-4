import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Usuario u = new Usuario("Ly ", "85 99634-8545 ", 66781230, 123456);

		System.out.println("------------ Cadastrar Usuario ------------");
		System.out.println("Digite o nome: ");
		u.setNome(teclado.next());
		System.out.println("Digite o telefone: ");
		u.setTelefone(teclado.next());
		System.out.println("Digite o CPF: ");
		u.setCpf(teclado.nextInt());
		u.incrementarMatricula(u.getMatricula());
		System.out.println(u.exibirInfo());
		
		Livro li = new Livro("Eclipse ", "Prof. Luis", 2022, 01, "Gama ", 1234);
		
		System.out.println("Dados do Livro: ");
		System.out.println(li.exibirInfo1());
		
		Exemplar ex = new Exemplar(01234, false, false);
		
		System.out.println("Dados do Exemplar: "); 
		System.out.println(ex.exibirInfo2());
		
		Emprestimo emp = new Emprestimo( 3, "08/07/2022 ", "20/07/2022 ", "30/07/2022 ");
		
		System.out.println("Dados do Emprestimo: ");
		System.out.println(emp.exibirInfo3());
	}

}
