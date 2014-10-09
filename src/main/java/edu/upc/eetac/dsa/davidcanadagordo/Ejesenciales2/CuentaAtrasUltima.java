package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;

public class CuentaAtrasUltima extends Thread{
	
	String Identificador;
	int Tiempo;
	
	public CuentaAtrasUltima(String id, int t)  //constructor con datos de contador
	{
		this.Identificador = id;
		this.Tiempo=t;
	}
	

	public void run() {
		
			while (Tiempo >= 0)
			{
				Tiempo--;
			try{
				Thread.sleep(1000);
				
			  }
			catch (Exception e){
				
	        	e.printStackTrace();
		    } 
			
			if (Tiempo !=0 ){
			System.out.println("identificador" + Identificador);
			}
			else
			{
				System.out.println("identificador" + Identificador);
			}
		    
	        
			
		int numeroThreads = Thread.activeCount()-2;
		System.out.println( " Threads activos" +numeroThreads );
		}
		
	 
}
}
	
	




