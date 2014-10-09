package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;



public class PruebaThreads {
	public static void main(String args[])
	{
		try{
		
		CuentaAtrasETh contador1 = new CuentaAtrasETh("ID1", 4);
		contador1.start();
		CuentaAtrasETh contador2 = new CuentaAtrasETh("ID2", 7);
		contador2.start();
        CuentaAtrasETh contador3 = new CuentaAtrasETh("ID3", 8);
        contador3.start();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}

}
}