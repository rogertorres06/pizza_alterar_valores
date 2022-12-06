package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Pizza;

public class Menu {
    private int opcao;
    private Scanner scan = new Scanner(System.in);
    private List<Pizza> cardapio = new ArrayList<>();

    //Função principal onde navego por todas as funções que criei correspondente ao menu
    public void gerenciarTelas(){
        do {
            telaPrincipal();

            switch (opcao) {
                case 1:
                    cadastrarPizza();
                    break;
                case 2:
                    mostrarSabores();
                    break;
                case 3:
                    buscarSabor();
                    break;
                case 4:
                    alterarValor();
                    break;
                case 0:  
                    break;

                default:
                System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao!=0);
    }
    
    //Função onde mostro a tela principal e pergunto para qual tela o usuário deseja ir
    private void telaPrincipal(){
        limpa();
        System.out.println("**** Pizzaria tech4me ****");
        System.out.println("1- Cadastrar pizza");
        System.out.println("2- Mostrar sabores");
        System.out.println("3- Buscar sabor");
        System.out.println("4- Alterar valor");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
        opcao = lerNumero();
    }

    //Função onde cadastro pizzas e armazeno dentro da lista
    private void cadastrarPizza() {
        limpa();
        System.out.println("**** Cadastro de pizzas ****");
        System.out.print("Digite o sabor: ");
        String sabor = scan.nextLine();
        System.out.print("Digite o tamanho [p, m ou g]: ");
        char tamanho = scan.nextLine().charAt(0);

        Pizza pizza = new Pizza(sabor, tamanho);
        cardapio.add(pizza);
        System.out.println("Pizza cadastrada com sucesso.");
        voltarMenu();
    }

    //Função onde mostro todos os sabores que estão cadastrados dentro da lista
    private void mostrarSabores() {
        limpa();
        if (cardapio.size() == 0) {
            System.out.println("Não há nenhuma pizza no cardápio");
        }else{
            System.out.println("**** Cardapio ****");
            for (Pizza pizza : cardapio) {
            System.out.println(pizza);
        }
        }

        voltarMenu();
    }

    /*Função onde busco por um sabor específico e mostro caso encontrado, 
    se não encontrar mostro uma mensagem que não encontrei*/
    private void buscarSabor(){
        limpa();
        System.out.println("**** Buscar por sabores ****");
        //Criar aqui embaixo o código para buscar um sabor dentro da lista

        voltarMenu();
    }

    //Função onde busco por um sabor específico e pergunto para qual valor o usuário deseja alterar
    private void alterarValor(){
        limpa();
        System.out.println("**** Alterar valor ****");
        //Criar aqui embaixo o código para alterar o valor de alguma pizza dentro da lista

        voltarMenu();
    }


    //Função onde leio um número digitado pelo usuário e retorno esse valor
    public int lerNumero(){
        int numero = scan.nextInt(); scan.nextLine();
        return numero;
    }

    //Função para voltar ao menu principal
    public void voltarMenu(){
        System.out.println("Digite [ENTER] para voltar ao Menu.");
        scan.nextLine();
    }

    //Função onde limpa o terminal
    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}