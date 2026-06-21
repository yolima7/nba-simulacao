package mynba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogador jogador =null;
        Scanner sc = new Scanner(System.in);
        System.out.println("----BEM VINDO AO MyNBA----");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("Digite [1] para criar um novo Jogador!");
        System.out.println("Digite [2] para mostrar as informações do seu Jogador!");
        System.out.println("Digite [3] para treinar seu Jogador e aumentar o seu nivel de habilidade!");
        System.out.println("Digite [4] para finalizar o programa!");
        int opcao;
        opcao = sc.nextInt();
        sc.nextLine();
        while(opcao!=4){
            switch(opcao){
                case 1:
                        System.out.println("Criando um novo Jogador, aguarde...");
                        System.out.print("Digite o nome do seu Jogador: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite a idade do seu Jogador: ");
                        int idade = sc.nextInt();
                        System.out.print("Digite a altura do seu Jogador: ");
                        float altura = sc.nextFloat();
                        sc.nextLine();
                        System.out.print("Digite a posição do seu Jogador: ");
                        String posicao = sc.nextLine();
                        System.out.print("Em qual College o seu Jogador atuava?: ");
                        String college = sc.nextLine();
                        jogador = new Jogador(nome, idade, altura, posicao, college);
                        System.out.println("Jogador criado com sucesso!");
                        System.out.println("Bem vindo ao MyNBA "+nome);
                        break;
                case 2:
                    if(jogador == null) {
                        System.out.println("Erro: Você precisa criar um Jogador!");
                    }else{
                        System.out.println("Carregando informações do seu jogador...");
                        jogador.mostrarDados();
                    }


                    break;

                case 3:
                    if(jogador == null) {
                        System.out.println("Erro: Não é possivel treinar sem ter um Jogador!");
                    }else{
                        jogador.treinar();
                    }


                    break;
            }
            System.out.println("======================================");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("Digite [1] para criar um novo Jogador!");
            System.out.println("Digite [2] para mostrar seu Jogador!");
            System.out.println("Digite [3] para treinar seu Jogador!");
            System.out.println("Digite [4] para sair!");
            opcao = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Saindo do programa...");
    }
}




