/**
 * 
 */
package bytebank_heredado;

/**
 * @author Marlon
 *
 */
public class TestFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setDocumento("334534534534");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());

	}

}
