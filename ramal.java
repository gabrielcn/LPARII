import java.util.Scanner;
class Ramais {
	public void op(var1) {
	   switch (var1) {
		case 110:
		 System.out.println("Recep. Laura");
		 break;
		case 120:
		 System.out.println("Prof. Caue");
		 break;
		case 130:
		 System.out.println("Coord. Ubirajara");
		 break;
		default:
		 System.out.println("Ramal inexistente.");
		}
	}
}
public class ramal {
    public static void main(String[] args) {
	  Ramais opc = new Ramais ();
	  Scanner ent = new Scanner(System.in);
	  int var1;
	  System.out.print("Digite o ramal: ");
	  var1 = ent.nextInt();
	  opc.op(var1);
       }
}
