package modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Usuario;

public class UsuarioTest {

	private Usuario u1, u2, u3, u4;
	
	@BeforeEach
	void inicializarUsuarios() {
		u1 = new Usuario("Lucas Cintra", "lucascin@gmail.com", "senha123");
		u2 = new Usuario("Luiz Gustavo Brancalhao", "luizguga@gmail.com", "pandabranco");
		u3 = new Usuario("Joao vitor Bicalho", "galo>cruzeiro@gmail.com", "matheusrei");
		u4 = new Usuario("Laura Almeida", "lauraAlm@gmail.com", "laurasobrinha");
	}
	
	@Test
	void testVerificarSenha() {
		assertFalse(u1.verificarSenha("senha1234"));
		assertTrue(u2.verificarSenha("pandabranco"));
		assertFalse(u3.verificarSenha("matheusre"));
		assertTrue(u4.verificarSenha("laurasobrinha"));
	}
	
}
