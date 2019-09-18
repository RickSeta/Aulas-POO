package uff.ic.lleme.tcc00328.exercicios.blog;

import uff.ic.lleme.tcc00328.exercicios.blog.Model.Usuario;
import uff.ic.lleme.tcc00328.exercicios.blog.Model.Blog;
import uff.ic.lleme.tcc00328.exercicios.blog.Model.Nota;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sistema {

    private static Blog blogs[] = new Blog[100];
    private static Blog blogCorrente = null;

    public static void dialogoMenuPrincipal() {
        Usuario usuario = new Usuario();
        Scanner s = new Scanner(System.in);
        System.out.println("Innforme operacao");
        String operacao = s.nextLine();
        if (operacao.equals("criar"))
            dialogoDeNovoBlog(usuario);
    }

    public static void dialogoDeNovoBlog(Usuario usuario) {
        Scanner s = new Scanner(System.in);
        System.out.println("Innforme titulo do Blog");
        String titulo = s.nextLine();
        System.out.println("Innforme texto");
        String texto = s.nextLine();
        criarBlog(titulo, texto, usuario);
        // TODO Listar notas do BLOG
    }

    public static void dialogoDeNovaNota() {
        // criar janela de Nota
    }

    public static void criarNota(Blog blog, String titulo, String texto) {
        Nota nota = new Nota(titulo, texto);
        blogCorrente.incluirNota(nota);
        // atualizar interface de usuário
    }

    public static void criarBlog(String titulo, String texto, Usuario usuario) {
        try {
            blogCorrente = new Blog(titulo, texto, usuario);
            salvarBlog(blogCorrente);
            // abrir janela Blog
        } catch (NullPointerException e) {
            System.out.println("sdfkl");
        } catch (StringVazio e) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void main(String[] args) {
        dialogoMenuPrincipal();
    }

    private static void salvarBlog(Blog blogCorrente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
