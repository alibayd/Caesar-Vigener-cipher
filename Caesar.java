public class Caesar implements Cipher{
	public String encrypt(String alphabet, String plainText, String key){
		int k = Integer.parseInt(key);			
		StringBuilder ciphered = new StringBuilder(plainText.length());
      		for(int i=0;i<plainText.length();i++){
    			int c=plainText.charAt(i); 
			if((c+k)>90){
				c+=(k-alphabet.length());		
			}else{
				c+=k;
			}
			char cph=(char)c;
			ciphered.append(Character.toString(cph));
		}
		String s=ciphered.toString();
		return (s);
	}

	public String decrypt(String alphabet, String cipherText, String key){
		int k = Integer.parseInt(key);	
		StringBuilder ciphered = new StringBuilder(cipherText.length());
      		for(int i=0;i<cipherText.length();i++){
    			int c=cipherText.charAt(i); 
			if((c-k)<65){
				c+=(alphabet.length()-k);		
			}else{
				c-=k;
			}
			char cph=(char)c;
			ciphered.append(Character.toString(cph));
		}
		String s=ciphered.toString();
		return (s);
	}
}
