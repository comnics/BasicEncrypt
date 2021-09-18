package util.comnic.com;

public class MD5Sample {

	public static void main(String[] args) throws Exception {
		String plainText = "Hello, World";
		String key = "comnics Secret key";
		
		System.out.println("MD5 : " + plainText + " -> " + CryptoUtil.md5(plainText));
		System.out.println("SHA-256 : " + plainText + " -> " + CryptoUtil.sha256(plainText));
		System.out.println("SHA-512 : " + plainText + " -> " + CryptoUtil.sha512(plainText));
		
		String encMessage = CryptoUtil.encryptAES256(plainText, key);
		System.out.println("AES-256 : " + plainText + " -> " + encMessage);
		System.out.println("AES-256 : " + plainText + " -> " + CryptoUtil.decryptAES256(encMessage, key));
	}
}
