package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;

public class CuentaAtras implements Runnable {

	
	String Identificador;
	int Tiempo;
	
	public CuentaAtras(String id, int t)  //constructor con datos de contador
	{
		this.Identificador = id;
		this.Tiempo=t;
	}
	

	public void run() {
		try{
			while (Tiempo != 0)
			{
				Tiempo--;
				Thread.sleep(1000);
			}
			
			System.out.println("identificador" + Identificador);
		}
	   catch (InterruptedException e){
		 return;
		} 
		
	 
}
}
	
	

