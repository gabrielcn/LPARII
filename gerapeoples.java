import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class gerapeoples {
 public static void main(String[] args) throws IOException {
  FileOutputStream arquivo = new FileOutputStream("lista1.txt");
  PrintWriter manipArq = new PrintWriter(arquivo);
  Scanner ent = new Scanner(System.in);
  String var;
  String var1;
  String var2;
  var = ent.next();
  var1 = ent.next();
  var2 = ent.next();
  manipArq.println(var + var1 + var2);
  manipArq.println("");
  manipArq.println("Gabriel; 18; Estudante");
  manipArq.println("Jose; 27; Pedreiro");
  manipArq.println("Fernando; 44; Historiador");
  manipArq.close();
  arquivo.close();
	}
}
