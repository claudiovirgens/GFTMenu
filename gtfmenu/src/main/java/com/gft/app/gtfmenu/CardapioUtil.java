package com.gft.app.gtfmenu;

import java.util.Scanner;

public class CardapioUtil {

	static void executarSubMenu(int escolha) {
		Scanner input = new Scanner(System.in);
	      int[] numbers = new int[4];
	      
	      
	      if(escolha ==  1) {
	    	  
	    	  StringBuilder sb = new StringBuilder();
	    	  sb.append("Manhã ");
	    	  
	    	  for (int i = 0; i < numbers.length; i++)
	    	  {
	    		  System.out.println("Informe o numero referente ao prato");
	    		  
	    		  numbers[i] = input.nextInt();
	    		  
	    		  switch(numbers[i])
	    		  {
	    		  case 1:
	    			  sb.append(", Ovos");
	    			  break;
	    		  case 2:
	    			  sb.append(", Torradas");
	    			  break;
	    		  case 3:
	    			  sb.append(", café");
	    			  break;
	    		  case 4:
	    			  sb.append("");
	    			  break;
	    		  }
	    		  
	    	  }
	    	  System.out.println(sb.toString());
	    	  input.close();
	      }else if (escolha == 2) {
	    	  StringBuilder sb = new StringBuilder();
	            sb.append("Noite ");
	            
	            for (int i = 0; i < numbers.length; i++)
	            {
	                System.out.println("Informe o numero referente ao prato");
	                
	                numbers[i] = input.nextInt();
	                
	                switch(numbers[i])
	                {
	                    case 1:
	                    	sb.append(", Carne");
	                        break;
	                    case 2:
	                    	sb.append(", Batata");
	                    	break;
	                    case 3:
	                    	sb.append(", Vinho");
	                    	break;
	                    case 4:
	                    	sb.append(", Bolo");
	                    	break;
	                }
	                	        	    	                
	            }
	            System.out.println(sb.toString());
	            input.close();
	      }
	}

}
