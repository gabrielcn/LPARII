import java.util.Scanner;
  public class testeperg {
   public static void main(String[] args) {
   Scanner ent = new Scanner(System.in);
   String a = "a";
   String var;
   System.out.println("1 - Em que ano nasceu Gabriel Reis");
   System.out.println("a) 2000");
   System.out.println("b) 2001");
   System.out.println("c) 2005");
   System.out.println("d) 1998");
   System.out.print("Digite a letra da resposta: ");
   var = ent.nextLine();
   if(a.equals(var)) {
      System.out.println("Parabens acertou");
   }
   else {
        System.out.println("Voce errou");
   }
 }
}
