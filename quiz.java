import java.util.Scanner;
class Menu {
	public void op(int OPC) {
	    int OPC = 1;
	    String Nome;
	    Scanner ent = new Scanner(System.in);
	    System.out.print("Aperte 1 para adicionar jogador");
	    Sustem.out.print("Aperte 2 para jogar");
     	    OPC = ent.nextInt();
		  switch (OPC) {
		   case 1: 
		       System.out.print("Voce escolheu adicionar jogador");
                       Nome = ent.next();
		       break;
		   case 2:
		       System.out.print("Voce escolheu jogar");
		       break;
        		    }
			   }
	 }
}


