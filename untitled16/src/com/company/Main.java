package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     System.out.print("1.sayıyı giriniz: ");
	     int a= input.nextInt();
	     System.out.print("2.sayıyı giriniz:");
	     int b= input.nextInt();
	     System.out.print("3.sayıyı giriniz: ");
	     int c = input.nextInt();
	     if((a>b) && (a>c) ) {
	         if(b>c){

	             System.out.println("c<b<a");

             }
	         else {
	             System.out.println("b<c<a");
             }

         } else if ((b>a)&&(b>c))  {
	         if(a>c){
	             System.out.println("c<a<b"); }
	             else { System.out.println("a<c<b");
             }

         } else {
	     	if(a<b){
	     		System.out.println("a<b<c");
			} else{
	     		System.out.println("b<a<c");
			}

		}

		 }
    }

