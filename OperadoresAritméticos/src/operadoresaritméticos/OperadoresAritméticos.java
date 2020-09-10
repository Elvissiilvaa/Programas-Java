/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritméticos;

/**
 *
 * @author elvis
 */
public class OperadoresAritméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 
        int n1 = 3;
        int n2 = 5;
        
        float media = (n1+n2) /2;
        System.out.println("A média ficou em "+ media); */
        
       //incremento e decremento
       /* int numero = 5; 
        numero--;
        System.out.println("o numéro é: "+ numero); */
        
       
        //pós-incremento  ( numero++ ) ele faz todo o processo e aumenta a quantidade após a operação  
        //e pré-incremento (++ numero) ele faz a operação com o número já incrementado
      
        // OPERAÇÕES EM INCREMENTO
        /*
        int numero = 5; 
        int valor = 5 + ++numero;
        System.out.println("o valor em pós incremento é "+valor);
        System.out.println("o numéro é: "+ numero); */
        
        
        //pós-decremento (numero--) ele faz todo o processo e diminui a quantidade após a operação.
        
        //e pré-decremento (--numero) ele faz a operação com o número já decrementado
        
        // OPERAÇÕES EM DECREMENTO
        
       /* int numero = 10; 
       
        int valorpos = 5 + --numero;
        System.out.println("o valor em pós decremento é "+valorpos);
        System.out.println("o numéro é: "+ numero); */
        
        // OPERADORES DE ATRIBUIÇÃO
        
        // PODERIA SER USADO O -=,  +=,  /=,  %=
        
      //  int x = 4;
       // x +=2; // x=x +2;
       // System.out.println("O valor é: "+x);
        
        
        
        
        //  CLASSE MATH = MATEMÁTICA. 
        
        //  MATH.PI   , MATH.POW(5,2) = potência , MATH.SQRT(25) = Raiz quadrada , MATH.CBRT(27)= Raiz cúbica 
        //  MATH.FLOOR = Arredonda para baixo. ex: 4.6 será = 4.
       // MATH.ceil = Arredonda para cima ex: 4.6 será = 5
     
       
        // MATH.RANDOM = GERADOR DE  NÚMEROS.      
      
      
         /*float y = 8.3f;
         int ar =(int) Math.floor(y); 
         sout */
   
      //  Para gerar um número entre um determinado intervalo é necessário fazer da forma abaixo.
      
            /* 5+ Math.random(*10-5)*/
      // dessa forma acima será gerado numeros entre 5 e 10. 
      //Caso eu precise gerar entre outro intervalo eu substituo o intervalo inicial e o final de acordo com o desejado. 
        
      double ale = Math.random();
      int n = (int) (5+ ale * (10-5)); // esse int inicial força a o número para inteiro. 
        System.out.println("o valor entre o intervalo de 5 e 10 é : "+ n); 
      
    }
    
}
