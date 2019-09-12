package Acti5;
import java.util.*;
public class Ran {
    public static void main(String[] args) {

        Random r = new Random();
        Random l = new Random();

        String[] personas = new String[]{"1 ZAVALA", "2 RAMÍREZ", "3 CARLOS", "4 HUERTA", "6 JUAREZ","7 LEON","5 FERNANDEZ"};
        String[] dias = new String[]{"LUNES", "MARTES", "MIERC.", "JUEVES", "VIERNES","SABADO","DOMINGO"};
        int[]p=new int[] {1,2,3,4,5,6,7,8,9};

        for (int i=0; i<personas.length; i++) {

int posAleatoria = r.nextInt(personas.length);

String temp = personas[i];

personas[i] = personas[posAleatoria];

personas[posAleatoria] = temp;



int ale=l.nextInt(p.length);

int vaca = p[i];

p[i]=p[ale];

p[ale]=vaca;

}



      System.out.println(Arrays.toString(personas));
      System.out.println(Arrays.toString(p));

      //  for(int i=0;i<personas.length;i++)

      //             System.out.println(dias[i]+"\t - \t"+personas[i]);

}
}
