import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class CaseRecords extends JFrame implements ActionListener

	
   {

	JLabel mts,ima;
 	
	JButton sinReg,ouReg,einReg,back;

        public CaseRecords()

         {
 
	   setLayout(null);

	   setTitle(" CASE RECORD");

//     setMinimumSize(new java.awt.Dimension(1020,720));

       setBounds(0,0,1020,728);

	   mts=new JLabel(" CASE RECORDS OF IN & OUT PATIENT ");

	   mts.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   mts.setForeground(new Color(255,51,255));

       mts.setHorizontalAlignment(SwingConstants.CENTER);

       mts.setBounds(10,20,580,110);

       getContentPane().add(mts);

	
	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("Regist.jpg"));

       ima.setHorizontalAlignment(SwingConstants.CENTER);
     
       ima.setBounds(500,50,560,530);

       getContentPane().add(ima);
         
           
       sinReg=new JButton("In-patient Record");

       sinReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
  
       sinReg.setBounds(100,200,270,60);
    
       sinReg.setForeground(new Color(51,153,255));

       sinReg.setBackground(new Color(204,255,204));

	   sinReg.setMnemonic(KeyEvent.VK_S);
  
  	   sinReg.addActionListener(this);

	   sinReg.setToolTipText("Press to Register Student as the In-Paitent ");
   
   	   getContentPane().add(sinReg);

	   
          
	   ouReg=new JButton("Out-patient Record");

	   ouReg.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   ouReg.setForeground(new Color(51,153,255));

       ouReg.setBackground(new Color(236,233,216));
 
	   ouReg.setBounds(100,400,270,60);

	   ouReg.setMnemonic(KeyEvent.VK_O);
  
  	   ouReg.addActionListener(this);

	   ouReg.setToolTipText("Press to Register the Student of SvUniversity");
   
       getContentPane().add(ouReg);
       

	   back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(0,0,0));

       back.setBackground(new Color(255,153,153));	   

 	   back.setBounds(430,580,120,40);

       back.setMnemonic(KeyEvent.VK_B);

       back.addActionListener(this);

       back.setToolTipText("Press for returning to Home Page");

       getContentPane().add(back);
       
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
 
	   if(ae.getActionCommand().equals("BACK"))

       {
    
       dispose();

       }

       else if(ae.getActionCommand().equals("In-patient Record"))

	   {
       InpatientRecord i=new InpatientRecord();
		          
       }


   		   

		      else if(ae.getActionCommand().equals("Out-patient Record"))

	 	      {
	
                           OutPatientRecord u=new OutPatientRecord();

	              }
              }





   public static void main(String args[])
  
    {
  
     CaseRecords m=new CaseRecords();

    }

}



