package JAVA_TP3_5;

public abstract class CartaoWeb {
    private String email;
    private String nome;

    public CartaoWeb(String email, String nome){
        this.nome = nome;
        if( validateEmail(email) ){
            this.email = email;
        }
        else{
            this.email = "email invalido";
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(validateEmail(email)){
            this.email = email;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private static boolean validateEmail(String email){
        return email.matches("^[\\w._\\S]+@[\\w._\\S]+.com$");
    }
}
