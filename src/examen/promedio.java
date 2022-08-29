
package examen;
import java.util.Scanner;

public class promedio {
    public void matrices(){
        Scanner tec= new Scanner(System.in);
        double suma=0;
        int tamanov1=0, tamanov2=0;
        System.out.println("Escribe dos numeros para las dimensiones de la matriz");
        int dimension1=tec.nextInt();
        int dimension2=tec.nextInt();
    
    int[][] uno=new int[dimension1][dimension2];
    
for(int a=0; a<=dimension1-1; a++){
    for(int r=0; r<=dimension2-1; r++){
    System.out.println("Introduzca un dato para la posición "+a+r+" de la matriz");
    uno[a][r]=tec.nextInt();
    
    suma=suma+uno[a][r];
    }
}
int mayor[];
mayor=new int[dimension1*dimension2];
int menor[];
menor=new int[dimension1*dimension2];
double promedio=suma/(dimension1*dimension2);

for(int a=0; a<=mayor.length-1; a++){
    for(int b=0; b<=dimension1-1; b++){
    for(int r=0; r<=dimension2-1; r++){
        if(uno[b][r]>promedio){
            mayor[a]=uno[b][r];
            a++;
            
        }else{
             menor[a]=uno[b][r];
            a++;
        }
        
   
    }
    }
}
    
    System.out.println("El promedio es: "+ promedio);
    System.out.println("Los datos mayores al promedio son: ");
    for(int i=0; i<=mayor.length-1; i++){
        if(mayor[i]>0){
        System.out.println(mayor[i]);
        }
    }
    
    System.out.println("Los datos menores al promedio son: ");
    for(int i=0; i<=menor.length-1; i++){
        if(menor[i]>0){
        System.out.println(menor[i]);
        }
        
    }
    
    char si='a';
    String.valueOf(si);





    }
}
