import java.util.Scanner;
public class media {
   public static void main(String[] args) {
	//Criação de variáveis
	Scanner ent = new Scanner(System.in);//Criação de obejto na classe Scanner
	String Turma;//Criação de variável(texto)
	String Nome;//Criação de variável(texto)
	double Nota;//Criação de variável(número real)
	System.out.print("Nome: ");
	Nome = ent.next();
	System.out.print("Turma: ");
	Turma = ent.next();
	System.out.print("Nota: ");
	Nota = ent.nextDouble();
	if (Nota < 5) {
	 System.out.println(" REPROVADO");
	}
	else if (Nota < 6) {
	System.out.println( "RECUPERAÇÃO");
	}
   }
}
