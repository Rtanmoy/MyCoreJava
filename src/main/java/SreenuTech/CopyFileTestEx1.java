package SreenuTech;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileTestEx1 {

private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
    Files.copy(source.toPath(), dest.toPath());
}


	public static void main(String[] args) {
      
		 File source = new File("input.txt");
	     File dest = new File("output.txt");
	     
	     try {
			copyFileUsingJava7Files(source,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
