package decorator;

public class decorator {
	public static void main(String[] args) {
		
        Cafe cafe = new CafeSimple();
        System.out.println(cafe.descripcion()); 
        System.out.println("Costo: Q" + cafe.costo());
        
        cafe = new ConLeche(cafe);
        System.out.println(cafe.descripcion()); 
        System.out.println("Costo: Q" + cafe.costo());
        
        cafe = new ConPostre(cafe);
        System.out.println(cafe.descripcion()); 
        System.out.println("Costo: Q" + cafe.costo());
	}
}
