package com.gft.app.gtfmenu;

import java.util.Scanner;

public class GFTConsoleMenuDemo {

	public static void main(String[] args) {
				
	    int entradaValor;

	    
	    mostraMenu();
	    entradaValor = EntradaDados.inInt(" Selecione uma opcao: ");
	   
	    switch (entradaValor) {
	    case 1:
	      System.out.println("Cardápio da Manhã Selecionado");
	      
			geradorSubMenu();
	      
			executarSubMenu(1);
          
	      break;
	    case 2:
	      System.out.println("Cardápio da Noite selecionado");
	      
	      geradorSubMenu();
	      
	      executarSubMenu(2);
	      	                	   
	      break;
	    case 3:
	      System.out.println("Sair foi selecionado");
	      break;
	    default:
	      System.out.println("Seleção Invalida");
	      
	    }
	}

	private static void mostraMenu() {
		System.out.println("============================");
	    System.out.println("|   MENU SELECTION DEMO    |");
	    System.out.println("============================");
	    System.out.println("| Options:                 |");
	    System.out.println("|        1. Manha          |");
	    System.out.println("|        2. Noite          |");
	    System.out.println("|        3. Sair           |");
	    System.out.println("============================");
	}

	private static void geradorSubMenu() {
		System.out.println("============================");
		    System.out.println("|   MENU SELECTION DEMO    |");
		    System.out.println("============================");
		    System.out.println("| Options:                 |");
		    System.out.println("|        1. Entrada        |");
		    System.out.println("|        2. Acompanhamento |");
		    System.out.println("|        3. Bebida         |");
		    System.out.println("|        4. Sobremessa     |");
		    System.out.println("============================");
	}

	private static void executarSubMenu(int escolha) {
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
