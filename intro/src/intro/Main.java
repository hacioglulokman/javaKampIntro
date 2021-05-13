package intro;

public class Main {

	public static void main(String[] args) {
		// camel case ile adlandirilir.
		//don't repeat yourself
		
		/*
		 * String internetSubeButonu= "Internet Subesi"; double dolarDun = 8.20; double
		 * dolarBugun = 8.20 ; int vade = 36; boolean dustuMu = false;
		 */
		
		/*
		 * System.out.println("hello world" ); System.out.println(internetSubeButonu);
		 * 
		 * if(dolarBugun<dolarDun) { System.out.println("dolar dustu Resmi");
		 * 
		 * }else if(dolarBugun>dolarDun){
		 * 
		 * System.out.println("dolar yukseldi resmi");
		 * 
		 * } else { System.out.println("dolar esittir resmi"); }
		 * 
		 * String[] krediler = {"hizli kredi" ,"mutlu emekli kresi" ,"Msb Kredisi"};
		 * 
		 * //foreach dongusu for(String kredi:krediler) { System.out.println(kredi); }
		 * 
		 * for ( int i=0; i<krediler.length; i++) { System.out.println(krediler[i]);
		 * 
		 * }
		 */
		int sayi1 = 10;
		int sayi2 = 20; 
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,4,5};
		int[] sayilar2 = {10,23,54,75};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "ankara";
		String sehir2="istanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);
				
}
}  
