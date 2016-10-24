import java.util.Vector;

public abstract class PLFE { // Play List File Element ya le cambie como 3 veces el nombre jaja

	public abstract int duracion();
	public abstract String toString(); // creo q aca no hace falta definirlo como abstracto... toString es de clase object
										// solo lo refedinimos en los hijos y listo.. creo..
	public abstract int cantPistas();
	
	public abstract Vector<PLFE> buscar(Condicion c);
	
	
	
}
