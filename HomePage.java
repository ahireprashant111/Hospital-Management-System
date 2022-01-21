import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener

{
   
   JButton  aboutHc,mts,bioChemical,register,medicine,other,change,exit,Nurse;
   
   JLabel SvcHc,homePage,image,image1;

   public HomePage()
    
     {
     
        setLayout(null);
	
        setTitle("Home Page");
	
        setBounds(0,0,1020, 729);
	 
        //setMinimumSize(new java.awt.Dimension(1020, 720));

        SvcHc=new JLabel("");

		SvcHc.setFont(new Font("Arial Narrow",Font.BOLD,45));

        SvcHc.setHorizontalAlignment(SwingConstants.CENTER);
       
        SvcHc.setBounds(120,20,780,70);
        
        getContentPane().add(SvcHc);
        
        
    	image1=new JLabel("Home Page");

    	image1.setFont(new Font("Arial Narrow",Font.BOLD,35));

    	image1.setForeground(new Color(102,102,255));

        image1.setHorizontalAlignment(SwingConstants.CENTER);

        image1.setIcon(new ImageIcon("b.jpg"));

        image1.setBounds(20,50,1000,120);
                
        getContentPane().add(image1);
 
	
        homePage=new JLabel("Home Page");

		homePage.setFont(new Font("Arial Narrow",Font.BOLD,35));

		homePage.setForeground(new Color(102,102,255));

        homePage.setHorizontalAlignment(SwingConstants.CENTER);

        homePage.setBounds(450,100,170,50);
 
        getContentPane().add(homePage);
        
        
        


        image=new JLabel("Home Page");

		image.setFont(new Font("Arial Narrow",Font.BOLD,35));

		image.setForeground(new Color(150,150,255));

    	image.setHorizontalAlignment(SwingConstants.CENTER);

    	image.setIcon(new ImageIcon("college.jpg"));

    	image.setBounds(250,170,770,500);
            
    	getContentPane().add(image);
    
   
       
     	aboutHc=new JButton("About HC");

     	aboutHc.setFont(new Font("Arial Narrow",Font.BOLD,22));

	 	aboutHc.setForeground(new Color(255, 0, 0));
 
     	aboutHc.setBounds(20,190,170,40);

	 	aboutHc.setMnemonic(KeyEvent.VK_A);

     	aboutHc.addActionListener(this);

     	getContentPane().add(aboutHc);
     	
     	
     	
        register=new JButton("Registration");

        register.setFont(new Font("Arial Narrow",Font.BOLD,22));

        register.setForeground(new Color(255, 0, 0));
 
        register.setBounds(20,250,170,40);
	
	    register.setMnemonic(KeyEvent.VK_O);

	    register.addActionListener(this);

	    getContentPane().add(register);
	    
	    
	    Nurse=new JButton("Nurse Details");

	    Nurse.setFont(new Font("Arial Narrow",Font.BOLD,22));

	    Nurse.setForeground(new Color(255, 0, 0));
 
	    Nurse.setBounds(20,320,170,40);
	
	    Nurse.setMnemonic(KeyEvent.VK_O);

	    Nurse.addActionListener(this);
    
	    getContentPane().add(Nurse);  
	    
	    
	    medicine=new JButton("Medicine Store");

	    medicine.setFont(new Font("Arial Narrow",Font.BOLD,22));

	    medicine.setForeground(new Color(255, 0, 0));
 
	    medicine.setBounds(20,390,170,40);

	    medicine.setMnemonic(KeyEvent.VK_S);

	    medicine.addActionListener(this);
 
	    medicine.setToolTipText("Press it to know About Drug Store at Hc ");

        getContentPane().add(medicine);
                    


     	mts=new JButton("Case Records");
 
     	mts.setFont(new Font("Arial Narrow",Font.BOLD,22));

     	mts.setForeground(new Color(255, 0, 0));
 
     	mts.setBounds(20,460,170,40);

     	mts.setMnemonic(KeyEvent.VK_C);

     	mts.addActionListener(this);
 
        getContentPane().add(mts);


       
 
	    other=new JButton("Docter Details");

        other.setFont(new Font("Arial Narrow",Font.BOLD,22));

	    other.setForeground(new Color(255, 0, 0));
 
 	    other.setBounds(20,530,170,40);

        other.setMnemonic(KeyEvent.VK_D);

        other.addActionListener(this);
 
        other.setToolTipText("Press it to know About Pshycological Councelling Center ");

        getContentPane().add(other);
        
        
        
        exit=new JButton("Exit");

        exit.setFont(new Font("Arial Narrow",Font.BOLD,22));

        exit.setForeground(new Color(255, 0, 0));
 
        exit.setBounds(20,600,170,40);

        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(this);
 
        exit.setToolTipText("Press it to Exit ");

        getContentPane().add(exit);
        
        
        
       
        setVisible(true);

        addWindowListener(new WindowAdapter()
           {

        	public void windowClosing(WindowEvent we)

	           {

        		 dispose();

	           }
           });
 }
 
       public void actionPerformed(ActionEvent ae)

          {

	      if(ae.getActionCommand().equals("Exit"))

	       {

 	        dispose();

	       }

	      else if(ae.getActionCommand().equals("About HC"))

	       {

	         About  a=new About();

	       }


	      else if(ae.getActionCommand().equals("Case Records"))

	       {

	                  CaseRecords m=new CaseRecords();

	        }

                    else if(ae.getActionCommand().equals("Registration"))

	       {
	
                    RegHome r=new RegHome();

	       }

           		 else if(ae.getActionCommand().equals("Nurse Details"))

           	       {

          
           			Nurse1 d=new Nurse1();
           			d.setVisible(true);

            	      }	

                         else if(ae.getActionCommand().equals("Medicine Store"))

	       {
	
                        	 medicine o=new medicine();

	       }	



		 else if(ae.getActionCommand().equals("Docter Details"))

	       {

              
			Doctor d=new Doctor();
			d.setVisible(true);
 	      }	
	      
		
   }      

     public static  void main(String args[])

	{

		HomePage h=new HomePage();

        }
}
