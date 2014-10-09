package edu.upc.eetac.dsa.davidcanadagordo.Ejesenciales2;

public class PruebaThreadsUltima {

	public static void main(String args[])
	{
		try{
		
		CuentaAtrasUltima contador1 = new CuentaAtrasUltima("ID1", 4);
		contador1.start();
		CuentaAtrasUltima contador2 = new CuentaAtrasUltima("ID2", 7);
		contador2.start();
        CuentaAtrasUltima contador3 = new CuentaAtrasUltima("ID3", 8);
        contador3.start();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}

}
}


