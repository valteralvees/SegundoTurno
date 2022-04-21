package segundoturno;
import java.util.Scanner;
public class SegundoTurno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de votos do primeiro candidato:");
        int votos1 = teclado.nextInt();
        System.out.println("Digite a quantidade de votos do segundo candidato:");
        int votos2 = teclado.nextInt();
        System.out.println("Digite a quantidade de votos do terceiro candidato:");
        int votos3 = teclado.nextInt();
        if(votos1 > votos2 + votos3) {
            System.out.println("Não haverá segundo turno. Candidato 1 ELEITO");
        } else if(votos2 > votos1 + votos3) {
            System.out.println("Não haverá segundo turno. Candidato 2 ELEITO");
        } else if(votos3 > votos1 + votos2) {
            System.out.println("Não haverá segundo turno. Candidato 3 ELEITO");
        } else {
            System.out.println("Haverá segundo turno. Nenhum dos candidatos alcançou a quantidade mínima de votos para ser eleito em 1o turno.");
        }
        
    }
    
}
