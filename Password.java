import java.util.Scanner;
public class Password
{
    public static void main(String[]args){
        int c1=5386;
        Scanner dato= new Scanner(System.in);
        int a1;
        for(int i=0; i<=2;i++){
        System.out.println("Introduzca contraseña: ");
        a1= dato.nextInt(); 
        if(c1==a1){System.out.println("Acceso concedido");
        i=3;}
            else if(i<3){System.out.println("Contraseña incorrecta");}
        }
        
        }
    
    }   
