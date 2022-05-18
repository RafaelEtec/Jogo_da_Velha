package Main;
import java.util.Random;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Jogo {
    
    public static Scanner ent = new Scanner(System.in);
    public static boolean jogando = false;
    public static String nomeP1, nomeP2, titulo = "|---------- Tit-Tak-Toe ----------|";
    public static int jogadas = 9;
    public static double quemComeca;
    
    public static void main(String[] args) {
        iniciaJogo();
    }
    
    public static void iniciaJogo() {
        quenheP1();
        quenheP2();
        System.out.println(nomeP1 + "\n" + nomeP2);
        
        quemComeca(nomeP1, nomeP2);
        
        String[] tabuleiro = tabuleiro();
    }
    
    public static String[] tabuleiro() {
        String[] tabuleiro = {"|_","|_","|_|",
                              "|_","|_","|_|",
                              "|_","|_","|_|"};
        for (int pos = 0; pos < 8) {
            if (pos == 3 || pos == 6 || pos == 9) {
               System.println(tabuleiro[pos] + "\n");   
            } else {
               System.println(tabuleiro[pos] + " ");
            }
        }
        
        return tabuleiro;
    }
    
    public static String quenheP1() {
        System.out.println("| P1 - Informe seu nome:");
        nomeP1 = ent.nextLine();
        return nomeP1;
    }
    
    public static String quenheP2() {
        System.out.println("| P2 - Informe seu nome:");
        nomeP2 = ent.nextLine();
        return nomeP2;
    }
    
    public static double quemComeca(String nomeP1, String nomeP2) {
        quemComeca = Math.round(Math.random());
        if (quemComeca == 0) {
            System.out.println("| Primeiro a jogar: " + nomeP1);
        } else {
            System.out.println("| Primeiro a jogar: " + nomeP2);
        }
        return quemComeca;
    }
}
