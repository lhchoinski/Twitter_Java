public class Usuario{

    private String nome,login,email,senha;

    public Usuario(String nome, String login, String email, String senha) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
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


 //lista os usuarios cadastrados
 
    @Override
    public String toString() {
        return   "\n LISTA DE USUARIOS\n\n"
        +login ;
    }

    


}