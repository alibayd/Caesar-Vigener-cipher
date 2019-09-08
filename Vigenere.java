public class Vigenere implements Cipher{
	private String makekey(String k, int txtl){
		for(int i=0;k.length()!=txtl;i++){
			if(i==k.length()){i=0;}
			k+=Character.toString(k.charAt(i));
		}
		return(k);	
	}
	public String encrypt(String alphabet, String plainText, String key){
		if(key.length()!=plainText.length()){
			key=makekey(key, plainText.length());		
		}
		String enc="";
		for(int i=0; i<plainText.length();i++){
			int ch=((plainText.charAt(i)+key.charAt(i))%alphabet.length());
			        ch += 'A'; 
        			enc+=(char)(ch); 
		}
		return(enc);
	}
	public String decrypt(String alphabet, String cipherText, String key){
		if(key.length()!=cipherText.length()){
			key=makekey(key, cipherText.length());		
		}
		String msg="";
		for(int i=0; i<cipherText.length();i++){
			int ch=(Math.abs(alphabet.length()+(cipherText.charAt(i)-key.charAt(i)))%alphabet.length());
			        ch += 65; 
        			msg+=(char)(ch); 
		}
		return(msg);	
	}
}
