public class DiaDosNamorados extends CartaoWeb {
    String NomeDoEvento = "dia dos namorados";

    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public void showMessage() {
        String mensagem = """
            mensagem para: [email]
            Parabéns, [nome] pelo [evento].
            ======================================
                """;
        mensagem = mensagem.replace("[email]", this.getEmail());
        mensagem = mensagem.replace("[nome]", this.getNome());
        mensagem = mensagem.replace("[evento]", NomeDoEvento);

        System.out.println(mensagem);
    }
    
}
