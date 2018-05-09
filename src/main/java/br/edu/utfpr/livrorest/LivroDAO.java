package br.edu.utfpr.livrorest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreendo
 */
public class LivroDAO {
    List<Livro> livros;
    
    //metodos que salvam e recuperam dados
    //de algum meio permanente (arquivos, banco de dados)    
    public LivroDAO() {
        livros = new ArrayList<Livro>();
        
        Livro l1 = new Livro();
        l1.setCodigo(1234);
        l1.setTitulo("Codigo da Vinci");
        l1.setAno(2002);
        l1.setAutor("Dan Brown");
        l1.setPreco(35.55);
        livros.add(l1);
        l1 = new Livro();
        l1.setCodigo(6789);
        l1.setTitulo("Cem Anos de Solidao");
        l1.setAno(1998);
        l1.setAutor("Gabriel Garcia Marquez");
        l1.setPreco(40.05);
        livros.add(l1);

        l1 = new Livro();
        l1.setCodigo(2000);
        l1.setTitulo("Dom Casmurro");
        l1.setAno(1899);
        l1.setAutor("Machado de Assis");
        l1.setPreco(22.49);
        livros.add(l1);
    }
    
    List<Livro> getLivros() {
        return livros;
    }
    
    Livro getLivro(long id) {
        for(Livro l : livros)
            if(l.getCodigo() == id)
                return l;
        
        return null;
    }

    void salvar(Livro livro) {
        livro.setCodigo(System.currentTimeMillis());
        //salvar no BD aqui
    }

    Livro atualizar(long id, Livro livro) {
        Livro old = getLivro(id);
        
        if(old == null)
        {
            Livro t = new Livro();
            t.setTitulo("id invalido");
            return t;
        }
        
        if(livro.getAutor() != null && !livro.getAutor().equals(""))
            old.setAutor(livro.getAutor());
        
        return old;
    }

    String apagar(long id) {
        Livro l = getLivro(id);
        if(l == null)
            return "erro";
        
        return "livro " + id + " foi apagado";
    }
    
}
