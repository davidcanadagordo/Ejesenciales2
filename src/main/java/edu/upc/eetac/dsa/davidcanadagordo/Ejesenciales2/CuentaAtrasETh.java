package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;

public class CuentaAtrasETh extends Thread {
	
	
	String Identificador;
	int Tiempo;
	
	public CuentaAtrasETh(String id, int t)  //constructor con datos de contador
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
		
		System.out.println("identificador"  +  Identificador);
		//System.out.println("Este es el thread : " + getName());
		//CuentaAtras miThread = new CuentaAtras(Identificador, Tiempo);
		//miThread.start();
		}
		
	 catch (InterruptedException e){
		 return;
		} 
		
	 }
}

