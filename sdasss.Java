//programar es como cocinar, cuando usas python, por ejemplo tienes todos los ingrtedientes en tu mesa listos para ser usados, cuando usas java, tienes que crear el suelo y la tierra para plantar los alimentos que luego seran cultivados y finalmente usados como tus ingredientes. 
package asdasdasdasdas;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
//import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class sdasss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//leyendo una cantidad de elementos de biglist y poniendolos en un array list the numeros reales
		
		System.out.print("Cuantos n deseas leer desde el archivo biglist.txt ");  
		Scanner stringScanner = new Scanner(System.in);
	    String num = stringScanner.next();
	   
	    ArrayList<Integer> listDESORDENADA = new ArrayList<Integer>();
		
		Scanner s = new Scanner(new File("C:\\Users\\NW USER\\Downloads\\testing PY/biglist.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int counter = 0;
		while (s.hasNextInt()&& counter < Integer.parseInt(num) ){ 
			
		    list.add(s.nextInt());
		    counter++;
		}
		s.close();
		//System.out.println(list);
		
		 
	
		  System.out.println("\n\n---------Tiempo inicia---------");
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");  
		  LocalDateTime now = LocalDateTime.now();  
		  System.out.println(dtf.format(now));  
		  System.out.println("---------Tiempoo inicia---------");
		  
		  QuickSort qsu = new QuickSort(list);
	        System.out.println("---------Arreglo sin ordenar---------");
	        for(int i:qsu.getSortedArray()){
	        	listDESORDENADA.add(i);
	           System.out.print(i+" ");
	           
	        	
	        }
	        
	        
	        
	       
		
	     
	        qsu.startQuickStart(0, list.size()-1);
	        
	        
	        System.out.println("\n\n---------Arreglo ordenado---------");
	        for(int i:qsu.getSortedArray()){
	            System.out.print(i+" ");
	        }
		
	      
	   
	        System.out.println("\n\n---------Tiempo inicia---------");
	        System.out.println(dtf.format(now));  
			System.out.println("---------Tiempoo inicia---------");
	        
	      
	        System.out.println("\n---------Tiempo termina---------");
	        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");  
			LocalDateTime nowLaterLoL = LocalDateTime.now();  
			System.out.println(dtf1.format(nowLaterLoL));  
			System.out.println("---------Tiempoo termina---------");
			
			
			
		
		
	}
	
	
}






