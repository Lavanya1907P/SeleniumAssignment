package webElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader 
{
	Properties p1;
	
	public configReader(String filename)
	{
		//path of the file 
		
		File f1= new File(System.getProperty("user.dir")+"//"+filename+".properties");
		
		FileInputStream s1;
		
		p1= new Properties();
		
		
		//reader
		try {
			s1= new FileInputStream(f1);
			
			p1.load(s1);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
	public String getData(String key)
	{
		return p1.getProperty(key);
		
	}	
		
		
		
	}
