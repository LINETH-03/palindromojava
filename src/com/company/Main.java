package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palindromo;

        System.out.println("INGRESAR PALABRA");
        palindromo = scan.nextLine();


        if (cap(palindromo))
            System.out.println("ES PALINDROMO");
        else
            System.out.println("NO ES PALINDROMO");



    }

    public static boolean cap( String sPalabra){
        //DECLARAR VARIABLES
        String dd;
        boolean tr= true;
        int in,i;
        //OMITIR ESPACIOS
        dd=sPalabra.replace(" ","");
         in=dd.length();
        //GENRERAR PALINDROMO
        for (i= 0 ;i < (dd.length()); i++){
            if (dd.substring(i, i+1).equals(dd.substring(in -1, in))==false){
                tr=false;
                break;
            }
            in --;
        }
        return tr;
    }

    }





