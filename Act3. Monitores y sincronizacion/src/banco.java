class banco {
	private int clientes = 0;
	private final int maximo = 2;
	
	public synchronized void ingresarBanco(cliente Cliente) throws InterruptedException{
		while (clientes >= maximo) {
            System.out.println("Cliente " + Cliente.getId() + " está esperando para ingresar al banco.");
            wait();			
		}
		
		clientes++;
		System.out.println("Cliente " + Cliente.getId() + " ha ingresado al banco.");
		
		Thread.sleep(2000);
		
		clientes--;
		System.out.println("Cliente " + Cliente.getId() + " ha salido del banco.");
		
		notify();
	}
}
