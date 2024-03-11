package package2;

class gun{
	 
			 
			String gunname;
			int  noofbullets;
			 
			public gun(String gunname, int noofbullets){
			 
			this.gunname = gunname;
			this.noofbullets=noofbullets;
			}
			 
			 
			public void shoot(){
			 
			for(int i =1;i<=noofbullets;i++){
			System.out.println("fire");
			}
			}

}
