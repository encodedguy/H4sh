import java.io.IOException;

class H4sh{
	public void Switch(int option, String str){
		switch (option){
			case 1:
				switch(str){
					case "A":
						Binary binaryObj = new Binary();
						binaryObj.printHash(option);
						break;
					case "B":
						// CaesarCipher CaesarCipherObj = new CaesarCipher();
						// CaesarCipherObj.printHash(option);
						break;
					case "C":
						Hex hexObj = new Hex();
						hexObj.printHash(option);
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHash(option);
					case "E":
						Octal octalObj = new Octal();
						octalObj.printHash(option);
						break;
					case "F":
						//
						break;
					case "G":
						sha128 sha128Obj = new sha128();
						sha128Obj.printHash(option);
						break;
					case "H":
						sha256 sha256Obj = new sha256();
						sha256Obj.printHash(option);
						break;
					case "I":
						sha512 sha512Obj = new sha512();
						sha512Obj.printHash(option);
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
					case "M":
						MD2 md2Obj = new MD2();
						md2Obj.printHash(option);
				}
				break;
			case 2:
				switch(str){
					case "A":
						Binary binaryObj = new Binary();
						binaryObj.printHashes();
						break;
					case "B":
						//
						break;
					case "C":
						Hex hexObj = new Hex();
						hexObj.printHashes();
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHashes();
					case "E":
						Octal octalObj = new Octal();
						octalObj.printHashes();
						break;
					case "F":
						//
						break;
					case "G":
						sha128 sha128Obj = new sha128();
						sha128Obj.printHashes();
						break;
					case "H":
						sha256 sha256Obj = new sha256();
						sha256Obj.printHashes();
						break;
					case "I":
						sha512 sha512Obj = new sha512();
						sha512Obj.printHashes();
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
				}
				break;
			case 3:
				switch(str){
					case "A":
						Binary binaryObj = new Binary();
						binaryObj.printHash(option);
						break;
					case "B":
						// CaesarCipher CaesarCipherObj = new CaesarCipher();
						// CaesarCipherObj.printHash(option);
						break;
					case "C":
						Hex hexObj = new Hex();
						hexObj.printHash(option);
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHash(option);
						break;
					case "E":
						Octal octalObj = new Octal();
						octalObj.printHash(option);
						break;
					case "F":
						//
						break;
					case "G":
						sha128 sha128Obj = new sha128();
						sha128Obj.printHash(option);
						break;
					case "H":
						sha256 sha256Obj = new sha256();
						sha256Obj.printHash(option);
						break;
					case "I":
						sha512 sha512Obj = new sha512();
						sha512Obj.printHash(option);
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
					case "M":
						MD2 md2Obj = new MD2();
						md2Obj.printHash(option);

				}
				break;
			case 4:
				switch(str){
					case "A":
						//
						break;
					case "B":
						//
						break;
					case "C":
						//
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHash(option);
					case "E":
						//
						break;
					case "F":
						//
						break;
					case "G":
						//
						break;
					case "H":
						//
						break;
					case "I":
						//
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
				}
				break;
			case 5:
				   switch(str){
					case "A":
						//
						break;
					case "B":
						//
						break;
					case "C":
						//
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHash(option);
					case "E":
						//
						break;
					case "F":
						//
						break;
					case "G":
						//
						break;
					case "H":
						//
						break;
					case "I":
						//
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
				}
				break;
			case 6 :
				switch(str){
					case "A":
						//
						break;
					case "B":
						//
						break;
					case "C":
						//
						break;
					case "D":
						md5 md5Obj = new md5();
						md5Obj.printHash(option);
					case "E":
						//
						break;
					case "F":
						//
						break;
					case "G":
						//
						break;
					case "H":
						//
						break;
					case "I":
						//
						break;
					case "J":
						//
						break;
					case "K":
						//
						break;
					case "L":
						//
						break;
				   }
				break;
			}
		}

	public static void main(String[] args){
		H4sh H4shObj = new H4sh();
		bigBanner bigBannerObj = new bigBanner();

		try{
			bigBannerObj.printBigBanner();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		banner bannerObj = new banner();
		int option = bannerObj.numInput();

		if (option == 1){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}

		if(option == 2){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}

		if (option == 3){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}

		if (option == 4){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}

		if (option == 5){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}

		if (option == 6){
			bannerObj.banner1();
			H4shObj.Switch(option, bannerObj.banner1Input());
		}
	}
}
