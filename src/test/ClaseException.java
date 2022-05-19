package n1.exercici4;

//Clase derivada de la clase base Exception, con el objeto de 
//introducir una excepcion especifica a mi aplicacion con un mensaje 
//determinado

public class ClaseException extends Exception {

	public ClaseException(String str) {
		super(str);
	}
	
}
