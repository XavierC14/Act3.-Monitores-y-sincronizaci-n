class cliente extends Thread{
	private banco Banco;
	
	public cliente(banco Banco) {
		this.Banco = Banco;
	}
	
	public void run() {
		try {
			Banco.ingresarBanco(this);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
