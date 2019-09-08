import java.util.Scanner;
public class CSCI{
	private static void displayMenu(){
		System.out.printf("%n"); 
		System.out.println("CSCI Cipher Operations:");
		System.out.println("-------------------------------------");
		System.out.println("1. Decrypt and verify Caesar cipher");
		System.out.println("2. Decrypt and verify Vigenere cipher");
		System.out.println("3. Display this menu again");
		System.out.println("4. Quit");	
		System.out.printf("%n"); 
	}
	
	private static void printResult(String e, String d, String c ){
		System.out.printf("%n"); 
		System.out.println("Plain text					  : " + d);
		System.out.println("Plain text re-encrypted for verification          : " + e);
		System.out.print("Are cipher text and encrypted text equal	  : ");		
		if(e.equals(c)){
			System.out.print("true");		
		}else{
			System.out.print("false");
		}
		System.out.printf("%n"); 
	}
	
	private static int getChoice(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Choice : ");
		int cho=sc.nextInt();
		return (cho);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		displayMenu();
		System.out.print("Choice : ");
		int choice=sc.nextInt();
		while(choice!=4){
			if(choice==1){
				System.out.print("Enter alphabet     : ");
				String alph = sc.next();
				System.out.print("Enter cipher text  : ");
				String ciph=sc.next();
				System.out.print("Enter key          : ");
				String k=sc.next();

				Caesar c = new Caesar();
				String decryption=c.decrypt(alph, ciph, k);
				String encryption=c.encrypt( alph, decryption, k);
				
				printResult(encryption, decryption, ciph);

				System.out.printf("%n"); 
				choice=getChoice();
			}else if(choice==2){
				System.out.print("Enter alphabet     : ");
				String alph = sc.next();
				System.out.print("Enter cipher text  : ");
				String ciph=sc.next();
				System.out.print("Enter key          : ");
				String k=sc.next();

				Vigenere v = new Vigenere();
				String decryption=v.decrypt(alph, ciph, k);
				String encryption=v.encrypt( alph, decryption, k);
				
				printResult(encryption, decryption, ciph);

				System.out.printf("%n"); 
				choice=getChoice();
			}else if(choice==3){
				displayMenu();
				choice=getChoice();
			}else{
				System.out.println("Invalid choice! Try again.");
				System.out.printf("%n"); 
				choice=getChoice();
			}
		}
		System.out.printf("%n"); 
		System.out.println("Have a crime-free day!");
	}
}
