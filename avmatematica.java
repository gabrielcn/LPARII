import java.util.Scanner;
class avmatematica {
	public static void main(String[] args) {
	    System.out.println("Avaliação de Matemática");
            Scanner ent = new Scanner(System.in);
            int p1 = 0;
            int var1;
            int resp1 = 234;
            String nome;
            int turma;
            System.out.print("Nome: ");
            nome = ent.next();
            System.out.print("Turma: ");
            turma = ent.nextInt();
            System.out.println("---------------------------------------------------");
            System.out.println("Questão 1 - Calcular os juros simples de R$ 1200,00 a 13%a.t por 4 meses e 15 dias.");
            System.out.println("1) 148");
            System.out.println("2) 234");
            System.out.print("Digite: ");
            var1 = ent.nextInt();
            if (var1 == resp1) {
             p1=p1+1;
             System.out.println("pontuação = " + p1);
             break;
           }
         }
}


