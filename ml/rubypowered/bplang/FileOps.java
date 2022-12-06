package ml.rubypowered.bplang;

import java.io.File;
import java.io.IOException;

public class FileOps{
	
	public static void mkfile(String path, String name) {
		File file = new File(path + "\\" +name);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}