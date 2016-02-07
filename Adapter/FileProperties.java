import java.util.*;
import java.io.*;

public class FileProperties extends Properties implements FileIo {
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}
	
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "Written by FileProperties");
	}
	
	public void setValue(String key, String value) {
		setProperty(key, value);
	}
	
	public String getValue(String key) {
		return getProperty(key, "");
	}
}
