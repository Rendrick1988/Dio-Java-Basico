public class operadoresRelacionais {
    public static void main(String[] args) throws Exception { 


      String nomeUm = "Patrick";
      String nomeDois = "Patrick";

      System.out.println(nomeUm == nomeDois);

       // new String cria um novo objeto a variavel
       // o metodo (equals) compara  se o metodo dos objetos sao iguais
       


     int numero1 = 1;
     int numero2 = 2;

     boolean simNao = numero1 == numero2;



     if(numero1 < numero2)

     System.out.println("a nossa condiçao é verdadeira");




     

     System.out.println("numeroUm é igual ao numeroDois ?" + simNao);

     simNao = numero1 != numero2;

     System.out.println("numeroUm é diferente do numeroDois ?" + simNao);

     simNao = numero1 > numero2;

     System.out.println("numeroUm é maior que numeroDois ?" + simNao);


      simNao = numero1 < numero2;

      System.out.println("numeroUm é menor que numero2 ?" + simNao);

      









    }

}
