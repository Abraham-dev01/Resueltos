import java.util.Scanner;
public class PositivoNegativo
{
    public static void main(String[]args){
        Scanner n= new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double num=n.nextDouble();
        if(num>0){
            System.out.println("El número "+num+" es positivo");
        }else if(num==0){
            System.out.println("El número "+num+" es cero");
        }else{   System.out.println("El número "+num+" es negativo");
        }
    }}
    

