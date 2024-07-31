

public class Operadores {
    
    public static void main(String[] args) {
        /*String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);*/

        /*int numero = -5;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);*/

/*        int a, b;
        a = 7;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);*/
        String nomeUm = "Vagner";
        String nomeDois = new String("Vagner");

        System.out.println(nomeUm.equals(nomeDois));
        
        
        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;

        if(++numeroUm == numeroDois){ //true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("O numeroUm é igual do numeroDois? " + simNao);
        
        simNao = numeroUm != numeroDois;

        System.out.println("O numeroUm é diferente do numeroDois? " + simNao);
        
        simNao = numeroUm > numeroDois;

        System.out.println("O numeroUm é maior que o numeroDois? " + simNao);
        
    }

}
