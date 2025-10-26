import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        // Cadastrando autores e livros
        Autor autor1 = new Autor(1, "Machado de Assis", java.time.LocalDate.of(1839, 6, 21));
        Autor autor2 = new Autor(2, "Clarice Lispector", java.time.LocalDate.of(1920, 12, 10));

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        biblioteca.adicionarLivro(new Livro(1, "Dom Casmurro", autor1));
        biblioteca.adicionarLivro(new Livro(2, "A Hora da Estrela", autor2));
        biblioteca.adicionarLivro(new Livro(3, "Memórias Póstumas de Brás Cubas", autor1));

        while (true) {
            System.out.print("\nDeseja ver a lista de livros disponíveis? (SIM/NÃO): ");
            String resposta = sc.nextLine().trim().toUpperCase();

            if (resposta.equals("SIM")) {
                System.out.println("\n📚 Livros disponíveis:");
                for (Livro livro : biblioteca.listarLivrosDisponiveis()) {
                    System.out.println(livro);
                }

                System.out.print("\nDigite o ID do livro que deseja emprestar: ");
                int idLivro = Integer.parseInt(sc.nextLine());

                biblioteca.buscarLivroPorId(idLivro).ifPresentOrElse(livro -> {
                    if (livro.isDisponivel()) {
                        System.out.print("Digite seu nome: ");
                        String nomeCliente = sc.nextLine();
                        biblioteca.registrarEmprestimo(livro, nomeCliente);
                    } else {
                        System.out.println("❌ Este livro já foi emprestado.");
                    }
                }, () -> System.out.println("❌ Livro não encontrado."));

                System.out.println("\n👋 Obrigado por usar o sistema da biblioteca!");
                break;
            } else if (resposta.equals("NÃO")) {
                System.out.println("\n👋 Até a próxima!");
                break;
            } else {
                System.out.println("❗ Resposta inválida. Digite 'SIM' ou 'NÃO'.");
            }
        }

        sc.close();
    }
}
