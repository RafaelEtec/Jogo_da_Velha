package Main;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class JogoBiDi {
    public static Scanner ent = new Scanner(System.in);
    public static boolean jogando = false;
    public static String nomeP1,
                         nomeP2,
                         strTitulo =   "|--------------- Tit-Tak-Toe ---------------|",
                         strEntPosP1 = "| P1 - Escolha uma posição:                 | ", 
                         strEntPosP2 = "| P2 - Escolha uma posição:                 | ";
    public static int jogadas = 9;
    public static double quemJoga;
    
    public static void main(String[] args) {
        iniciaJogo();
    }
    
    public static void iniciaJogo() {
        double quemComeca;
        int posJogada;
        boolean ganhou = false;
        
        System.out.println(strTitulo);
        quenheP1();
        quenheP2();
        System.out.println(nomeP1 + "\n" + nomeP2);
        
        quemComeca = quemComeca(nomeP1, nomeP2);
        quemJoga = quemComeca;
        
        String[][] tabuleiro = criaTabuleiro();
        int[][] tab = criaTabuleiroAux();
        
        while (jogadas > 0) { 
            mostraTabuleiro(tabuleiro, tab);
            System.out.println();
            if (jogadas == 9) {
                tabuleiro = atualizaTabuleiro(tabuleiro);
            }
            
            posJogada = joga(quemJoga, tabuleiro);
            
            tabuleiro = mandaJogada(tabuleiro, posJogada, jogadas);
            tab = tabuleiroAux(tab, posJogada, jogadas);
            
            ganhou = verificaVencedor(tab, quemJoga, jogadas);
            
            if (ganhou == true) {
                jogadas = -1;
            } else {
                quemJoga = proxJoga(quemJoga);
                jogadas--;
            }
        }
        if (jogadas == 0) {
            System.out.println(strTitulo + "\n| Empate! Ninguém venceu.                   |");
        }
        mostraTabuleiro(tabuleiro, tab);
    }
    
    public static int joga(double quemJoga, String[][] tabuleiro) {
        int posJogada;
        boolean podePassar;
        
        if (quemJoga == 0) {
            System.out.println(strEntPosP1);
        } else {
            System.out.println(strEntPosP2);
        }
        do {
            posJogada = ent.nextInt();
            posJogada = (posJogada - 1);
            podePassar = confereJogada(posJogada, tabuleiro);
        } while (!podePassar);
        return posJogada;
    }
    
    public static String[][] atualizaTabuleiro(String[][] tabuleiro) {
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2 || col == 5 || col == 8) {
                    tabuleiro[lin][col] = "| |";
                } else {
                    tabuleiro[lin][col] = "| ";
                }
            }
        }
        return tabuleiro;
    }
    
    public static void mostraTabuleiro(String[][] tabuleiro, int[][] tab) {
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2 || col == 5) {
                    System.out.println(tabuleiro[lin][col] + "\n");
                } else {
                    System.out.println(tabuleiro[lin][col]);
                }
            }
        }
    }
    
    public static String[][] criaTabuleiro() {
        String[][] tabuleiro = new String[3][3];
        int pos = 1;
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2 || col == 5 || col == 8) {
                    tabuleiro[lin][col] = "|"+pos+"|";
                    pos++;
                } else {
                    tabuleiro[lin][col] = "|"+pos;
                    pos++;
                }
            }
        }
        return tabuleiro;
    }
    
    public static int[][] criaTabuleiroAux() {
        int[][] tab = new int[3][3];
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                tab[lin][col] = -1;
            }
        }
        return tab;
    }
    
    public static String quenheP1() {
        System.out.println("| P1 - Informe seu nome:                    |");
        nomeP1 = ent.nextLine();
        return nomeP1;
    }
    
    public static String quenheP2() {
        System.out.println("| P2 - Informe seu nome:                    |");
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
        System.out.println("| Você é \"X\"                                |");
        return quemComeca;
    }
}
