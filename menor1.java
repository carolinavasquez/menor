package menor;

import java.util.Scanner;

public class menor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
	        System.out.println("Ingresa el primer numero ");  
	        int A = sc.nextInt();  
	        System.out.println("Ingresa otro numero ");  
	        int B = sc.nextInt();  
	       
	        if(A < B ){  
	        System.out.println("El numero menor es " + A);  
	        }else{  
	            if(B < A ){  
	            	int A1= sc.nextInt(); 
	            System.out.println("numero menor es " + B);  
	            System.out.println("numero menor es " + A); 
	            }else{  
	            System.out.print("mmm los numeros son Iguales ");
		         
	            }  
	        }  
	     }  
	} 