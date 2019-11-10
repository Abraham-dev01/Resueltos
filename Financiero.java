/**
 * Descripción

Larry se graduó este año y, finalmente, tiene un trabajo. 
Está ganando un montón de dinero, pero de alguna manera nunca 
parece tener suficiente. Larry ha decidido que necesita tomar 
control de su cartera financiera y resolver sus problemas de 
financiación. El primer paso es averiguar lo que está pasando 
con su dinero. Larry tiene sus estados de cuenta bancarios y 
quiere ver la cantidad de dinero que tiene. Ayuda a Larry
escribiendo un programa que tome su balance de cierre de cada 
uno de los últimos doce meses y calcule su saldo promedio.

Especificación de salida

La salida será un único número , el promedio (media) de los 
saldos de cierre de los 12 meses. Se mostrara inmediatamente 
precedido por un signo de pesos, y seguido por el final de 
la línea. No habrá otros espacios o caracteres en la salida.

Ejemplo de salida

$1581.42

Sugerencia(s)

Evita proporcionar soluciones que son fuente de la web,
así como tu lo buscaste tambien otras personas pueden
hacerlo.

En una archivo compreso sube tu solucion al siguiente enlace:
https://drive.google.com/drive/folders/1uB4KJqy2JjmZaIrcFX8ySp3bQ_4TYVuY?usp=sharing
 * 
 */

public class Financiero{
    public double sueldo[] = new double[]{100.00,489.12,12454.12,1234.10,//Cambiamos el int por double
                              823.05,109.20,5.27,1542.25,839.18,
                              83.99,1295.01,1.75};

    public void resolver(){
        double saldoPromedio=0;
        for (int index = 0; index < sueldo.length ; index++) {//El contador debe ser menor al largo del arreglo sueldo, y debe ir aumentando, cambiamos el index-- por index++
            saldoPromedio = saldoPromedio+sueldo[index];//A la variable saldo le agregamos el valor del arreglo sueldo
        }

        saldoPromedio/=12;

        System.out.println("$"+saldoPromedio);//Agregamos el signo de pesos
    }

        public static void main(String[] args) {
        Financiero financiero = new Financiero();
        financiero.resolver();
    }
}