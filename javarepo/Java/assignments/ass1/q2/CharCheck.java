package q2;
// q2

import java.util.Scanner;

public class CharCheck{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String a= sc.nextLine();

        char[] b = a.toCharArray();

        int x = a.length();

        for( int i=0; i<x ; i++ ){

            if(b[i] >= 65 && b[i] <= 90){

                System.out.println("Uppercase");

            }

            else if(b[i] >= 97 && b[i] <= 122){

                System.out.println("Lowercase");

            }

            else if(b[i] >= 48 && b[i] <= 57){

                System.out.println("Digit");

            }

            else{

                System.out.println("Special Character");

            }

        }

    sc.close(); }

    }
