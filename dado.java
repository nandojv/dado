package profesercizi;

import java.util.Random;
import java.util.Scanner;



public class dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=1+6;
    
   
    String lancia;

     System.out.println("------lancia--------");

     Scanner sc = new Scanner(System.in); 
     lancia = sc.nextLine();

     Random dado=new Random();
     
     int d =dado.nextInt(num);
     System.out.println(d);
    
     if (d>num) System.out.println("errore valore");
     
	}
	

	 
}
	

