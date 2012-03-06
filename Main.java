/**
 * Clase Main
 * @author Santiago
 *
 */
public class Main {

	public static void main(String[] args){
		Menus m = new Menus();
		Personas personas = new Personas();
		int op=0;


		//Utlizamos el switch para marcar las opciones del menu y cuando pulsen un numero les lleve a la acción que tiene que realizar.
		do{
			op = m.menuinicial();
			switch(op){
			case 1: personas.introduirEstudiante();break;
			case 2: personas.mostrarEstudiante();break;
			case 3: personas.mostrarunEstudiante();break;
			case 4: personas.introducirProfesores();break;
			case 5: personas.mostrarProfesor();break;
			case 6: m.Salir();break;
			}			
		}while(op!=6);
	} 


}
