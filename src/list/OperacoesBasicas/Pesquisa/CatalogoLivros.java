package list.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();

        }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("Moby Dick", "Herman Melville", 1851);
        catalogoLivros.adicionarLivro("Guerra e Paz", "Leon Tolstói", 1869);
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel Garcia Marquez", 1967);
        catalogoLivros.adicionarLivro("Ulisses", "James Joyce", 1922);
        catalogoLivros.adicionarLivro("A Odisséia", "Homero", -800);
        catalogoLivros.adicionarLivro("Crime e Castigo", "Fiódor Dostoiévski", 1866);

        System.out.println(catalogoLivros.pesquisarPorAutor("James Joyce"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1800, 1900));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Crime e Castigo"));
    }



}
