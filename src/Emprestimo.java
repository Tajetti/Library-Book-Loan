import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private Livro livro;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(int id, Livro livro, String nomeCliente) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolverLivro() {
        this.dataDevolucao = LocalDate.now();
        livro.setDisponivel(true);
    }

    @Override
    public String toString() {
        return "Empréstimo ID " + id + ": " + livro.getTitulo() +
                " para " + nomeCliente + " em " + dataEmprestimo;
    }
}
