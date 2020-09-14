import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class progjava {
        public static void main(final String[] args)throws  IOException {
        System.out.println("-------------");
        System.out.println("Sessão de cadastro");
        System.out.println("");
        // variável menu
        String nome;
        String email;
        String idade;
        //
         Scanner ent = new Scanner(System.in);
         System.out.println("Entre com o seu nome");
         System.out.print("Digite: ");
         nome = ent.next();
         System.out.println("");
         System.out.println("Entre com o seu e-mail");
         System.out.print("Digite: ");
         email = ent.next();
         System.out.println("");
         System.out.println("Entre com a sua idade");
         System.out.print("Digite: ");
         idade = ent.next();
         System.out.println("");
         System.out.println("Cadastro concluído com sucesso!");
         File arq = new File("info.xlsx"); //instanciar um objeto do tipo File
         arq.createNewFile(); //cria um arquivo (vazio)
         FileReader fr = new FileReader(arq); //construtor que recebe o objeto do tipo arq
         BufferedReader br = new BufferedReader(fr); //construtor que recebe o objeto do tipo FileReader
         //FileWriter fw = new FileWriter(info); construtor que recebe o objeto do tipo arquivo (substitui)
         FileWriter fw = new FileWriter(arq, true); // construtor que recebe também como argumento se o conteúdo será acrescentado
         BufferedWriter bw = new BufferedWriter(fw); //construtor recebe como argumento o objeto do tipo FileWriter
         bw.newLine(); //quebra de linha
         bw.write(nome); //escreve o conteúdo no arquivo
         bw.newLine(); //quebra de linha
         bw.write(email); //escreve o conteúdo no arquivo
         bw.newLine(); //quebra de linha
         bw.write(idade); //escreve o conteúdo no arquivo
         bw.newLine(); //quebra de linha
         bw.close(); //fecha os recursos
         fw.close(); //fecha os recursos
         System.out.println("");
         while(br.ready()) { //enquanto houver mais linhas
            String linha = br.readLine(); //lê a proxima linha
            System.out.println(linha); //faz algo com a linha
         }
         br.close(); //fecha os recursos
         fr.close(); //fecha os recursos 
    }
}
