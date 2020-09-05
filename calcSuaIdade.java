import java.util.Scanner;
class Suaidade {
   private int idadeProt;
   void calcula(int anoatual, int anonasc) {
     idadeProt = anoatual - anonasc;
   }
   public int carrega() {
    return idadeProt;
   }
}
public class calcSuaIdade {
  public static void main (String[] args) {
    Suaidade pessoa = new Suaidade();
    Scanner ent = new Scanner(System.in);
    int anoatual;
    int anonasc;
    anoatual=ent.nextInt();
    anonasc=ent.nextInt();
    pessoa.calcula(anonasc,anoatual);
    System.out.println(pessoa.carrega());
  }
}
