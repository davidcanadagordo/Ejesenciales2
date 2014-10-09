package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;



public class PruebaThreadsRun {

	public static void main(String args[])
	{
		try{
			
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
	    CuentaAtras contador3 = new CuentaAtras("ID3", 8);
	    //empiezan threads
	    (new Thread(contador1)).start();
		(new Thread(contador2)).start();
		(new Thread(contador3)).start();
	
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
		}
		
	}