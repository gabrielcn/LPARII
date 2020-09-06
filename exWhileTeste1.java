import java.util.Scanner;
public class exWhileTeste1 {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   int OPC = 1;
   while (OPC == 1) {
    System.out.println("Olá, 1 para continuar: ");
    OPC = entrada.nextInt();
   }
    System.out.println("Tchauzinho...");
  }
}
