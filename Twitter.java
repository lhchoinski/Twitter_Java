import java.util.Scanner;
import java.util.ArrayList;

public class Twitter {
    
    public static void main(String[] args) {
        
        int opcao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("-- BEM VINDO AO TWITTER JAVA !!! ---");
        
        do{

            System.out.println("\n- Digite a opcao desejada :");

           System.out.println("\n1- cadastrar usuário");
           System.out.println("\n2- listar usuários");
           System.out.println("\n3- logar usuário");
           System.out.println("\n4- deslogar usuário");
           System.out.println("\n5- tweetar");
           System.out.println("\n6- mostrar últimos N tweets do feed");
           System.out.println("\n7- remover tweet de um usuário");
           System.out.println("\n8- alterar senha de um usuário");
           System.out.println("\n9- remover um usuário");
           System.out.println("\n10- imprimir estatísticas");
           System.out.println("\n0- finalizar programa");

            opcao = leitor.nextInt();

           switch (opcao) {
            case 1:

            System.out.println("Digite o nome :");
            String nome = leitor.nextLine();

            System.out.println("Digite o login :");
            String login = leitor.next();
            
            System.out.println("Digite o email :");
            String email = leitor.nextLine();

            System.out.println("Digite o senha :");
            String senha = leitor.nextLine();

            ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
            
            



                break;
    
            case 2:
                
                break;
    
            case 3:
                
                break;
    
    
            case 4:
                 
                break;

            case 5:
                 
                break;

            case 6:
                 
                break;

            case 7:
                 
                break;

            case 8:
                 
                break;

            case 9:
                 
                break;

            case 10:
                 
                break;

            case 0:
                 
                break;
            }

               
           

        }while(opcao != 0);


    }

    
    
}
