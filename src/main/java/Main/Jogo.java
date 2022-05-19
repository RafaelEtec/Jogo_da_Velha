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
            if (jogadas == 9) {
                tabuleiro = atualizaTabuleiro(tabuleiro);
            }
            
            posJogada = joga(quemJoga, tabuleiro);
            
            tabuleiro = mandaJogada(tabuleiro, posJogada, jogadas);
            
            verificaVencedor(tabuleiro, quemJoga);
            
            quemJoga = proxJoga(quemJoga);
            jogadas--;
        }
        mostraTabuleiro(tabuleiro);
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
    
    public static String[] atualizaTabuleiro(String[] tabuleiro) {
        for (int pos = 0; pos < 9; pos++) {
            if (pos == 2 || pos == 5 || pos == 8) {
                tabuleiro[pos] = "|_|";
            } else {
                tabuleiro[pos] = "|_";
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
        double quemComeca = Math.round(Math.random());
        if (quemComeca == 0) {
            System.out.println("| Primeiro a jogar: " + nomeP1);
        } else {
            System.out.println("| Primeiro a jogar: " + nomeP2);
        }
        System.out.println("Você é \"X\"");
        return quemComeca;
    }
    
    public static int joga(double quemJoga, String[] tabuleiro) {
        int posJogada;
        boolean jaFoiEscolhida;
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
    
    public static boolean confereJogada(int posJogada, String[] tabuleiro) {
        String strPosInvalida = "| Posição Inválida! Deve ser entre 1 e 9 ";
        String strJaFoiEscolhida = "| Posição já foi escolhida antes! ";
        String strInsNovamente = "| Insira novamente: ";
        boolean podePassar;
        if (posJogada < 0 || posJogada > 8) {
            System.out.println(strPosInvalida + "\n" + strInsNovamente);
            podePassar = false;
        } else {
            podePassar = true;
        }
        if (jaFoiEscolhida(posJogada, tabuleiro)) {
            System.out.println(strJaFoiEscolhida + "\n" + strInsNovamente);
            podePassar = false;
        } else {
            podePassar = true;
        }
        return podePassar;
    }
    
    public static boolean jaFoiEscolhida(int posJogada, String[] tabuleiro) {
        boolean jaFoiEscolhida = false;
        if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
            if (!tabuleiro[posJogada].equals("|_|")) {
                jaFoiEscolhida = true;
            }
        } else {
            if (!tabuleiro[posJogada].equals("|_")) {
                jaFoiEscolhida = true;
            }
        }
        return jaFoiEscolhida;
    }
    
    public static void verificaVencedor(String[] tabuleiro, double quemJoga) {
        
    }
    
    public static String[] mandaJogada(String[] tabuleiro, int posJogada, int jogadas) {
        if (jogadas%2 == 1) {
            if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
                tabuleiro[posJogada] = "|X|";
            } else {
                tabuleiro[posJogada] = "|X";
            }
        } else {
            if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
                tabuleiro[posJogada] = "|O|";
            } else {
                tabuleiro[posJogada] = "|O";
            }
        }
        return tabuleiro;
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