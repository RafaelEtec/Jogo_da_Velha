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
    
    public static int[] converteJogada(int posJogada) {
        int[] jogadaConvertida = new int[2];
        switch (posJogada) {
            case 0:
                jogadaConvertida[0] = 0;
                jogadaConvertida[1] = 0;
                break;
            case 1:
                jogadaConvertida[0] = 0;
                jogadaConvertida[1] = 1;
                break;
            case 2:
                jogadaConvertida[0] = 0;
                jogadaConvertida[1] = 2;
                break;
            case 3:
                jogadaConvertida[0] = 1;
                jogadaConvertida[1] = 0;
                break;
            case 4:
                jogadaConvertida[0] = 1;
                jogadaConvertida[1] = 1;
                break;
            case 5:
                jogadaConvertida[0] = 1;
                jogadaConvertida[1] = 2;
                break;
            case 6:
                jogadaConvertida[0] = 2;
                jogadaConvertida[1] = 0;
                break;
            case 7:
                jogadaConvertida[0] = 2;
                jogadaConvertida[1] = 1;
                break;
            case 8:
                jogadaConvertida[0] = 2;
                jogadaConvertida[1] = 2;
                break;
        }
        return jogadaConvertida;
    }
    
    public static String[][] mandaJogada(String[][] tabuleiro, int posJogada, int jogadas) {
        int[] jogadaConvertida = converteJogada(posJogada);
        int li = jogadaConvertida[0];
        int co = jogadaConvertida[1];
        if (jogadas%2 == 1) {
            if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
                tabuleiro[li][co] = "|X|";
            } else {
                tabuleiro[li][co] = "|X";
            }
        } else {
            if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
                tabuleiro[li][co] = "|O|";
            } else {
                tabuleiro[li][co] = "|O";
            }
        }
        return tabuleiro;
    }
    
    public static int[][] tabuleiroAux(int[][] tab, int posJogada, int jogadas) {
        int[] jogadaConvertida = converteJogada(posJogada);
        int li = jogadaConvertida[0];
        int co = jogadaConvertida[1];
        if (jogadas%2 == 1) {
            tab[li][co] = 0;
        } else {
            tab[li][co] = 1;
        }
        return tab;
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
    
    //    |1|2|3|
    //    |4|5|6|
    //    |7|8|9|
    // ----0-1-2---------------------------------------------------------------
    //  0 |0|1|2| /
    //  1 |3|4|5| /
    //  2 |6|7|8| /
    
    public static boolean verificaVencedor(int[][] tab, double quemJoga, int jogadas) {
        boolean ganhou = false;
        String ganhador;
        if (quemJoga == 0) {
            ganhador = nomeP1;
        } else {
            ganhador = nomeP2;
        }
        
        if (jogadas <= 5) {
            // Horizontal
            if        (tab[0][0] == 0 && tab[0][1] == 0 && tab[0][2] == 0 || tab[0][0] == 1 && tab[0][1] == 1 && tab[0][2] == 1) {
                ganhou = true;
            } else if (tab[1][0] == 0 && tab[1][1] == 0 && tab[1][2] == 0 || tab[1][0] == 1 && tab[1][1] == 1 && tab[1][2] == 1) {
                ganhou = true;
            } else if (tab[2][0] == 0 && tab[2][1] == 0 && tab[2][2] == 0 || tab[2][0] == 1 && tab[2][1] == 1 && tab[2][2] == 1) {
                ganhou = true;
            }
            //Vertical
            if        (tab[0][0] == 0 && tab[1][0] == 0 && tab[2][0] == 0 || tab[0][0] == 1 && tab[1][0] == 1 && tab[2][0] == 1) {
                ganhou = true;
            } else if (tab[0][1] == 0 && tab[1][1] == 0 && tab[2][1] == 0 || tab[0][1] == 1 && tab[1][1] == 1 && tab[2][1] == 1) {
                ganhou = true;
            } else if (tab[0][2] == 0 && tab[1][2] == 0 && tab[2][2] == 0 || tab[0][2] == 1 && tab[1][2] == 1 && tab[2][2] == 1) {
                ganhou = true;
            }
            // Diagonal
            if        (tab[0][0] == 0 && tab[1][1] == 0 && tab[2][2] == 0 || tab[0][0] == 1 && tab[1][1] == 1 && tab[2][2] == 1) {
                ganhou = true;
            } else if (tab[0][2] == 0 && tab[1][1] == 0 && tab[2][0] == 0 || tab[0][2] == 1 && tab[1][1] == 1 && tab[2][0] == 1) {
                ganhou = true;
            }
        }
        if (ganhou) {
            System.out.println("| "+ ganhador + " Venceu!");
        }
        return ganhou;
    }
    
    public static boolean confereJogada(int posJogada, String[][] tabuleiro) {
        String strPosInvalida =    "| Posição Inválida! Deve ser entre 1 e 9    |";
        String strJaFoiEscolhida = "| Posição já foi escolhida antes!           |";
        String strInsNovamente =   "| Insira novamente:                         |";
        boolean podePassar;
        if (posJogada < 0 || posJogada > 8) {
            System.out.println(strPosInvalida + "\n" + strInsNovamente);
            podePassar = false;
        } else {
            if (jaFoiEscolhida(posJogada, tabuleiro)) {
                System.out.println(strJaFoiEscolhida + "\n" + strInsNovamente);
                podePassar = false;
            } else {
                podePassar = true;
            }
        }
        return podePassar;
    }
    
    public static boolean jaFoiEscolhida(int posJogada, String[][] tabuleiro) {
        int[] jogadaConvertida = converteJogada(posJogada);
        int li = jogadaConvertida[0];
        int co = jogadaConvertida[1];
        boolean jaFoiEscolhida = false;
        if (posJogada == 2 || posJogada == 5 || posJogada == 8) {
            if (!tabuleiro[li][co].equals("|_|")) {
                jaFoiEscolhida = true;
            }
        } else {
            if (!tabuleiro[li][co].equals("|_")) {
                jaFoiEscolhida = true;
            }
        }
        return jaFoiEscolhida;
    }
    
    public static String[][] atualizaTabuleiro(String[][] tabuleiro) {
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2 || col == 5 || col == 8) {
                    tabuleiro[lin][col] = "|_|";
                } else {
                    tabuleiro[lin][col] = "|_";
                }
            }
        }
        return tabuleiro;
    }
    
    public static void mostraTabuleiro(String[][] tabuleiro, int[][] tab) {
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                if (col == 2 || col == 5) {
                    System.out.print(tabuleiro[lin][col] + "\n");
                } else {
                    System.out.print(tabuleiro[lin][col]);
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
    
    public static double proxJoga(double quemJoga) {
        if (quemJoga == 0) {
            quemJoga = 1;
        } else {
            quemJoga = 0;
        }
        return quemJoga;
    }
}