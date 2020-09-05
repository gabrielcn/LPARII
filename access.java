import java.util.Timer;
import java.util.Scanner;
public class access {
 public static void main(String[] args) {
 System.out.println("");
 System.out.println("Bem vindo(a) ao Access");
 System.out.println("______________________");
 //criação de variaveis e objetos
 //int x;
 //int xr;
 Scanner ent = new Scanner(System.in);
 //System.out.println("DIGITE O HORARIO NESSE EXATO MOMENTO SEM SER FORMATO DE 24H SEM OS DOIS PONTOS");
 //System.out.print("Digite: ");
 //x = ent.nextInt();
 Timer cronometro = new Timer();
 TimerTask tarefa = new TimerTask() {
  public void run() {
  System.out.println("aaa");
    }
   }
  int milissegundos = 1000;
  cronometro.schedule(tarefa, milissegundos);
 }
}
