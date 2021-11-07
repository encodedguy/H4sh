class H4sh{
	public static void main(String[] args){
		banner bannerObj  = new banner();
		
		if (bannerObj.numInput() == 1){
			bannerObj.banner1();

			switch (bannerObj.banner1Input()){
				case "A":	
					base32 base32Obj = new base32();
					base32Obj.base32_1();
			}
		}
	}
}
