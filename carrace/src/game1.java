
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;


public class game1 extends javax.swing.JFrame implements Runnable{
int j=0;
char s;
  Thread t;int a=0;
  
    public game1() {
        initComponents();    
       bb1.setVisible(true);
       bb2.setVisible(false);
       
       // Configure bb1 for custom background color
       bb1.setOpaque(true);
       bb1.setBorderPainted(false);
       bb1.setBackground(Color.blue);
       
       // Configure bb2 for custom background color
       bb2.setOpaque(true);
       bb2.setBorderPainted(false);
       bb2.setBackground(Color.blue);
       
       l.setVisible(true);
       
       // Make labels with solid colored borders - more reliable on macOS
       b.setOpaque(true); b.setText(" "); b.setBackground(Color.red); 
       b1.setOpaque(true); b1.setText(" "); b1.setBackground(Color.white);
       b2.setOpaque(true); b2.setText(" "); b2.setBackground(Color.red);
       b3.setOpaque(true); b3.setText(" "); b3.setBackground(Color.white);
       b4.setOpaque(true); b4.setText(" "); b4.setBackground(Color.red);
       b5.setOpaque(true); b5.setText(" "); b5.setBackground(Color.white);
       b6.setOpaque(true); b6.setText(" "); b6.setBackground(Color.red);
       b7.setOpaque(true); b7.setText(" "); b7.setBackground(Color.white);
       
       t=new Thread(this);
       t.start();       
    }  
    public void run()
    {        
        while(true)
	 { 
	   j++;
	   updateColors();
	  try
	  {
	   t.sleep(200);
	 }
	 catch(InterruptedException e){
	 }
	 }
     }
    public void updateColors()
    {
         if(j==1)
		   { 
		    b.setBackground(Color.red);
		    b1.setBackground(Color.white);
			b2.setBackground(Color.red);
			b3.setBackground(Color.white);
			b4.setBackground(Color.red);
			b5.setBackground(Color.white);
		    b6.setBackground(Color.red);
			b7.setBackground(Color.white);
		   }
         
		 else if(j==2)
		   {
		        b.setBackground(Color.white);
		        b1.setBackground(Color.red);
			b2.setBackground(Color.white);
			b3.setBackground(Color.red);
			b4.setBackground(Color.white);
			b5.setBackground(Color.red);
			b6.setBackground(Color.white);
			b7.setBackground(Color.red);
                        j=0;
                   }
        // Force UI update
        getContentPane().validate();
        getContentPane().repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bb1 = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();
        l = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(bb1);
        bb1.setBounds(220, 320, 60, 40);
        getContentPane().add(bb2);
        bb2.setBounds(320, 320, 60, 40);
        getContentPane().add(l);
        l.setBounds(380, 80, 240, 30);

        b.setText("jLabel1");
        getContentPane().add(b);
        b.setBounds(390, 170, 34, 30);

        b1.setText("jLabel1");
        getContentPane().add(b1);
        b1.setBounds(110, 170, 34, 30);

        b2.setText("jLabel1");
        getContentPane().add(b2);
        b2.setBounds(150, 170, 34, 30);

        b3.setText("jLabel1");
        getContentPane().add(b3);
        b3.setBounds(190, 170, 34, 30);

        b4.setText("jLabel1");
        getContentPane().add(b4);
        b4.setBounds(230, 170, 34, 30);

        b5.setText("jLabel1");
        getContentPane().add(b5);
        b5.setBounds(270, 170, 34, 30);

        b6.setText("jLabel1");
        getContentPane().add(b6);
        b6.setBounds(310, 170, 34, 30);

        b7.setText("jLabel1");
        getContentPane().add(b7);
        b7.setBounds(350, 170, 34, 30);

        setBounds(0, 0, 898, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        l.setText(Character.toString(evt.getKeyChar()));
    }//GEN-LAST:event_formKeyTyped

   
    public static void main(String args[]) {
       
      /*  game1 g1=new game1();
         g1.setVisible(true);*/
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
           
            public void run() {
                new game1().setVisible(true);
             
        }});
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bb2;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables

    

  
 
}
