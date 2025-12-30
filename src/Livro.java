import java.time.LocalDate;

public class Livro {
    private final int id;
    private final String titulo;
    private final Autor autor;
    private StatusLivro status;
    private final LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.status = StatusLivro.DISPONIVEL;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public StatusLivro getStatus() {
        return this.status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
        this.dataAtualizacao = LocalDate.now();
    }

    public boolean isDisponivel() {
        return this.status == StatusLivro.DISPONIVEL;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + titulo + " - " + autor.getNome() +
                (status == StatusLivro.DISPONIVEL ? " (Disponível)" : " (Emprestado)");
    }
}
