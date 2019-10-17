import java.io.File;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZipTester {
	
	
	public static void main(String[] args) throws ZipException{
		
		
			ZipFile zip = new ZipFile(new File("zippedFiles.zip"));
			zip.addFile(new File("test2.txt"));
			zip.addFile(new File("test.txt"));
			
			
	}
}
