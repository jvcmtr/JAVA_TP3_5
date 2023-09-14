package JAVA_TP3_5;

public class Aniversario extends CartaoWeb implements Parabenizavel {
    public Aniversario(String email, String nome){
        super(email, nome);
    }

    @Override
    public void showMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showMessage'");
    }
}
