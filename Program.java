import java.util.LinkedList;

public class Program {
    public static void main(String args[]){
        System.out.println("\n");


        LinkedList<CartaoWeb> cartoes = new LinkedList<>();
            
        cartoes.add(new Aniversario("ernestoChe@email.com", "Ernesto"));
        cartoes.add(new Pascoa("papi.francis@vatycity.com", "Fransisco"));
        cartoes.add(new Natal("noelGreen@not.coke.com", "Santa Klauss"));
        cartoes.add(new DiaDosNamorados("louG@email.com", "lou"));
        cartoes.add(new Aniversario("tio_zuke_123@meta.com.com", "Mark Zukenberg"));
        cartoes.add(new Natal("real.redsanta@cocacola.com", "Papai Noel"));
        cartoes.add(new Pascoa("longaperna@bomvelinho.com", "Perna Longa"));
        cartoes.add(new Natal("eunaoSeiescrever", "Pessoa com email erradissimo"));

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
