import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] filmes = { 
            {"John Wick (2014)", "Mad Max: Estrada da Fúria (2015)", "Velozes e Furiosos (2001)", "Matrix (1999)", "Duro de Matar (1988)"}, 
            {"Titanic(1997)", "Um Amor para Recordar (2002)", "Como Eu Era Antes de Você (2016)", "O Diário de uma Paixão (2004)", "Para Sempre (2012)"}, 
            {"O Exorcista (1973)", "O Iluminado (1980)", "Psicose (1960)", "O Chamado (2002)", "A Bruxa de Blair (1999)"}, 
            {"Guerra dos Mundos (2005", "Interestelar (2014)", "A Chegada (2016)", "Blade Runner 2049 (2017)", "Duna (2021)"}, 
            {"Se Beber, Não Case! (2009)", "Todo Mundo em Pânico (2000)", "Click (2006)", "As Branquelas (2004)", "Esqueceram de Mim(199"},
            {"Thomas o Profano", "Thomas e a Dedada Soberana", "Thomas e Leo procurando Rego", "Thomas e os 300 cacetes", "Thomas e a ascensão de um penis"},
        };

        System.out.print("\033[H\033[2J");
        System.out.println("|---------------------------------------------------------------|");
        System.out.println("|---------------- BEM VINDO A LOCADORA CINEFLIX ----------------|");
        System.out.println("|---------------------------------------------------------------|\n");
        
  
       


        // apresenta os gêneros disponíveis para escolha
        System.out.println("Aqui estão os gêneros disponíveis para você escolher meu querido(a)");
        System.out.println("-----------------------");
        System.out.println("|1. Ação              |");
        System.out.println("|2. Romance           |");
        System.out.println("|3. Terror            |");
        System.out.println("|4. Ficção Científica |");
        System.out.println("|5. Comédia           |");
        System.out.println("|6. +18           |");
        System.out.println();
        System.out.print("Escolha um gênero: ");



        int filmeEscolhido = sc.nextInt();
        sc.nextLine(); // limpa o buffer do teclado

        // apresenta as filmes do gênero escolhido
        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("A seguir estão os filmes em nossa locadora do gênero " + getNomeGenero(filmeEscolhido) + ": ");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < filmes[filmeEscolhido - 1].length; i++) {
            System.out.println((i + 1) + ". " + filmes[filmeEscolhido - 1][i]);
        }

        // pergunta ao usuário quais filmes ele deseja alugar
        System.out.println("-------------------------------------------------------------");
        System.out.print("Escolha os filmes que deseja alugar (separados por vírgula): ");
        String escolhas = sc.nextLine();
        String[] numeros = escolhas.split(",");
        System.out.print("\033[H\033[2J");

        // apresenta os filmes escolhidos pelo usuário
        System.out.println();
        System.out.println("Filmes escolhidos:");
        System.out.println("-----------------------------------------------------");
        for (String numero : numeros) {
            int index = Integer.parseInt(numero.trim()) - 1;
            System.out.println(filmes[filmeEscolhido - 1][index]);
            System.out.println();
            System.out.println("-----------------------------------------------------");
        }

        sc.close();
    }

    public static String getNomeGenero(int codigoGenero) {
        switch (codigoGenero) {
            case 1:
                return "Ação";
            case 2:
                return "Romance";
            case 3:
                return "Terror";
            case 4:
                return "Ficção Científica";
            case 5:
                return "Comédia";
            case 6:
                return "+18";
            default:
                return " ";
        }
    }
}