import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public class About extends JFrame

      {
 
         JLabel  stop,sdown,label;
                      
         public About()
          
         {   
	     setLayout(null);

         setBounds(0,0,1020,735);

         setTitle("About");

      Container contentpane=getContentPane();
        
	  stop=new JLabel("Smt. Kashibai Navel General Hospital");

	  stop.setFont(new Font("Arial Narrow",Font.BOLD,36));

	  stop.setForeground(new Color(200,51,255));

	  stop.setHorizontalAlignment(SwingConstants.CENTER);

      stop.setBounds(60,50,650,30);

	  getContentPane().add(stop);

          
  	  sdown=new JLabel("-------------------------------------------------------------------------------------------------------");

	  sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  sdown.setForeground(new Color(0,0,153));

	  sdown.setHorizontalAlignment(SwingConstants.LEADING);

	  sdown.setBounds(130,70,650,20);

	  getContentPane().add(sdown);

                     
      label=new JLabel("");

	  label.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  label.setForeground(new Color(0,0,153));

	  label.setIcon(new ImageIcon("mlogo.png"));

	  label.setHorizontalAlignment(SwingConstants.LEADING);

	  label.setBounds(760,5,200,110);

	  getContentPane().add(label);
                            
 
                                JTabbedPane jtp=new JTabbedPane();
 
                                jtp.addTab("Project Aim",new HomePanel());

                                jtp.addTab("Services",new SpecialPanel());

                                jtp.addTab("Contact Us",new FacilitesPanel());                           

                                jtp.setBounds(10,110,1000,550);

                                getContentPane().add(jtp);
                                     
                                setVisible(true);

                                addWindowListener(new WindowAdapter(){
                        
                                public void windowClosing(WindowEvent we)
    
                                 {

					            dispose();

             				     }
 
			                 	});

      }

          public static void main(String  args[])
              
                  {

        	  About s=new About();

                 }

}              

             class HomePanel extends JPanel
   
             {

                       JLabel mts;

                     public HomePanel()

                              {
										  mts=new JLabel("");

	                                      mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                          mts.setForeground(new Color(0,0,255));
			
 										  mts.setIcon(new ImageIcon("IProject.jpg"));

                                          mts.setHorizontalAlignment(SwingConstants.LEADING);

                                          mts.setBounds(10,10,590,30);
                
                                          add(mts);
          
 
                               }
              }

            									
                class SpecialPanel extends JPanel

                {
		  JLabel mts;


                                 public SpecialPanel()

                                       {

                   
										 mts=new JLabel("");

	                                     mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                         mts.setForeground(new Color(0,0,255));
			
 										 mts.setIcon(new ImageIcon("Services.png"));

                                         mts.setHorizontalAlignment(SwingConstants.LEADING);

                                         mts.setBounds(10,10,700,30);
                
                                         add(mts);
                                   
 
                                       }

                }

            class FacilitesPanel extends JPanel

              {
            
                                          JLabel  mts,mts1,mts2,mts3,uss, ust,uts1,uts2,xray,dw,cd,imm,ann,fas;

                                                      public  FacilitesPanel()
                                                        
					                                  {
						                                  mts=new JLabel("");

							                              mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                                          mts.setForeground(new Color(0,0,255));
			
 														  mts.setIcon(new ImageIcon("contactus.png"));

                                                          mts.setHorizontalAlignment(SwingConstants.LEADING);

														  mts.setBounds(10,10,590,30);
                
                                                          add(mts);


														 mts1=new JLabel("");

														 mts1.setFont(new Font("Arial Narrow",Font.BOLD,18));

                                                      mts1.setForeground(new Color(0,0,255));

                                                     mts1.setHorizontalAlignment(SwingConstants.CENTER);

                                                     mts1.setBounds(0,0,0,0);

                                                     add(mts1); 
                                                       setVisible(true);

                                                          }
             }
 
         