package torresdehanoi;

import java.util.*;
public class Hanoi {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        int rp=1;
        while(rp==1){
        Scanner sc = new Scanner(System.in); //Leer numero de discos a utilizar
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
        System.out.print("Desea jugar de nuevo?(1 S1, 0 No): ");
        rp=resp.nextInt();
        }
    }
        


public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
}