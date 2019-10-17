import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PathWalkTest {

	
	public static void main(String[] args){
		
		Stream<Path> files = null;
		try {
			files = Files.walk(Paths.get("/var/temp/users/29E3341B17B22B86EFB502FF6E044401/"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> fileList = files.filter(f -> f.getFileName().toString().endsWith("csv"))
				.map(x -> x.toString()).collect(Collectors.toList());
		
		System.out.println(fileList);
	}
}
