import java.util.Scanner;

public class App {
    public static void media(){
        Scanner nota = new Scanner(System.in);
        System.out.println("Digite sua primeira N1: ");
        double n1 = nota.nextDouble();
        System.out.println("Digite sua segunda N2: ");
        double n2 = nota.nextDouble();
        System.out.println("Digite sua terceira N3: ");
        double n3 = nota.nextDouble();
        double media =(n1 + n2 + n3)/ 3;
        System.out.println("A sua média é: " + media);
        if(media  >= 6){
            System.out.println("Parabéns, você foi aprovado!");
        }else{
            System.out.println("Infelizmente, você foi reprovado!");
            nota.close();
        }
    }public static void main(String[] args){
        media();
    }
}
