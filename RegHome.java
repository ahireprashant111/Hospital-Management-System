import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;

public class RegHome extends JFrame implements ActionListener

{


   	 JLabel head,shead,label;

	JButton insert,view,reset;

                 public RegHome()
            
                  {   
                    setLayout(null);

                   setTitle("Registration of Patient");

           //      setMinimumSize(new Dimension(1030,730));

                   setBounds(0,0,1020,725);

	  head=new JLabel("Smt. Kashibai Navle Medical College and General Hospital");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,36));

	  head.setForeground(new Color(255,51,255));

	  head.setHorizontalAlignment(SwingConstants.CENTER);

                    head.setBounds(20,24,1000,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("Registration Record");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

                    shead.setBounds(210,100,510,50);

	  getContentPane().add(shead);


      label=new JLabel("Registration Record");

	  label.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  label.setForeground(new Color(51,51,255));

	  label.setIcon(new ImageIcon("PatientReg.jpg"));
        
	  label.setHorizontalAlignment(SwingConstants.CENTER);
     label.setBounds(480,250,450,400);

	  getContentPane().add(  label);
               

              insert=new JButton("INSERT");

         	  insert.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
        	  insert.setBounds(80,230,300,80);

//	  but1.setForeground(new Color(51,153,255));

	  insert.setMnemonic(KeyEvent.VK_S);
  
      insert.addActionListener(this);

      insert.setToolTipText("Press to enter new detials");
   
      getContentPane().add(insert); 

	   
              view=new JButton("VIEW");

         	  view.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
        	  view.setBounds(80,400,310,80);

//	  but1.setForeground(new Color(51,153,255));

	  view.setMnemonic(KeyEvent.VK_E);
  
                    view.addActionListener(this);

                     view.setToolTipText("Press to enter new detials");
   
                     getContentPane().add(view); 

                    
                   reset=new JButton("Back");

                   reset.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
                   reset.setBounds(83,570,310,80);


                   reset.setMnemonic(KeyEvent.VK_T);
  
                    reset.addActionListener(this);

                    reset.setToolTipText("Press to Register Student as the In-Paitent ");
   
                    getContentPane().add(reset); 

                     setVisible(true);

                      addWindowListener(new WindowAdapter() {
                 
                                        public void windowClosing(WindowEvent we)
 
                                               {

				dispose();

                                                 }

		  });

                    }
   
                              public void actionPerformed(ActionEvent ae)
 
		       {
   
		           if(ae.getActionCommand().equals("Back"))

		              {
                     
                     		  dispose();

		              }

			   else if(ae.getActionCommand().equals("INSERT"))

                			   {
	                      
                                                                RegNew i=new RegNew();

                                                          }

 			  else if(ae.getActionCommand().equals("VIEW"))
                        
                                                            {

                                                                        RegView r=new RegView();

                                                               }
                                          } 

                                   public static void main(String args[])
                   
                                        {

                                            RegHome r=new RegHome();

                                        }

}   
