class H4sh{
	public static void Switch(String str)
	{
		switch (str){
			case "A":	
				//base32 base32Obj = new base32();
				//base32Obj.base32_1();
				break;
			case "B":
				//base 64 //
			case "C":
				//ROT13//
			case "D":
				//MOrse code//
			case "E":
				//NTLM//
			case "F":
				md5 md5Obj = new md5();
				md5Obj.printHash();
				break;
			case "G":
				sha128 sha128Obj = new sha128();
        			sha128Obj.printHash();
				String encodeFile(){
				break;
			case "H":
				sha256 sha256Obj = new sha256();
				sha256Obj.printHash();
				break;
			case "I":
				sha512 sha512Obj = new sha512();
        			sha512Obj.printHash();
				break;
			case "J":
				//Whirlpool//
			case "K":
				XORCipher XORCipherObj = new XORCipher();
        			XORCipherObj.printHash();
				break;
			case "L":
				//Caesar Cipher//
			default:
				//any statement//		
		}				
	public static void main(String[] args){
		banner bannerObj  = new banner();
		H4sh h4shObj = new H4sh();

		if (bannerObj.numInput() == 1){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
			
		}
	
		if (bannerObj.numInput() == 2){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
			
		}
	
		if (bannerObj.numInput() == 3){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
			
		}
		if (bannerObj.numInput() == 4){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
		}
		if (bannerObj.numInput() == 5){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
			
		}
		if (bannerObj.numInput() == 6){
			bannerObj.banner1();
			H4sh.Switch(bannerObj.banner1Input());
			
		}
	}
}
