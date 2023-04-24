public class Usuario{

    public static int length;
    private String nome,login,email,senha;
    boolean logado;

    public Usuario(String nome, String login, String email, String senha,boolean logado) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
        this.logado = logado;
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

    public boolean getLogado() {
        return logado;
    }


    public void setLogado(boolean logado) {
        this.logado = logado;
    }
    


 //lista os usuarios cadastrados
 
    @Override
    public String toString() {
        return   "\n"+
        "->"+login ;
    }


    public static int size() {
        return 0;
    }


    

    


}