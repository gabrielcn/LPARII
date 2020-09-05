//Programa que verifica a idade
//Autor:Gabriel Reis
import java.util.Scanner;
public class suaidade {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);//(System.in) = entrada via teclado
    int Idade;//Variável para números inteiros
    String Nome;//Variável para textos
    System.out.print("Nome: ");
    Nome = ent.next();//O objeto "ent" chama atraves do "." o método "next" que está dentro da classe Scanner
    System.out.print("Idade: ");
    Idade = ent.nextInt();//O objeto "ent" chama atraves do "." o método "nextInt" que está dentro da classe Scanner
    if (Idade < 18) {
     System.out.println(Nome +  ", voce é de menor. ");
    }
    else {
    System.out.println(Nome +   ", voce é de maior. ");
    }
  }
}
