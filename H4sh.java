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
