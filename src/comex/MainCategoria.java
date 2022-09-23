package comex;

public class MainCategoria {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria();
		
		categoria1.setNome("informatica ");
		categoria1.setStatus(true);
		
		Categoria categoria2 = new Categoria();
		
		categoria2.setNome("Moveis ");
		categoria2.setStatus(false);
		
		Categoria categoria3 = new Categoria();
		
		categoria3.setNome("livros ");
		categoria3.setStatus(true);
		
		
		
	
		
		System.out.println("CATEGORIA " + categoria1.getNome() + "(" + categoria1.getId()+" - " + categoria1.recuperaStatus() + ")");
		System.out.println("CATEGORIA " + categoria2.getNome() + "(" + categoria2.getId()+" - " + categoria2.recuperaStatus() + ")");
		System.out.println("CATEGORIA " + categoria3.getNome() + "(" + categoria3.getId()+" - " + categoria3.recuperaStatus() + ")");
		
		
		
	}
}
