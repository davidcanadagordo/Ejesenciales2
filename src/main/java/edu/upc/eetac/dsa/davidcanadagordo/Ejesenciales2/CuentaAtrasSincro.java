package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;

public class CuentaAtrasSincro extends Thread {
	 
    String Identificador;
	 public static String Ultima;
    int Tiempo;
 
	
	public CuentaAtrasSincro(String id, int t)  //constructor con datos de contador
	{
		this.Identificador = id;
		this.Tiempo=t;
		
	}
   public synchronized void Ultima(){
		
   	Ultima=Thread.currentThread().getName();
   	System.out.println("Identificador" + Identificador + "última escritura:"+ Ultima);
		
	}

	public void run() {
		
		try {
		
			
			while (Tiempo >= 0)
			{
				
				Tiempo--;
				Thread.sleep(1000);
				Ultima();
				
					
		    }
			
			int threads = Thread.activeCount();
			System.out.println("identificador" +Thread.currentThread().getName()+ "Numero de threads activos" +threads );
		    
		    }
		
	           catch (InterruptedException e){
		        return;
		    } 
		
	 }

	

	



}
