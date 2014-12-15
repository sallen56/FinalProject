package firstPage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserView extends JFrame{
	// setting splash screen image
	protected JFrame frame;
	private JButton search= new JButton("Search Flights");
	private JButton support = new JButton("Support");
	private JButton account= new JButton("Account");
	private JButton home= new JButton("home");
	private JTextField dept_city;
	private TextArea arr_city;
	private JLabel fly_from;
	private JLabel fly_to;
	private JLabel selectAccount= new JLabel("Account");
	
	
	  
	// Method that creates the frame and adds the initial content of the frame
	protected UserView(){
		frame= new JFrame();
		frame.setTitle("Java Flights");
		frame.setSize(1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setContentPane(mainPanel);
		mainPanel.setOpaque(true);
		frame.getContentPane().setLayout(null);
	
	
		frame.add(search);
		search.setBounds(0,0,115,25);
		
		
		frame.add(support);
		support.setBounds(1269,0,89,25);
		
		frame.add(account);
		account.setBounds(1185,0,89,25);
		
		
		frame.add(home);
		home.setBounds(1097,0,89,25);
		home.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
				
				
			}
		});
		
		
	
	
		
		
		
		
	}
	 
	
	
	public static BufferedImage getImg() {
		return img;
	}
	public void setImg(BufferedImage img) {
		this.img = img;
	}
		// the variable "img" refers to the image
		  private static BufferedImage img =null;
		  private  JPanel mainPanel = new JPanel()
		  {
		    @Override
		    protected void paintComponent(Graphics g)
		    {
		      super.paintComponent(g);
		      if (getImg() != null)
		      {
		        int width = mainPanel.getWidth();
		        int height = mainPanel.getHeight();
		        // and do the drawing here:
		        g.drawImage(getImg(), 0, 0, width, height, mainPanel);
		      }
		    }
		  };




		
		  
	

	public static void main(String[]args){
		UserView one= new UserView();
	
	}
	}
	

