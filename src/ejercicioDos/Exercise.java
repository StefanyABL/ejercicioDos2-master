package ejercicioDos;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercise {
	public static void main (String [] args){
		/*
		String chainOne = new String  ("uptc");
		String chainTwo = new String ("unad");
		System.out.println(chainOne.equals(chainTwo  )?"iguales":"diferentes ");
		System.out.println(chainOne.compareTo(chainTwo)); 
		*/
		String cad = "en el mundo existen 10 tipos de personas, los que leen binario y los que no";
		for (int i = 0; i < cad.length(); i++) {
			 System.out.println(cad.charAt(i));
			
		}
		//System.out.println(cad.indexOf("x"));
		/*
		String [] tokens  = cad.split(" ");
		for (String s : tokens) {
			System.out.println(s);
			
			
		}
		*/
		StringTokenizer tokens = new StringTokenizer (cad);
		while (tokens.hasMoreElements () ){
			System.out.println(tokens.nextToken());
		}
	}

}
