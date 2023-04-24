import java.util.Scanner;

import java.util.Iterator;

import java.util.ArrayList;

public class Twitter {

    static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<String[]> feed = new ArrayList<String[]>();
    public static int id = 0;

    static void limparBuffer(Scanner limparBuffer) {
        if (limparBuffer.hasNextLine()) {// verifica se já existe algo alocado no buffer
            limparBuffer.nextLine(); // Limpa o buffer
        }
    }

    public static void main(String[] args) {

        int opcao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("-- BEM VINDO AO TWITTER JAVA !!! ---");

        do {

            System.out.println("\n- Digite a opcao desejada :");

            System.out.println("\n1- cadastrar usuário");
            System.out.println("\n2- listar usuários");
            System.out.println("\n3- logar usuário");
            System.out.println("\n4- deslogar usuário");
            System.out.println("\n5- tweetar");
            System.out.println("\n6- mostrar últimos  tweets do feed");
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

                case 1: // CADASTRAR USUARIO

                    System.out.println("---------------------------");
                    System.out.println("\nCADASTRO DE USUARIO\n");

                    do {

                        System.out.println("Digite o nome :");
                        nome = leitor.next();
                        limparBuffer(leitor);

                    } while (nome.length() < 2 || nome.length() > 30);

                    do {

                        System.out.println("Digite o login :");
                        login = leitor.next();
                        limparBuffer(leitor);

                    } while (login.length() < 2 || login.length() > 20);

                    do {

                        System.out.println("Digite o email :");
                        email = leitor.next();
                        limparBuffer(leitor);

                    } while (email.length() < 6 || email.length() > 30);

                    do {

                        System.out.println("Digite o senha :");
                        senha = leitor.next();
                        limparBuffer(leitor);

                    } while (senha.length() < 6 || senha.length() > 15);

                    Usuario u = new Usuario(nome, login, email, senha, false);

                    usuarios.add(u);
                    System.out.println("Usuario cadastrado!!");
                    System.out.println("---------------------------");
                    break;

                case 2: // LISTAR USUARIOS

                    System.out.println("---------------------------");
                    System.out.println("\nLISTA DE USUARIOS CADASTRADOS\n");

                    for (int i = 0; i < usuarios.size(); i++) {

                        System.out.println(usuarios.get(i));

                    }

                    System.out.println("---------------------------");
                    break;

                case 3: // LOGAR USUARIO

                    System.out.println("---------------------------");

                    System.out.println("\nLOGIN\n");

                    System.out.print("Digite o login:");
                    String loginDig = leitor.next();
                    limparBuffer(leitor);

                    System.out.print("Digite a senha:");
                    String senhaDig = leitor.next();
                    limparBuffer(leitor);

                    for (int i = 0; i < usuarios.size(); i++) {

                        if (loginDig.equals(usuarios.get(i).getLogin()))
                            ;

                        if (senhaDig.equals(usuarios.get(i).getSenha())) {
                            System.out.println("\nUsuário logado com sucesso\n");

                            usuarios.get(i).setLogado(true);
                            limparBuffer(leitor);
                            break;

                        } else {
                            System.out.println("Senha incorreta, tente novamente.");
                            limparBuffer(leitor);
                        }
                    }

                    System.out.println("---------------------------");
                    break;

                case 4: // DESLOGAR USUARIO

                    System.out.println("---------------------------");

                    System.out.println("USUARIOS LOGADOS :");

                    for (int i = 0; i < usuarios.size(); i++) {

                        if (usuarios.get(i).logado == true) {
                            System.out.println(usuarios.get(i));
                            limparBuffer(leitor);
                        }
                    }

                    System.out.println("---------------------------");

                    System.out.println("\nDESLOGAR\n");

                    System.out.println("Digite o login do usuario a ser deslogado:");
                    loginDig = leitor.next();
                    limparBuffer(leitor);

                    for (int i = 0; i < usuarios.size(); i++) {

                        if (loginDig.equals(usuarios.get(i).getLogin())) {
                            System.out.println("\nLogout realizado com sucesso !!!\n");

                            usuarios.get(i).setLogado(false);
                        } else {

                            System.out.println("usuario nao encontrado/nao logado");// NAO ESTA FUNCIONANDO
                        }
                    }
                    break;

                case 5: // TWITTAR

                    System.out.println();
                    System.out.println("Qual usuario deseja usar: ");
                    String loginUser = leitor.next();
                    Integer valido = null;
                    limparBuffer(leitor);

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (loginUser.equals(usuarios.get(i).getLogin())) {
                            valido = i;
                        }
                    }

                    if (valido != null) {
                        if (usuarios.get(valido).getLogado() == true) {

                            int tamanho;
                            String tweet;

                            do {
                                System.out.print("O qual seu tweet: ");
                                tweet = leitor.nextLine();
                                tamanho = tweet.length();
                                System.out.println();
                            } while (tamanho <= 0 || tamanho > 140);

                            String[] stringArray = { loginUser, tweet, String.valueOf(id) };

                            id = id + 1;
                            feed.add(stringArray);
                        
                        } else {
                        System.out.println("Não foi possivel twittar");
                        } 
                    }

                    break;

                case 6: // Mostrar tweets
                int Tweets = feed.size();

                    System.out.println("Informe o numero de tweets");
                    int numeroTwe = leitor.nextInt();
                    limparBuffer(leitor);

                    if (numeroTwe > Tweets) { 
                        System.out.println("Não há tweets suficientes!");
                    } else {
                        System.out.println("numero de tweets" + numeroTwe + " tweets: ");
                        for (int i = Tweets - numeroTwe; i < Tweets; i++) { 
                            System.out.printf("%s Tweet: %s \n", feed.get(i)[0], feed.get(i)[1]);
                        }
                    }

                    break;

                case 7:

                    System.out.println();
                    System.out.println("De qual usuario você deseja remover o tweet");
                    loginUser = leitor.next();
                    valido = null;

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (loginUser.equals(usuarios.get(i).getLogin())) {
                            valido = i;
                        }
                    }

