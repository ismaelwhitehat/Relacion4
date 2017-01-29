package concatenaarray;

import java.util.Scanner;

public class ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7, 2 };
		int c[];
c=ConcatenaArraysPro(a,b);
for(int i=0;i<c.length;i++){
System.out.println(c[i]); 

}
	}

public static int[] ConcatenaArraysPro(int[]a,int [] b){
int suma;
suma=a.length+b.length;
int [] patata=new int[suma];
	
 for(int contador=0;contador<a.length;contador++){

patata[contador]=a[contador];

}
 int contdor=0;
for(int contador=a.length;contador<suma;contador++){
patata[contador]=b[contdor];
contdor=+1;


}
return patata;
}

}


