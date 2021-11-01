package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
        sayıların ortalamasını hesaplayan programı yazınız.
         */
        Scanner input=new Scanner(System.in);
        int number,counter=0;
        double average=0;
        System.out.println("lütfen bir sayı giriniz");
        number= input.nextInt();
        for (int i=1;i<=number; i++){
            if (i%12==0){
                //System.out.println(i);
                counter++;
                average+=i;
            }

            else if (i%4==0 ){

                //System.out.println(i);
                counter++;
                average+=i;

            }else if (i%3==0){

                //System.out.println(i);
                counter++;
                average+=i;
            }



        }
        //System.out.println(counter);
        //System.out.println(average);
        System.out.print("Girilen sayıya kadar olan 3 ve 4'e bölünen sayıların ortlaması = ");
        System.out.println(average/counter);
    }
}