                    if (valido != null) {
                        if (usuarios.get(valido).getLogado() == true) {

                            for (int i = 0; i < feed.size(); i++) {
                                if (loginUser.equals(feed.get(i)[0])) {
                                    System.out.printf("ID: %s, usuario: %s, Tweet: %s \n", feed.get(i)[2],
                                    feed.get(i)[0], feed.get(i)[1]); // posição 0 = nome, posição 1 = tweet, posiçao  2 id.
                                }
                            }

                            System.out.print("Qual ID você deseja remover:  ");
                            int idRemove = leitor.nextInt();

                            limparBuffer(leitor);

                            Iterator<String[]> iter = feed.iterator();
                            while (iter.hasNext()) {
                                String[] item = iter.next();
                                if (item[0].equals(loginUser) && idRemove == Integer.parseInt(item[2])) {
                                    iter.remove();
                                    System.out.println("Tweet removido com sucesso!");
                                }
                            }

                        }
                    } else {
                        System.out.println("usuario não encontrado");
                    }

                    System.out.println();
                    limparBuffer(leitor);

                    break;

                case 8: // Trocar senha
                    System.out.println("---------------------------");

                    System.out.print("Digite o login:");
                    String login1 = leitor.next();
                    limparBuffer(leitor);

                    System.out.print("Digite a senha:");
                    String senhaAtual = leitor.next();
                    limparBuffer(leitor);

                    // bloco de comandos que faz a validação da senha atual e executa a troca caso
                    // esteja tudo correto
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (login1.equals(usuarios.get(i).getLogin())) {
                            
                            if (senhaAtual.equals(usuarios.get(i).getSenha()))
                                System.out.print("digite a nova senha: ");
                            String senhalt = leitor.next();

                            usuarios.get(i).setSenha(senhalt);
                            System.out.println("Senha Alterada com sucesso");

                            break;

                        } else {
                            System.out.println("Senha incorreta, tente novamente.");
                        }
                    }

                    System.out.println("---------------------------");
                    break;

                case 9: // remover usuario
                    System.out.println("---------------------------");

                    System.out.print("Digite o login:");
                    String login2 = leitor.next();
                    limparBuffer(leitor);

                    System.out.print("Digite a senha:");
                    String senha2 = leitor.next();
                    limparBuffer(leitor);

                    // bloco de comandos que faz a validação da senha e login, após a validação o
                    // usuario é removido
                    boolean usuarioValido = false;

                    Iterator<Usuario> iter = usuarios.iterator();
                    while (iter.hasNext()) {
                        Usuario usuarios = iter.next();
                        if (login2.equals(usuarios.getLogin()) && senha2.equals(usuarios.getSenha())) {
                            iter.remove();
                            usuarioValido = true;
                            System.out.println("Usuario removido");
                        }
                    }

                    if (!usuarioValido) {
                        System.out.println("Usuario não encontrado ou senha invalida");
                    }
                    break;

                case 10: // imprimir infos
                int userLogin = 0;
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i).getLogado() == true) {
                        userLogin += 1;
        
                    }
                }
                System.out.println("Usuarios totais  " + usuarios.size());
                System.out.println("Usuarios logados " + userLogin);
                System.out.println("tweets realizados: " + feed.size());
                    
                    break;

                case 0:

                    break;

                default:

                    System.out.println("\nOpcao invalida");
            }

        } while (opcao != 0);

    }

}
