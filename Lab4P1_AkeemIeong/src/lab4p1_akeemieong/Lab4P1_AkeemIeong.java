package lab4p1_akeemieong;

import java.util.Scanner;
import static lab4p1_akeemieong.Lab4P1_AkeemIeong.leer;

public class Lab4P1_AkeemIeong {

        static Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1->Sumador Binario");
        System.out.println("2->Contains");
        System.out.println("3->Alpha");
        System.out.println("4->Salir del programa");
        opcion =leer.nextInt();
        
        if (opcion==1){
            boolean one,two;
            String cadena1,cadena2;
            System.out.println("Ingrese una cadena: ");
            cadena1=leer.next();
            System.out.println("Ingrese una cadena: ");
            cadena2=leer.next();
            if (cadena1.length()==cadena2.length()){
                for (int s=0;s<cadena1.length();s++){
                    if (cadena1.charAt(s)==1||cadena1.charAt(s)==0){
                        one=true;
                    }
                    else 
                        one=false;
                }
                for(int v=0;v<cadena2.length();v++){
                    if (cadena2.charAt(v)==1||cadena2.charAt(v)==0){
                        two=true;
                    }
                    else
                        two=false;
                }
            sumadorbinario(cadena1,cadena2);
            }
            else 
                System.out.println("Los numeros deben de tener el mismo numero de bits");
        }
        else
            if (opcion==2){
                String pri,sec;
                System.out.println("Ingrese la primera cadena: ");

                pri=leer.next();
                pri=pri+leer.nextLine();
                System.out.println("Ingrese la segunda cadena: ");
                sec=leer.next().toLowerCase();
                if(pri.length()>sec.length())
                    Contains(pri,sec);
                else
                    System.out.println("El tamano de la segunda no puede ser mayor que el de la primera");
            }
            else
                if (opcion ==3){
                    String phrase;
                    System.out.println("Ingrese la cadena que desea evaluar: ");
                    phrase=leer.next().toLowerCase();
                        Alpha(phrase);
              
                }
        }
        while (opcion!=4);
        
        
    }
    public static void sumadorbinario(String cadena1,String cadena2){
        boolean one,two;
        for (int s=0;s<cadena1.length();s++){
                    if (cadena1.charAt(s)==1||cadena1.charAt(s)==0){
                        one=true;
                    }
                    else 
                        one=false;
                }
                for(int v=0;v<cadena2.length();v++){
                    if (cadena2.charAt(v)==1||cadena2.charAt(v)==0){
                        two=true;
                    }
                    else
                        two=false;
                }
                if (one==true&&two==true){
                    String cadenasuma="";
                    for (b=0;b<cadena1.length();b++){
                        
                    }
                   
                }
    }
    public static void Contains(String pri,String sec){
        int conta=0,g=0,tama=sec.length(),tama2=pri.length();
        for (int w=0;w<tama2;w++){
            
            if (pri.charAt(w)==sec.charAt(g)){
                conta++;
                if (g<=tama){
                g++;
                }
            }
            else 
                
                g=0;

        }
        if (conta>tama){
        System.out.println("La cadena "+pri+" contiene a la cadena "+sec);
        }
        else
            System.out.println("La cadena "+pri+" no contiene la cadena "+sec);
    }
    public static void Alpha(String phrase){
            int cont=0,cont9=0;
            for (int t=0;t <phrase.length();t++){
            char lt=phrase.charAt(t);
            if (97<=(int)lt &&(int)lt<=122){
                cont++;
            }
            else
                cont9++;
            }
            if (cont9>0){
                System.out.println("La cadena contiene caracteres que no son letras");
            }
            else
                System.out.println("La cadena solo contiene letras");
            
    }
}
