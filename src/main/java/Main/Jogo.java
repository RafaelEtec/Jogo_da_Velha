package Main;
import java.util.Random;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Jogo {
    
    public static Scanner ent = new Scanner(System.in);
    public static boolean jogando = false;
    public static String nomeP1,
                         nomeP2,
                         strTitulo = "|---------- Tit-Tak-Toe ----------|",
                         strEntPosP1 = "| P1 - Escolha uma posição: ", 
                         strEntPosP2 = "| P2 - Escolha uma posição: ";
    public static int jogadas = 9;
    public static double quemJoga;
    
    public static void main(String[] args) {
        iniciaJogo();
    }
    
    public static void iniciaJogo() {
        double quemComeca;
        int posJogada;
        
        System.out.println(strTitulo);
        quenheP1();
        quenheP2();
        System.out.println(nomeP1 + "\n" + nomeP2);
        
        quemComeca = quemComeca(nomeP1, nomeP2);
        quemJoga = quemComeca;
        
        String[] tabuleiro = criaTabuleiro();
        
        while (jogadas > 0) { 
            mostraTabuleiro(tabuleiro);
            System.out.println();
            
            posJogada = joga(quemJoga);
            
            mandaJogada(tabuleiro, posJogada);
            
            verificaVencedor(tabuleiro, quemJoga);
            
            quemJoga = proxJoga(quemJoga);
            jogadas--;
        }
    }
    
    public static String[] criaTabuleiro() {
        String[] tabuleiro = {"|1","|2","|3|",
                              "|4","|5","|6|",
                              "|7","|8","|9|"};
        return tabuleiro;
    }
    
    public static void mostraTabuleiro(String[] tabuleiro) {
        for (int pos = 0; pos < 9; pos++) {
            if (pos == 2 || pos == 5) {
               System.out.print(tabuleiro[pos] + "\n");   
            } else {
               System.out.print(tabuleiro[pos]);
            }
        }
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
        double quemComeca = Math.round(Math.random());
        if (quemComeca == 0) {
            System.out.println("| Primeiro a jogar: " + nomeP1);
        } else {
            System.out.println("| Primeiro a jogar: " + nomeP2);
        }
        return quemComeca;
    }
    
    public static int joga(double quemJoga) {
        int posJogada;
        if (quemJoga == 0) {
            System.out.println(strEntPosP1);
            posJogada = ent.nextInt();
        } else {
            System.out.println(strEntPosP2);
            posJogada = ent.nextInt();
        }
        return posJogada;
    }
    
    public static void verificaVencedor(String[] tabuleiro, double quemJoga) {
        
    }
    
    public static void mandaJogada(String[] tabuleiro, int posJogada) {
        
    }
    
    public static double proxJoga(double quemJoga) {
        if (quemJoga == 0) {
            quemJoga = 1;
        } else {
            quemJoga = 0;
        }
        return quemJoga;
    }
}