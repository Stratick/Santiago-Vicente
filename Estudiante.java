//El extends es para poner que estudiantes es una subclase de persona
/**
 * Clase Estudiante
 * @author Santiago
 * @version 1.0
 */
public class Estudiante  extends Persona{
	private String curs;
	private String matricula;

	public Estudiante(String nom, String llinatges, byte edat, int telefon,
			String curs, String matricula) {
		super(nom, llinatges, edat, telefon);
		this.curs = curs;
		this.matricula = matricula;
	}

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nom, String llinatges, byte edat, int telefon) {
		super(nom, llinatges, edat, telefon);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Nos devuelve el dato del curso		
	 * @return
	 */
	public String getCurs() {
		return curs;
	}
	/**
	 * Introducimos el dato de curso
	 * @param curs
	 */
	public void setCurs(String curs) {
		this.curs = curs;
	}
	/**
	 * Nos devuelve el dato de matrícula
	 * @return
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * Introducimos el dato de matrícula
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * Te imprime los datos de persona y de estudiante.
	 */
	@Override
	public String toString() {
		return "Estudiante [curs:" + curs + ", matricula:" + matricula
				+ ", Nom:" + getNom() + ", Llinatges:" + getLlinatges()
				+ ", Edat:" + getEdat() + ", Telefon:" + getTelefon()
				+ "]";
	}




}







