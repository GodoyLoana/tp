package pronosticodeportivo;

import java.util.Scanner;

public class main {


	
	
	public static void main(String[] args) {

//teclado
		 Scanner teclado = new Scanner(System.in);
	     
		 //declaramos e ingresamos la informacion por parametros
		 
		  ResultadoPartido  equipo1 =new ResultadoPartido ("Bolivia"," Gano",2);
	
		  ResultadoPartido  equipo2 =new ResultadoPartido("Brasil","perdio",1);
		  
		  //declaramos un arreglo
		    
		  Pronostico[]  pr  =new Pronostico [2];
		  
		 //comparamos para ver quien es el equipo ganador
		   if(equipo1.getGoles()>equipo2.getGoles()) {
		    	 
		    	  System.out.println("el equipo ganador es"+equipo1);
		   }
		     else {
		    		  
		    		  System.out.println("el equipo ganador es"+equipo2);
		    		  
		    	  }
		   
		
	
    //LEEMOS EL RESULTADO DEL PARTIDO
  
   
       System.out.println(equipo1.dameinformacion());
       System.out.println(equipo2.dameinformacion());
       
       

       //preguntamos a dos usuarios eel pronosico
	 
	     
	
	
			for(int i=0;i<2;i++) {
				 System.out.println("Introduzca el nombre");
			String nombre= teclado.nextLine();
				    	 
				 System.out.println("Introduzca descripcion");
					String descripcion= teclado.nextLine();
				
				
				   System.out.println("Introduzca cantidad de goles ");
				   
				int cant = teclado.nextInt();
				   teclado.nextLine();
				     
		 
		  
			}
		
		   
		//mostramos por pantalla el pronostico
		for(Equipo elemento1 :pr) {
		
			System.out.println(elemento1.dameinformacion());
		
		}

	
 
    	  
			//COMPARAMOS SI ACERTO O NO AL RESULTADO
	
	       if((equipo1.getGoles()==pr.getGoles()) && (equipo1.getNombre()==pr.getNombre())) {
	    	   
	    	  System.out.println("FELICIDADES ACERTÓ");
	    	  
	       }
	       else {
	    	   System.out.println("LO LAMENTO NO ACERTÓ");
		    	  

		       if((equipo2.getGoles()==pr.getGoles()) && (equipo2.getNombre()==pr.getNombre()){
		    	   
		    	  System.out.println("FELICIDADES ACERTÓ");
		    	  
		       }
		       else {
		    	   System.out.println("LO LAMENTO NO ACERTÓ");
			    	  
	    	  
	    	  
	       }
	}
	

	}
}

