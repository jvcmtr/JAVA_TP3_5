Trabalho para a disciplina de JAVA

Repositorio com o enunciado disponível em:
https://github.com/leoinfnet/TP3_JAVA_2023/

5-) (Segunda parte, questão 1)
  Crie uma classe Chamada CartãoWEB. Essa classe representará todos os cartões web e deverá ter apenas dois atributos: email(String) e nome(String) .
  Crie um construtor recebendo essas Strings e valide se o email é válido. Caso contrário inicialize a string com "email invalido".

  Crie uma Interface com um método String:showMessage().

  Crie classes filhas da hierarquia proposta acima: DiaDosNamorados, Natal,Aniversário e Pascoa.

  Crie uma classe com o método main e crie 5 cartões com pelo menos 1 de cada tipo e coloque-os em um LinkedList.
  FAÇA UM LAÇO (UTILIZANDO API DO JAVA 8) para percorrer o Array e imprimir a mensagem com o seguinte formato: 
  
    "
    
    mensagem para: [email]
    
    Parabéns, [nome] pelo [evento].
    
    ======================================
    
    "
