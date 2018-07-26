package com.gft.app.gtfmenu;

public class GFTConsoleMenuDemo {

	public static void main(String[] args) {
				
	    int entradaValor;

	    
	    GeraMenu.mostraMenu();
	    
	    entradaValor = EntradaDados.inInt(" Selecione uma opcao: ");
	   
	    switch (entradaValor) {
	    case 1:
	      System.out.println("Cardápio da Manhã Selecionado");
	      
			GeraSubMenu.geradorSubMenu();
	      
			CardapioUtil.executarSubMenu(1);
          
	      break;
	    case 2:
	      System.out.println("Cardápio da Noite selecionado");
	      
	      GeraSubMenu.geradorSubMenu();
	      
	      CardapioUtil.executarSubMenu(2);
	      	                	   
	      break;
	    case 3:
	      System.out.println("Sair foi selecionado");
	      break;
	    default:
	      System.out.println("Seleção Invalida");
	      
	    }
	}
}
