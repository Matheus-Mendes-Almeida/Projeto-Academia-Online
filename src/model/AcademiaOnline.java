package model;

import java.util.ArrayList;

public class AcademiaOnline {
	private ArrayList<Usuario> usuarios;

    public AcademiaOnline() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String email, String senha) {
        usuarios.add(new Usuario(nome, email, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public Usuario fazerLogin(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.verificarSenha(senha)) {
                return usuario;
            }
        }
        return null;
    }
}
