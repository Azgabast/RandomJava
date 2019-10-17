import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunPythonScriptFromJava {
	
	public static void main(String[] args) throws InterruptedException{
		 String[] cmd = {
		      "python",
//		      "c:\\Users\\VNBM6005\\Documents\\Evolutions\\TrafficPredictor\\pytest.py",
//		      "c:\\Users\\VNBM6005\\workspace\\PoC_Random\\pytest.py",
		      "a"
		    };
    try {
//		Runtime.getRuntime().exec(cmd);
    	RunPythonScriptFromJava instance = new RunPythonScriptFromJava();
//    	instance.anotherWay();
    	instance.secondWay();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	
	public void anotherWay() throws IOException{
		
		
//		 String[] callAndArgs = {"python", "c:\\Users\\VNBM6005\\Documents\\Evolutions\\\\pytest.py"};
//		 String[] callAndArgs = {"python", "c:\\Users\\VNBM6005\\Documents\\Evolutions\\TrafficPredictor\\RANDim_TrafficPredictor_v2_1_3.py", 
//				 "Forecast_Fit","52","inputCSON_SiteBySite_final_saisonnier_v2.csv",
//				 "inputCSON_SiteBySite_final_saisonnier_v2.csv",
//				 "10", "2018","05", "2019", "05", "AUTO", "1", ".", "."};
		 
		  String[] callAndArgs = {"python", "/var/temp/RANDim_TrafficPredictor_v2_1_3.py", 
				 "Forecast_Fit","52","input_short.csv",
				 "inputCSON_SiteBySite_final_saisonnier_v2.csv",
				 "10", "2018","05", "2019", "05", "AUTO", "1", "/var/temp/", "/var/temp/"};
//		  ./src/
	    
		  
//		 Process iostat = new ProcessBuilder().command("iostat", "-C").inheritIO().start();
//		int exitCode = iostat.waitFor();
//		System.out.println("exitCode = " + exitCode); 
		  
	    Process p = Runtime.getRuntime().exec(callAndArgs);
	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	
	    String s;
	    while ((s = stdInput.readLine()) != null) {
	    	System.out.println("reading data");
	        System.out.println(s);
	    }
	
	    while ((s = stdError.readLine()) != null) {
	    	System.out.println("reading error");
	        System.out.println(s);
	    }
		
		
	}
	
	public void secondWay() throws IOException, InterruptedException{
		
		
		 
//		  String[] callAndArgs = {"python", "/var/temp/RANDim_TrafficPredictor_v2_1_3.py", 
//				 "Forecast_Fit","52","input_short.csv",
//				 "inputCSON_SiteBySite_final_saisonnier_v2.csv",
//				 "10", "2018","05", "2019", "05", "AUTO", "1", "/var/temp/", "/var/temp/"};
	    
		  
		 Process p = new ProcessBuilder().command("python", "-u", "/var/temp/RANDim_TrafficPredictor_v2_1_3.py", 
				 "Forecast_Fit","52","input_short.csv",
				 "inputCSON_SiteBySite_final_saisonnier_v2.csv",
				 "10", "2018","05", "2019", "05", "AUTO", "1", "/var/temp/", "/var/temp/").inheritIO().start();
		 
		 
	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
	
	    String s;
	    while ((s = stdInput.readLine()) != null) {
//	    	System.out.println("reading data");
	        System.out.println(s);
	    }
	
	    while ((s = stdError.readLine()) != null) {
//	    	System.out.println("reading error");
	        System.out.println(s);
	    }
		 
		 
//		int exitCode = iostat.waitFor();
		
		
//		System.out.println("exitCode = " + exitCode); 
//		  
//	    Process p = Runtime.getRuntime().exec(callAndArgs);
//	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
//	    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//	
//	    String s;
//	    while ((s = stdInput.readLine()) != null) {
//	    	System.out.println("reading data");
//	        System.out.println(s);
//	    }
//	
//	    while ((s = stdError.readLine()) != null) {
//	    	System.out.println("reading error");
//	        System.out.println(s);
//	    }
		
		
	}

}
