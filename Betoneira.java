import java.util.Scanner;
public class Betoneira {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         double pesoAlvo = 500.0;
         double pesoAtual = 0.0;
        int ciclo = 0;
         System.out.println("Simulador de peso");
         System.out.println("Meta:" +pesoAlvo +" kg de Brita 1");

        do{
            System.out.println("Digite o peso da brita 1 adicionada (kg):");
            double pesoAdicionado = scanner.nextDouble();
            pesoAtual += pesoAdicionado;
            ciclo++;

            System.out.println("Peso atual: "+pesoAtual + "kg");

            if (pesoAtual >= pesoAlvo){
                System.out.println("Meta atingida em "+ciclo+"ciclos!");
                break;
                    }
                }while(true);
                if (pesoAtual > pesoAlvo * 10.0){
                    System.out.println(" Cuidado! você ultrpassou a meta em mais de 5%.");
                    System.out.println("pode estar com problemas de estabilidade.");
                }else{
                        System.out.println("Peso dentro do limite aceitavel");
                    }
                scanner.close();
                }
                

    }
    

