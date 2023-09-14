package JAVA_TP3_5;

public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public void showMessage() {
        String[] a = this.getClass().getName().split("[A-Z]");
        String ClassName = "";
            for (String string : a) {
                ClassName += string.toLowerCase() + " ";
            }

        String mensagem = """
            mensagem para: [email]
            Parabéns, [nome] pelo [evento].
            ======================================
                """;
        mensagem = mensagem.replace("[email]", this.getEmail());
        mensagem = mensagem.replace("[nome]", this.getNome());
        mensagem = mensagem.replace("[evento]", ClassName);

        System.out.println(mensagem);
    }
    
}
