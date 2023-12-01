
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		banco Banco = new banco();
		
		cliente[] Cliente = new cliente[5];
		
		for (int i = 0; i < 5; i++) {
			Cliente[i] = new cliente(Banco);
			Cliente[i].start();
		}
	}
}
