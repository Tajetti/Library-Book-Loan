import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Autor> autores = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public Optional<Livro> buscarLivroPorId(int id) {
        return livros.stream().filter(l -> l.getId() == id).findFirst();
    }

    public void registrarEmprestimo(Livro livro, Cliente cliente) {
        if (!livro.isDisponivel()) {
            System.out.println("\n❌ Este livro já está emprestado!");
            return;
        }
        livro.setStatus(StatusLivro.INDISPONIVEL);
        Emprestimo emprestimo = new Emprestimo(emprestimos.size() + 1, livro, cliente);
        emprestimos.add(emprestimo);
        System.out.println("\n✅ Empréstimo realizado com sucesso!");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Cliente: " + cliente.getName());
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Não há empréstimos registrados");
            return;
        }

        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }
}
