
import java.util.ArrayList;
import java.util.List;

public class AprendendoList {

	public static void main(String[] args) {
		
		List<String> livro = new ArrayList<String>();
		//add serve para incluir
		
		livro.add("Java");
		livro.add("Biblia");
		System.out.println("Lista completa " + livro);
		System.out.println("Consulta primeiro livro " + livro.get(0));
		livro.set(0, "Java");
		System.out.println("Livro de java atualizado para " + livro);
		livro.remove(0);
		System.out.println("Livro removido "+ livro);
	
	}

}
