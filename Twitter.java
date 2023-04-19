import java.util.Scanner;
import java.util.ArrayList;

public class Twitter {

    static ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
    static ArrayList<Usuario> feedTwitter = new ArrayList<Usuario>();

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
            
            String nome;
            String email;
            String login;
            String senha;

           switch (opcao) {

            //CADASTRAR USUARIO

            case 1:

            System.out.println("---------------------------");
            System.out.println("\nCADASTRO DE USUARIO\n");
            
            do{

                System.out.println("Digite o nome :");
                nome = leitor.next();
                
            }while(nome.length()<2 || nome.length()>30);

            do{

                System.out.println("Digite o login :");
                login = leitor.next();

            }while(login.length()<2 || login.length()>20);

            do{

                System.out.println("Digite o email :");
                email = leitor.next();

            }while(email.length()<6 || email.length()>30);

            do{

                System.out.println("Digite o senha :");
                senha = leitor.next();
                
            }while(senha.length()<6 || senha.length()>15);
            
            Usuario u = new Usuario(nome, login, email, senha, false);

            usuarios.add(u);

            System.out.println("---------------------------");
                break;

            //LISTAR USUARIOS  
    
            case 2:

            System.out.println("---------------------------");
            System.out.println("\nLISTA DE USUARIOS CADASTRADOS\n");
            
            for(int i=0; i<usuarios.size(); i++){

            System.out.println(usuarios.get(i));

            }

            System.out.println("---------------------------");
                break;

            //LOGAR USUARIO    
    
            case 3:

            System.out.println("---------------------------");

            System.out.println("\nLOGIN\n");

            System.out.print("Digite o login:");
            String loginDig = leitor.next();

            System.out.print("Digite a senha:");
            String senhaDig = leitor.next();


            for (int i = 0; i < usuarios.size(); i++) {


                if (loginDig.equals(usuarios.get(i).getLogin()));

                if (senhaDig.equals(usuarios.get(i).getSenha())) {
                    System.out.println("\nUsuário logado com sucesso !!!\n");

                    usuarios.get(i).setLogado(true);

                    break;

                } else {
                    System.out.println("Senha incorreta, tente novamente.");
                }
            }

            System.out.println("---------------------------");
                break;
    
                //DESLOGAR USUARIO

            case 4:

            System.out.println("---------------------------");
            
            System.out.println("USUARIOS LOGADOS :");

            for(int i=0; i<usuarios.size(); i++){
                
                if(usuarios.get(i).logado == true){   
                System.out.println(usuarios.get(i));
                }
            }

            System.out.println("---------------------------");

            System.out.println("\nDESLOGAR\n");

            System.out.println("Digite o login do usuario a ser deslogado:");
            loginDig = leitor.next();

            for(int i=0; i<usuarios.size(); i++){
                
                if (loginDig.equals(usuarios.get(i).getLogin())) {
                    System.out.println("\nLogout realizado com sucesso !!!\n");

                    usuarios.get(i).setLogado(false);
                } else{

                    System.out.println("usuario nao encontrado/nao logado");//NAO ESTA FUNCIONANDO
                }
            }
                break;

                //TWITTAR

            case 5:

                System.out.println("---------------------------");
            
                System.out.println("USUARIOS LOGADOS :");

                for(int i=0; i<usuarios.size(); i++){
                
                if(usuarios.get(i).logado == true){   
                System.out.println(usuarios.get(i));
                }
            }
                System.out.print("Digite o usuario que vai realizar o tweet: ");
                loginDig = leitor.nextLine();
                
                for (int i = 0; i < usuarios.size(); i++) {

                if(usuarios.get(i).logado == true){   
                
                int tamanho;
                String tweet;
                

                do {
                    System.out.print("O que você deseja tweetar: ");
                    tweet = leitor.nextLine();
                    tamanho = tweet.length();
                } while (tamanho <= 0 || tamanho > 280);

                //FALTA CRIAR ARRAY

                    }else {
                        System.out.println("Verifique o login");
                        
                    }
                }
                 
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
