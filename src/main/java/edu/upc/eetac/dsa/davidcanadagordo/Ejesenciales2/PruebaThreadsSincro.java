package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;


public class PruebaThreadsSincro {


	public static void main(String args[])
	{
		try{
		
		CuentaAtrasSincro contador1 = new CuentaAtrasSincro("ID1", 4);
		contador1.start();
		CuentaAtrasSincro contador2 = new CuentaAtrasSincro("ID2", 7);
		contador2.start();
        CuentaAtrasSincro contador3 = new CuentaAtrasSincro("ID3", 8);
        contador3.start();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}

}
}