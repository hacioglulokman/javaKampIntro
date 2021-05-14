package inheritance2;

public class LogManager {

	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritabanina logladi");
		}else if(logType==2){
			
			System.out.println("dosyayaloglandi");	
		}else {
			System.out.println("Email gonderildi");
		}
	}
}
