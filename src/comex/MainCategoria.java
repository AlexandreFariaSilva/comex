package comex;

public class MainCategoria {

	public static void main(String[] args) {
	
		Categoria categoria1 = new Categoria(3, "INFORMATICA",StatusDaCategoria.DESATIVADO );
	
	
		
		Categoria categoria2 = new Categoria(1, "Moveis",StatusDaCategoria.ATIVADO);
	
		
		
		Categoria categoria3 = new Categoria(2, "livros",StatusDaCategoria.ATIVADO );
	
		
		
		
		
		
		
		
	
		
		System.out.println("CATEGORIA " + categoria1.getNome() + "(" + categoria1.getId()+" - " + categoria1.getStatus() + ")");
		System.out.println("CATEGORIA " + categoria2.getNome() + "(" + categoria2.getId()+" - " + categoria2.getStatus() + ")");
		System.out.println("CATEGORIA " + categoria3.getNome() + "(" + categoria3.getId()+" - " + categoria3.getStatus() + ")");
		
		
		
	}
}
