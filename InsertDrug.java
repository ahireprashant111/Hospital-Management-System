import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;


 public class InsertDrug extends JFrame implements ActionListener

  {
  

    String Dname,exdate1,exdate2;

    
    int istock,total;
     
    
    JLabel shead,ssub,dname,instock,exda1,exda2,warn1,warn2,warn3;


    JTextField dtext,dinstock,dexda1,dexda2;

  
    JButton submit,back;


     public InsertDrug()

     {
    
        	  setLayout(null);

        	  setTitle("Medicine");

         //  setMinimumSize(new Dimension(900,700));

                   setBounds(0,0,1020,725);

	  shead=new JLabel("INSERT THE MEDICINE");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(200,20,500,60);

	  getContentPane().add(shead);


      ssub=new JLabel("_ _ _ _ _ _ _ _ _ _ _ _ _ ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

      ssub.setBounds(240,15,400,100);

	  getContentPane().add(ssub);

	
	  dname=new JLabel("MEDICINE NAME:");

	  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dname.setForeground(new Color(0,0,0));

	  dname.setHorizontalAlignment(SwingConstants.CENTER);

      dname.setBounds(70,130,180,40);

	  getContentPane().add(dname);
	

      instock=new JLabel("IN-STOCK:");

	  instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  instock.setForeground(new Color(0,0,0));

	  instock.setHorizontalAlignment(SwingConstants.TRAILING);

      instock.setBounds(80,214,140,40);

	  getContentPane().add(instock);


	  warn1=new JLabel("(Enter only Integers)");

	  warn1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	  warn1.setForeground(new Color(0,0,0));

	  warn1.setHorizontalAlignment(SwingConstants.TRAILING);

      warn1.setBounds(720,214,170,40);

	  getContentPane().add(warn1);
 
 

      exda1=new JLabel("EX-DATE1:");

	  exda1.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda1.setForeground(new Color(0,0,0));

	  exda1.setHorizontalAlignment(SwingConstants.TRAILING);

      exda1.setBounds(90,300,130,40);

	  getContentPane().add(exda1);

          
	  warn2=new JLabel("(MM/YYYY)");

	  warn2.setFont(new Font("Arial Narrow",Font.BOLD,20));

	  warn2.setForeground(new Color(0,0,0));

	  warn2.setHorizontalAlignment(SwingConstants.TRAILING);

      warn2.setBounds(615,300,200,40);

	  getContentPane().add(warn2);





  


      dtext=new JTextField(30);

	  dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dtext.setBounds(250,130,430,40);

      getContentPane().add(dtext);

		
      dinstock=new JTextField(30);

	  dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dinstock.setBounds(250,215,430,40);

      getContentPane().add(dinstock);


      dexda1=new JTextField(30);
	
	  dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dexda1.setBounds(250,300,430,40);

      getContentPane().add(dexda1);


	 
	  
	 

	   
       submit=new JButton("SUBMIT");

       submit.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       submit.setBounds(200,480,230,50);

	   submit.setForeground(new Color(0,0,255));

	   submit.setBackground(new Color(0,255,255));
 
       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the detials");
   
       getContentPane().add(submit); 


       back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       back.setBounds(470,480,220,50);

	   back.setForeground(new Color(0,0,255));

	   back.setBackground(new Color(255,204,204));

       back.setMnemonic(KeyEvent.VK_B);
  
       back.addActionListener(this);

       back.setToolTipText("PRESS TO DISPOSE");
   
       getContentPane().add(back); 

	   setVisible(true);

       addWindowListener(new WindowAdapter() {

                public void windowCloseing(WindowEvent we)

                                          {

                                                  dispose();

                                          }
         });

   }

 
      public void actionPerformed(ActionEvent ae)
   

        {

             if(ae.getActionCommand().equals("BACK"))

                {
 
                        dispose();

		}

		else if(ae.getActionCommand().equals("SUBMIT"))

		   {

                    try
		
			             {

                    	    Class.forName("com.mysql.cj.jdbc.Driver");  
                    	    
			                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");

							Dname=dtext.getText();

							istock=Integer.parseInt(dinstock.getText());

							exdate1=dexda1.getText();

							
				
							total=istock;

               				PreparedStatement pstm=con.prepareStatement("insert into drugs(DrugName,istock,Exdate1,Total)values(?,?,?,?)");
			                      
               				pstm.setString(1,Dname);
                               
                        
							pstm.setInt(2,istock);


	// JOptionPane.showMessageDialog(null,"Enter only Integer VAlues","Enter only Int VAlues",JOptionPane.ERROR_MESSAGE,null);

        
                                
						    pstm.setString(3,exdate1);

							

							pstm.setInt(4,total);                              
                         
						    pstm.executeUpdate();
						    
						    JOptionPane.showMessageDialog(null, "Data Inserted Successful");

							pstm.close();

							con.close();

               }

               catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


      }

   public static void main(String args[])

    {
    
	   InsertDrug id=new InsertDrug();

    }

}





   