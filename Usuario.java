public class Usuario{

    private String nome,login,email,senha;

    public Usuario(String nome, String login, String email, String senha) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }
    
    

    public void requisitosCadastro(){

        if(nome.length()<2 || nome.length()>30){

            System.out.println("Numero de caracteres invalido");

        }
        if(login.length()<2 || login.length()>20){

            System.out.println("Numero de caracteres invalido");

        }
        if(email.length()<6 || email.length()>30){

            System.out.println("Numero de caracteres invalido");

        }
        if(senha.length()<6 || senha.length()>15){

            System.out.println("Numero de caracteres invalido");

        }

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    


}