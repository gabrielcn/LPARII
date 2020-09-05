import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class exlerexterno {
	public static void main(String[] args) throws IOException {
	    Scanner entTextoExt = new Scanner(new File("amigos.txt"));
            Scanner entTextoExt2 = new Scanner(new File("friends.txt"));
            int aleat = (int) (Math.random()*2)+1;
            switch (aleat) {
            case 1:
	    for (int cont=1; cont<=6; cont++) {
             System.out.println(entTextoExt.nextLine());
             }
            break;
            case 2:
            for (int cont2=1; cont2<6; cont2++) {
             System.out.println(entTextoExt2.nextLine());
             }
            break;
		}
	}
}
