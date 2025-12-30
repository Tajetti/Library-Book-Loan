import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        Autor autor1 = new Autor(1, "Machado de Assis", java.time.LocalDate.of(1839, 6, 21));
        Autor autor2 = new Autor(2, "Clarice Lispector", java.time.LocalDate.of(1920, 12, 10));

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        biblioteca.adicionarLivro(new Livro(1, "Dom Casmurro", autor1));
        biblioteca.adicionarLivro(new Livro(2, "A Hora da Estrela", autor2));
        biblioteca.adicionarLivro(new Livro(3, "Memórias Póstumas de Brás Cubas", autor1));

        while (true) {
            System.out.print("\nO que deseja fazer:");
            System.out.println();
            System.out.println("\n1. Lista de livros disponiveis");
            System.out.println("\n2. Lista de emprestimos");
            System.out.println("\n3. Sair");
            System.out.println();
            System.out.print("Opção: ");
            int resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == 1) {
                System.out.println("\n📚 Livros disponíveis:");
                for (Livro livro : biblioteca.listarLivrosDisponiveis()) {
                    System.out.println(livro);
                }

                System.out.print("\nDigite o ID do livro que deseja emprestar: ");
                int idLivro = Integer.parseInt(sc.nextLine());

                biblioteca.buscarLivroPorId(idLivro).ifPresentOrElse(livro -> {
                    if (livro.isDisponivel()) {
                        System.out.print("Digite seu nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite seu email: ");
                        String email = sc.nextLine();
                        Cliente cliente = new Cliente(nome, email);
                        biblioteca.registrarEmprestimo(livro, cliente);
                    } else {
                        System.out.println("❌ Este livro já foi emprestado.");
                    }
                }, () -> System.out.println("❌ Livro não encontrado."));

                System.out.println("\n👋 Obrigado por usar o sistema da biblioteca!");
            } else if(resposta == 2) {
                System.out.println("Lista de Emprestimos: ");
                System.out.println();
                biblioteca.listarEmprestimos();
            } else if (resposta == 3) {
                System.out.println("\n👋 Até a próxima!");
                break;
            } else {
                System.out.println("❗ Opção inválida!");
            }
        }

        sc.close();
    }
}
