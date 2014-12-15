package firstPage;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomePage extends UserView  {
	
	
	
	
	
	public HomePage(){
		
		
		
		try
		    {
		    
		     // download the image off of the internet
		  setImg(ImageIO.read(new File("C:\\Users\\Reesey\\Pictures\\From Reesey\\vaca.jpg")));
		    }
		    catch (MalformedURLException e)
		    {
		      e.printStackTrace();
		    }
		    catch (IOException e)
		    {
		      e.printStackTrace();
		    } 
	}
	
	
		 
	

	
		public static void main(String[]args){
			HomePage one= new HomePage();
	
		}
		

}                               

