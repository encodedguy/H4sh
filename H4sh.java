import java.io.IOException;

class H4sh{
	public void Switch(int option, String str){
		switch (option){
			case 1:
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
				}
				break;
			case 2:
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
						md5Obj.printHashes();
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
						sha256 sha256Obj = new sha256();
						sha256Obj.printHashes();
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
			case 3:
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
						break;
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
