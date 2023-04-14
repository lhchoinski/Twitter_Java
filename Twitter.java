import java.util.Scanner;
import java.util.ArrayList;

public class Twitter {

    static ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
    
    
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

            //CADASTRAR USUARIO

            case 1:
            
            String nome;
            String email;
            String login;
            String senha;
            
            
            do{

                System.out.println("Digite o nome :");
                nome = leitor.nextLine();
                
                
            }while(nome.length()<2 || nome.length()>30);

            do{

                System.out.println("Digite o login :");
                login = leitor.nextLine();

            }while(nome.length()<2 || nome.length()>20);

            do{

                System.out.println("Digite o email :");
                email = leitor.nextLine();

            }while(email.length()<6 || email.length()>30);

            do{

                System.out.println("Digite o senha :");
                senha = leitor.nextLine();
                
            }while(senha.length()<6 || senha.length()>15);
            
            Usuario u = new Usuario(nome, login, email, senha);

            usuarios.add(u);


                break;

            //LISTAR USUARIOS  
    
            case 2:

            for(int i=0; i<usuarios.size(); i++){
 
            System.out.println(usuarios.get(i));

            }

                break;

            //LOGAR USUARIO    
    
            case 3:

            String login_dig;
            String senha_dig;

            System.out.println("Login:");
            login_dig = leitor.nextLine();

            System.out.println("Senha:");
            senha_dig = leitor.nextLine();

            do{

                System.out.println("Senha/Login incorretos!");

            }while(senha_dig.equals(senha) || login_dig.equals(login));
                
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

            default:

                System.out.println("\nOpcao invalida");
            }

               
           

        }while(opcao != 0);


    }

    
    
}
