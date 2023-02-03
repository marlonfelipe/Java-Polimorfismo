/**
 * 
 */
package bytebank_heredado;

/**
 * @author Marlon
 *
 */
public class TestGerente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setNombre(null);
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));

	}

}
