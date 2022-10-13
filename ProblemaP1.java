import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProblemaP1 {

static void maximoNumeroRespeticiones(String cadena, String subcadena, int m) {
		
	}
	
	
	static int repeticionesSubcadena(String cadena, String subcadena)
	{
	    int c = cadena.length();
	    int s = subcadena.length();
	 
	    int matriz[][] = new int[c + 1][s + 1];
	 
	    for (int j = 0; j <= s; ++j)
	        matriz[0][j] = 0;
	 

	    for (int i = 0; i <= c; ++i)
	        matriz[i][0] = 1;
	 
	    for (int i = 1; i <= c; i++)
	    {
	        for (int j = 1; j <= s; j++)
	        {
	            if (cadena.charAt(i - 1) == subcadena.charAt(j - 1))
	                matriz[i][j] = matriz[i - 1][j - 1] +
	                               matriz[i - 1][j];
	                 
	            else
	                matriz[i][j] = matriz[i - 1][j];
	        }
	    }
	 
	    return matriz[c][s]; 
	}
	 
	
	public static void main (String[] args) throws Exception
	{
	    String cadena = "GeeksforGeeks";
	    String subcadena = "Gks";
	    
	    /* 
	     ProblemaP1 instancia = new ProblemaP1();
		try ( 
			InputStreamReader is= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
		) { 
			String line = br.readLine();
			int casos = Integer.parseInt(line);
			line = br.readLine();
			for(int i=0;i<casos && line!=null && line.length()>0;i++) {
				final String [] dataStr = line.split(" ");
				final String cadena = dataStr[0];
				final String subcadena = dataStr[1];
				final int m = parseInt(dataStr[2]);
				if (subcadena.length == 2 && cadena.length >= 2 && cadena.length <= 1000 && m >= 0 && cadena.length >= m){
				int respuesta = instancia.maximoNumeroRespeticiones(cadena, subcadena, m);
				System.out.println(respuesta);
				}
				line = br.readLine();
			}
		}
	}
	     */
	     
	    System.out.println(repeticionesSubcadena(cadena, subcadena));
	}
}

