import java.time.LocalDate;

public class Emprestimo {
    private final int id;
    private final Livro livro;
    private final Cliente cliente;
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(int id, Livro livro, Cliente cliente) {
        this.id = id;
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolverLivro() {
        this.dataDevolucao = LocalDate.now();
        livro.setStatus(StatusLivro.DISPONIVEL);
    }

    @Override
    public String toString() {
        return "Id do livro: " + livro.getId() + "\n" +
                "Titulo do livro: " + livro.getTitulo()  + "\n" +
                "Nome do Autor: " + livro.getAutor().getNome() + "\n" +
                "Nome do Cliente: " + cliente.getName() + "\n" +
                "Email do Cliente: " + cliente.getEmail();
    }
}
