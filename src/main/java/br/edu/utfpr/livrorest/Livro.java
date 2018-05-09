package br.edu.utfpr.livrorest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andreendo
 */
@XmlRootElement
public class Livro {
    long codigo;
    String titulo;
    String autor;
    int ano;
    double preco;
    
    //getters e setters
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(codigo);
        sb.append(",");
        sb.append(titulo);
        sb.append(",");
        sb.append(autor);
        sb.append(",");
        sb.append(ano);
        sb.append(",");
        sb.append(preco);
        return sb.toString();
    }
}
