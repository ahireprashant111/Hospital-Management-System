import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

import java.io.*;


 public class UpdateDrug extends JFrame implements ActionListener

  {
  

    String Dname,exdate,stock;

    
    int istock1,ostock1,total1,rem;
     
    
    JLabel shead,dash,dname,ssub,dname1,instock,outstock,remain,exda1,exda2,exda3,exda4;


    JTextField dtext,dtext1,dinstock,dexda1,dostock,dremain,dexda2,dexda3,dexda4;

  
    JButton submit,back,getDetails;


     public UpdateDrug()

     {
    
          setLayout(null);

          setTitle("Drugs");

          //setMinimumSize(new Dimension(1000,700));

	 setBounds(0,0,1020,725);

	  shead=new JLabel("UPDATING DRUGS ");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(250,20,360,60);

	  getContentPane().add(shead);



	   
	   dash=new JLabel("_______________________________________________________ ");

	   dash.setFont(new Font("Arial Narrow",Font.BOLD,40));

	   dash.setForeground(new Color(255,102,102));

	   dash.setHorizontalAlignment(SwingConstants.LEADING);

	   dash.setBounds(5,200,1020,80);

	    getContentPane().add(dash);


	
	    dname=new JLabel("DRUG NAME:");

	    dname.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    dname.setForeground(new Color(0,0,0));

	    dname.setHorizontalAlignment(SwingConstants.CENTER);

        dname.setBounds(20,80,180,40);

	    getContentPane().add(dname);


        exda1=new JLabel("EXPR DATE:");

	     exda1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda1.setForeground(new Color(0,0,0));

	     exda1.setHorizontalAlignment(SwingConstants.CENTER);

        exda1.setBounds(20,180,180,40);

	     getContentPane().add(exda1);
	     
	     
	       ssub=new JLabel(" STOCK:");

	       ssub.setFont(new Font("Arial Narrow",Font.BOLD,20));

	       ssub.setForeground(new Color(0,0,0));

	       ssub.setHorizontalAlignment(SwingConstants.CENTER);

	       ssub.setBounds(20,130,180,40);

		     getContentPane().add(ssub);
	
		     
		 dname1=new JLabel(" NEW DRUG NAME:");

	     dname1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     dname1.setForeground(new Color(0,0,0));

		 dname1.setHorizontalAlignment(SwingConstants.CENTER);

		 dname1.setBounds(20,300,160,40);

	      getContentPane().add(dname1);


        instock=new JLabel("NEW-STOCK:");

	    instock.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    instock.setForeground(new Color(0,0,0));

	    instock.setHorizontalAlignment(SwingConstants.TRAILING);

        instock.setBounds(10,352,140,40);

	    getContentPane().add(instock);

     





	  


		 exda3=new JLabel("NEW EXPR DATE:");

	     exda3.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exda3.setForeground(new Color(0,0,0));

	     exda3.setHorizontalAlignment(SwingConstants.CENTER);

         exda3.setBounds(20,420,170,40);

	     getContentPane().add(exda3);
        

	     

          dtext=new JTextField(30);

	     dtext.setFont(new Font("Times New Roman",Font.BOLD,18));

         dtext.setBounds(180,85,300,30);

         getContentPane().add(dtext); 

         
		  dtext1=new JTextField(30);

	     dtext1.setFont(new Font("Times New Roman",Font.BOLD,18));

         dtext1.setBounds(180,300,300,30);

         getContentPane().add(dtext1); 


		
         dinstock=new JTextField(30);

	     dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dinstock.setBounds(180,355,300,30);

         getContentPane().add(dinstock);


         dexda1=new JTextField(30);

	     dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda1.setBounds(180,185,300,30);

         getContentPane().add(dexda1);
	

	
		 dexda3=new JTextField(30);

		 dexda3.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda3.setBounds(180,420,300,30);

         getContentPane().add(dexda3);
	


	      dremain=new JTextField(30);

	      dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

          dremain.setBounds(180,140,300,30);

          getContentPane().add(dremain);

                                           

				

		   getDetails=new JButton("Get Details");

		   getDetails.setFont(new Font("Arial Narrow",Font.BOLD,20));

		   getDetails.setForeground(new Color(0,0,255));

		   getDetails.setBounds(570,85,200,30);

		   getDetails.setMnemonic(KeyEvent.VK_D);

		   getDetails.addActionListener(this);

		   getDetails.setToolTipText("Press to Get the Detials");

		   getContentPane().add(getDetails);


          submit=new JButton("SUBMIT");

          submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          submit.setBounds(300,510,160,40);

	      submit.setForeground(new Color(0,0,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the detials");
   
          getContentPane().add(submit); 


          back=new JButton("BACK");

          back.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          back.setBounds(480,510,160,40);

	      back.setForeground(new Color(0,0,255));

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

      else if(ae.getActionCommand().equals("Get Details"))

				 {        

						try
		
							{
							Class.forName("com.mysql.cj.jdbc.Driver");  
                    	    
			                Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");
                                                            
                                                      

			                                           
								Dname=dtext.getText();

								PreparedStatement pstmt=ms.prepareStatement("Select Exdate1 from drugs where DrugName= ?");
                                                   
                                pstmt.setString(1,Dname);


								ResultSet rs=pstmt.executeQuery();


                                 if(rs.next())

								         {
                                                                    
                                           

                                            dexda1.setText(rs.getString(1));   
                                            dremain.setText(rs.getString(1));
				                         
                                          }      				

         				       
	                                         pstmt.close();
                                                                   
                                                ms.close();

                          }                     catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


       else if(ae.getActionCommand().equals("SUBMIT"))

	             {                      
 
                               		    Dname=dtext.getText();
                               			  
                               			stock=dinstock.getText();
			
                               			exdate=dostock.getText();
			    
                                         
                           
				 try
		         {	
					 
				 Class.forName("com.mysql.cj.jdbc.Driver");  
		                    	    
				 Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/siom","root","");
			
			     PreparedStatement pstmt=ms.prepareStatement("Update drugs set DrugName=?, stock=?, exdate=? where DrugName= ?");
                                                   
                 pstmt.setString(5,Dname);

                 pstmt.setInt(1,istock1);

				 pstmt.setInt(2,ostock1);
                             
			     pstmt.setInt(4,total1);
            
			     pstmt.executeUpdate();
			     
			     JOptionPane.showMessageDialog(null, "Data Inserted Successful");

                 ms.commit();  

			     pstmt.close();

                 ms.close();

                      }

                  catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


      }

   public static void main(String args[])

    {
    
	   UpdateDrug id=new UpdateDrug();

    }

}





   