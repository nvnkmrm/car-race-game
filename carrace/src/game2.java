
import java.awt.Color;
import java.util.Random;

public class game2 extends javax.swing.JFrame implements Runnable{
    Thread t,t1;
    int k=0,k1=1;
    int i=0,ww=0,uu=0,lb=1,rb=0,ex=0,ran;
    int j=0;
    int a;
    char s1;
   int sl;
   int s=0,inc=10;
   int frd=0;
   int key;
    Random r=new Random();
    public game2() {
        initComponents();
      sl=150;
      bg.setVisible(false);
      
        // Make all x labels opaque so colors are visible
        x.setOpaque(true); x.setBackground(Color.red); x.setText("");
        x1.setOpaque(true); x1.setBackground(Color.darkGray); x1.setText("");
        x2.setOpaque(true); x2.setBackground(Color.darkGray); x2.setText("");
        x3.setOpaque(true); x3.setBackground(Color.red); x3.setText("");
        x4.setOpaque(true); x4.setBackground(Color.red); x4.setText("");
        x5.setOpaque(true); x5.setBackground(Color.red); x5.setText("");
        x6.setOpaque(true); x6.setBackground(Color.darkGray); x6.setText("");
        x7.setOpaque(true); x7.setBackground(Color.darkGray); x7.setText("");
        x8.setOpaque(true); x8.setBackground(Color.red); x8.setText("");
        x9.setOpaque(true); x9.setBackground(Color.darkGray); x9.setText("");
        x10.setOpaque(true); x10.setBackground(Color.darkGray); x10.setText("");
        x11.setOpaque(true); x11.setBackground(Color.red); x11.setText("");
        x12.setOpaque(true); x12.setBackground(Color.red); x12.setText("");
        x13.setOpaque(true); x13.setBackground(Color.red); x13.setText("");
        x14.setOpaque(true); x14.setBackground(Color.darkGray); x14.setText("");
        x15.setOpaque(true); x15.setBackground(Color.darkGray); x15.setText("");
        x8.setVisible(false);
         x9.setVisible(false);
          x10.setVisible(false);
           x11.setVisible(false);
            x12.setVisible(false);
             x13.setVisible(false);
              x14.setVisible(false);
               x15.setVisible(false);
          q1.setVisible(false);w1.setVisible(false);e1.setVisible(false);
          q2.setVisible(false);w2.setVisible(false);e2.setVisible(false);
          q3.setVisible(false);w3.setVisible(false);e3.setVisible(false);
          q4.setVisible(false);w4.setVisible(false);e4.setVisible(false);
          q5.setVisible(false);w5.setVisible(false);e5.setVisible(false);
          q6.setVisible(false);w6.setVisible(false);e6.setVisible(false);
          q7.setVisible(false);w7.setVisible(false);e7.setVisible(false);
          q8.setVisible(false);w8.setVisible(false);e8.setVisible(false);
          q9.setVisible(false);w9.setVisible(false);e9.setVisible(false);
          q10.setVisible(false);w10.setVisible(false);e10.setVisible(false);
          q11.setVisible(false);w11.setVisible(false);e11.setVisible(false);
          q12.setVisible(false);w12.setVisible(false);e12.setVisible(false);
          q13.setVisible(false);w13.setVisible(false);e13.setVisible(false);
          q14.setVisible(false);w14.setVisible(false);e14.setVisible(false);
          q15.setVisible(false);w15.setVisible(false);e15.setVisible(false);
          q16.setVisible(false);w16.setVisible(false);e16.setVisible(false);
          q17.setVisible(false);w17.setVisible(false);e17.setVisible(false);
          q18.setVisible(false);w18.setVisible(false);e18.setVisible(false);
          q19.setVisible(false);w19.setVisible(false);e19.setVisible(false);
          q20.setVisible(false);w20.setVisible(false);e20.setVisible(false);
          q21.setVisible(false);w21.setVisible(false);e21.setVisible(false);
          q22.setVisible(false);w22.setVisible(false);e22.setVisible(false);
          q23.setVisible(false);w23.setVisible(false);e23.setVisible(false);
          y1.setVisible(false); u1.setVisible(false);p1.setVisible(false);
          y2.setVisible(false); u2.setVisible(false);p2.setVisible(false);
          y3.setVisible(false);u3.setVisible(false);p3.setVisible(false);
          y4.setVisible(false);u4.setVisible(false);p4.setVisible(false);
          y5.setVisible(false);u5.setVisible(false);p5.setVisible(false);
          y6.setVisible(false);u6.setVisible(false);p6.setVisible(false);
          y7.setVisible(false);u7.setVisible(false);p7.setVisible(false);
          y8.setVisible(false);u8.setVisible(false);p8.setVisible(false);
          y9.setVisible(false);u9.setVisible(false);p9.setVisible(false);
          y10.setVisible(false);u10.setVisible(false);p10.setVisible(false);
          y11.setVisible(false);u11.setVisible(false);p11.setVisible(false);
          y12.setVisible(false);u12.setVisible(false);p12.setVisible(false);
          y13.setVisible(false);u13.setVisible(false);p13.setVisible(false);
          y14.setVisible(false);u14.setVisible(false);p14.setVisible(false);
          y15.setVisible(false);u15.setVisible(false);p15.setVisible(false);
          y16.setVisible(false);u16.setVisible(false);p16.setVisible(false);
          y17.setVisible(false);u17.setVisible(false);p17.setVisible(false);
          y18.setVisible(false);u18.setVisible(false);p18.setVisible(false);
          y19.setVisible(false);u19.setVisible(false);p19.setVisible(false);
          y20.setVisible(false);u20.setVisible(false);p20.setVisible(false);
          y21.setVisible(false);u21.setVisible(false);p21.setVisible(false);
          y22.setVisible(false);u22.setVisible(false);p22.setVisible(false);
          y23.setVisible(false);u23.setVisible(false);p23.setVisible(false);
          
          // Make all q, w, e labels opaque
          q1.setOpaque(true); w1.setOpaque(true); e1.setOpaque(true); q1.setText(""); w1.setText(""); e1.setText("");
          q2.setOpaque(true); w2.setOpaque(true); e2.setOpaque(true); q2.setText(""); w2.setText(""); e2.setText("");
          q3.setOpaque(true); w3.setOpaque(true); e3.setOpaque(true); q3.setText(""); w3.setText(""); e3.setText("");
          q4.setOpaque(true); w4.setOpaque(true); e4.setOpaque(true); q4.setText(""); w4.setText(""); e4.setText("");
          q5.setOpaque(true); w5.setOpaque(true); e5.setOpaque(true); q5.setText(""); w5.setText(""); e5.setText("");
          q6.setOpaque(true); w6.setOpaque(true); e6.setOpaque(true); q6.setText(""); w6.setText(""); e6.setText("");
          q7.setOpaque(true); w7.setOpaque(true); e7.setOpaque(true); q7.setText(""); w7.setText(""); e7.setText("");
          q8.setOpaque(true); w8.setOpaque(true); e8.setOpaque(true); q8.setText(""); w8.setText(""); e8.setText("");
          q9.setOpaque(true); w9.setOpaque(true); e9.setOpaque(true); q9.setText(""); w9.setText(""); e9.setText("");
          q10.setOpaque(true); w10.setOpaque(true); e10.setOpaque(true); q10.setText(""); w10.setText(""); e10.setText("");
          q11.setOpaque(true); w11.setOpaque(true); e11.setOpaque(true); q11.setText(""); w11.setText(""); e11.setText("");
          q12.setOpaque(true); w12.setOpaque(true); e12.setOpaque(true); q12.setText(""); w12.setText(""); e12.setText("");
          q13.setOpaque(true); w13.setOpaque(true); e13.setOpaque(true); q13.setText(""); w13.setText(""); e13.setText("");
          q14.setOpaque(true); w14.setOpaque(true); e14.setOpaque(true); q14.setText(""); w14.setText(""); e14.setText("");
          q15.setOpaque(true); w15.setOpaque(true); e15.setOpaque(true); q15.setText(""); w15.setText(""); e15.setText("");
          q16.setOpaque(true); w16.setOpaque(true); e16.setOpaque(true); q16.setText(""); w16.setText(""); e16.setText("");
          q17.setOpaque(true); w17.setOpaque(true); e17.setOpaque(true); q17.setText(""); w17.setText(""); e17.setText("");
          q18.setOpaque(true); w18.setOpaque(true); e18.setOpaque(true); q18.setText(""); w18.setText(""); e18.setText("");
          q19.setOpaque(true); w19.setOpaque(true); e19.setOpaque(true); q19.setText(""); w19.setText(""); e19.setText("");
          q20.setOpaque(true); w20.setOpaque(true); e20.setOpaque(true); q20.setText(""); w20.setText(""); e20.setText("");
          q21.setOpaque(true); w21.setOpaque(true); e21.setOpaque(true); q21.setText(""); w21.setText(""); e21.setText("");
          q22.setOpaque(true); w22.setOpaque(true); e22.setOpaque(true); q22.setText(""); w22.setText(""); e22.setText("");
          q23.setOpaque(true); w23.setOpaque(true); e23.setOpaque(true); q23.setText(""); w23.setText(""); e23.setText("");
          
          // Make all y, u, p labels opaque
          y1.setOpaque(true); u1.setOpaque(true); p1.setOpaque(true); y1.setText(""); u1.setText(""); p1.setText("");
          y2.setOpaque(true); u2.setOpaque(true); p2.setOpaque(true); y2.setText(""); u2.setText(""); p2.setText("");
          y3.setOpaque(true); u3.setOpaque(true); p3.setOpaque(true); y3.setText(""); u3.setText(""); p3.setText("");
          y4.setOpaque(true); u4.setOpaque(true); p4.setOpaque(true); y4.setText(""); u4.setText(""); p4.setText("");
          y5.setOpaque(true); u5.setOpaque(true); p5.setOpaque(true); y5.setText(""); u5.setText(""); p5.setText("");
          y6.setOpaque(true); u6.setOpaque(true); p6.setOpaque(true); y6.setText(""); u6.setText(""); p6.setText("");
          y7.setOpaque(true); u7.setOpaque(true); p7.setOpaque(true); y7.setText(""); u7.setText(""); p7.setText("");
          y8.setOpaque(true); u8.setOpaque(true); p8.setOpaque(true); y8.setText(""); u8.setText(""); p8.setText("");
          y9.setOpaque(true); u9.setOpaque(true); p9.setOpaque(true); y9.setText(""); u9.setText(""); p9.setText("");
          y10.setOpaque(true); u10.setOpaque(true); p10.setOpaque(true); y10.setText(""); u10.setText(""); p10.setText("");
          y11.setOpaque(true); u11.setOpaque(true); p11.setOpaque(true); y11.setText(""); u11.setText(""); p11.setText("");
          y12.setOpaque(true); u12.setOpaque(true); p12.setOpaque(true); y12.setText(""); u12.setText(""); p12.setText("");
          y13.setOpaque(true); u13.setOpaque(true); p13.setOpaque(true); y13.setText(""); u13.setText(""); p13.setText("");
          y14.setOpaque(true); u14.setOpaque(true); p14.setOpaque(true); y14.setText(""); u14.setText(""); p14.setText("");
          y15.setOpaque(true); u15.setOpaque(true); p15.setOpaque(true); y15.setText(""); u15.setText(""); p15.setText("");
          y16.setOpaque(true); u16.setOpaque(true); p16.setOpaque(true); y16.setText(""); u16.setText(""); p16.setText("");
          y17.setOpaque(true); u17.setOpaque(true); p17.setOpaque(true); y17.setText(""); u17.setText(""); p17.setText("");
          y18.setOpaque(true); u18.setOpaque(true); p18.setOpaque(true); y18.setText(""); u18.setText(""); p18.setText("");
          y19.setOpaque(true); u19.setOpaque(true); p19.setOpaque(true); y19.setText(""); u19.setText(""); p19.setText("");
          y20.setOpaque(true); u20.setOpaque(true); p20.setOpaque(true); y20.setText(""); u20.setText(""); p20.setText("");
          y21.setOpaque(true); u21.setOpaque(true); p21.setOpaque(true); y21.setText(""); u21.setText(""); p21.setText("");
          y22.setOpaque(true); u22.setOpaque(true); p22.setOpaque(true); y22.setText(""); u22.setText(""); p22.setText("");
          y23.setOpaque(true); u23.setOpaque(true); p23.setOpaque(true); y23.setText(""); u23.setText(""); p23.setText("");
          
          q1.setBackground(Color.black);w1.setBackground(Color.blue);e1.setBackground(Color.black);
          q2.setBackground(Color.black);w2.setBackground(Color.blue);e2.setBackground(Color.black);
          q3.setBackground(Color.black);w3.setBackground(Color.blue);e3.setBackground(Color.black);
          q4.setBackground(Color.black);w4.setBackground(Color.blue);e4.setBackground(Color.black);
          q5.setBackground(Color.black);w5.setBackground(Color.blue);e5.setBackground(Color.black);
          q6.setBackground(Color.black);w6.setBackground(Color.blue);e6.setBackground(Color.black);
          q7.setBackground(Color.black);w7.setBackground(Color.blue);e7.setBackground(Color.black);
          q8.setBackground(Color.black);w8.setBackground(Color.blue);e8.setBackground(Color.black);
          q9.setBackground(Color.black);w9.setBackground(Color.blue);e9.setBackground(Color.black);
          q10.setBackground(Color.black);w10.setBackground(Color.blue);e10.setBackground(Color.black);
          q11.setBackground(Color.black);w11.setBackground(Color.blue);e11.setBackground(Color.black);
          q12.setBackground(Color.black);w12.setBackground(Color.blue);e12.setBackground(Color.black);
          q13.setBackground(Color.black);w13.setBackground(Color.blue);e13.setBackground(Color.black);
          q14.setBackground(Color.black);w14.setBackground(Color.blue);e14.setBackground(Color.black);
          q15.setBackground(Color.black);w15.setBackground(Color.blue);e15.setBackground(Color.black);
          q16.setBackground(Color.black);w16.setBackground(Color.blue);e16.setBackground(Color.black);
          q17.setBackground(Color.black);w17.setBackground(Color.blue);e17.setBackground(Color.black);
          q18.setBackground(Color.black);w18.setBackground(Color.blue);e18.setBackground(Color.black);
          q19.setBackground(Color.black);w19.setBackground(Color.blue);e19.setBackground(Color.black);
          q20.setBackground(Color.black);w20.setBackground(Color.blue);e20.setBackground(Color.black);
          q21.setBackground(Color.black);w21.setBackground(Color.blue);e21.setBackground(Color.black);
          q22.setBackground(Color.black);w22.setBackground(Color.blue);e22.setBackground(Color.black);
          q23.setBackground(Color.black);w23.setBackground(Color.blue);e23.setBackground(Color.black);
          y1.setBackground(Color.black);u1.setBackground(Color.blue);p1.setBackground(Color.black); 
          y2.setBackground(Color.black);u2.setBackground(Color.blue);p2.setBackground(Color.black);       
          y3.setBackground(Color.black);u3.setBackground(Color.blue);p3.setBackground(Color.black); 
          y4.setBackground(Color.black);u4.setBackground(Color.blue);    p4.setBackground(Color.black); 
          y5.setBackground(Color.black);u5.setBackground(Color.blue); p5.setBackground(Color.black);    
          y6.setBackground(Color.black);u6.setBackground(Color.blue);    p6.setBackground(Color.black); 
          y7.setBackground(Color.black);   u7.setBackground(Color.blue); p7.setBackground(Color.black); 
          y8.setBackground(Color.black);   u8.setBackground(Color.blue); p8.setBackground(Color.black); 
          y9.setBackground(Color.black);   u9.setBackground(Color.blue); p9.setBackground(Color.black); 
          y10.setBackground(Color.black);   u10.setBackground(Color.blue); p10.setBackground(Color.black); 
          y11.setBackground(Color.black);   u11.setBackground(Color.blue); p11.setBackground(Color.black); 
          y12.setBackground(Color.black);   u12.setBackground(Color.blue); p12.setBackground(Color.black); 
          y13.setBackground(Color.black);   u13.setBackground(Color.blue); p13.setBackground(Color.black); 
          y14.setBackground(Color.black);   u14.setBackground(Color.blue); p15.setBackground(Color.black); 
          y15.setBackground(Color.black);   u15.setBackground(Color.blue); p16.setBackground(Color.black); 
          y16.setBackground(Color.black);   u16.setBackground(Color.blue); p17.setBackground(Color.black); 
          y17.setBackground(Color.black);   u17.setBackground(Color.blue); p18.setBackground(Color.black);  
          y18.setBackground(Color.black);   u18.setBackground(Color.blue); p19.setBackground(Color.black); 
          y19.setBackground(Color.black);   u19.setBackground(Color.blue); p20.setBackground(Color.black); 
          y20.setBackground(Color.black);   u20.setBackground(Color.blue); p21.setBackground(Color.black); 
          y21.setBackground(Color.black);   u21.setBackground(Color.blue); p22.setBackground(Color.black); 
          y22.setBackground(Color.black);   u22.setBackground(Color.blue); p23.setBackground(Color.black); 
          y23.setBackground(Color.black);   u23.setBackground(Color.blue); p14.setBackground(Color.black); 
          
    // Make all b buttons opaque and remove border for proper color display
    b.setOpaque(true); b.setBorderPainted(false);
    b1.setOpaque(true); b1.setBorderPainted(false);
    b2.setOpaque(true); b2.setBorderPainted(false);
    b3.setOpaque(true); b3.setBorderPainted(false);
    b4.setOpaque(true); b4.setBorderPainted(false);
    b5.setOpaque(true); b5.setBorderPainted(false);
    b6.setOpaque(true); b6.setBorderPainted(false);
    b7.setOpaque(true); b7.setBorderPainted(false);
    b8.setOpaque(true); b8.setBorderPainted(false);
    b9.setOpaque(true); b9.setBorderPainted(false);
    b10.setOpaque(true); b10.setBorderPainted(false);
    b11.setOpaque(true); b11.setBorderPainted(false);
    b12.setOpaque(true); b12.setBorderPainted(false);
    b13.setOpaque(true); b13.setBorderPainted(false);
    b14.setOpaque(true); b14.setBorderPainted(false);
    b15.setOpaque(true); b15.setBorderPainted(false);
    b16.setOpaque(true); b16.setBorderPainted(false);
    b17.setOpaque(true); b17.setBorderPainted(false);
    b18.setOpaque(true); b18.setBorderPainted(false);
    b19.setOpaque(true); b19.setBorderPainted(false);
    b20.setOpaque(true); b20.setBorderPainted(false);
    b21.setOpaque(true); b21.setBorderPainted(false);
    b22.setOpaque(true); b22.setBorderPainted(false);
    b23.setOpaque(true); b23.setBorderPainted(false);
    b24.setOpaque(true); b24.setBorderPainted(false);
    b25.setOpaque(true); b25.setBorderPainted(false);
    b26.setOpaque(true); b26.setBorderPainted(false);
    b27.setOpaque(true); b27.setBorderPainted(false);
    b28.setOpaque(true); b28.setBorderPainted(false);
    b29.setOpaque(true); b29.setBorderPainted(false);
    b30.setOpaque(true); b30.setBorderPainted(false);
    b31.setOpaque(true); b31.setBorderPainted(false);
    b32.setOpaque(true); b32.setBorderPainted(false);
    b33.setOpaque(true); b33.setBorderPainted(false);
    b34.setOpaque(true); b34.setBorderPainted(false);
    b35.setOpaque(true); b35.setBorderPainted(false);
    b36.setOpaque(true); b36.setBorderPainted(false);
    b37.setOpaque(true); b37.setBorderPainted(false);
    b38.setOpaque(true); b38.setBorderPainted(false);
    b39.setOpaque(true); b39.setBorderPainted(false);
    b40.setOpaque(true); b40.setBorderPainted(false);
    b41.setOpaque(true); b41.setBorderPainted(false);
    b42.setOpaque(true); b42.setBorderPainted(false);
    b43.setOpaque(true); b43.setBorderPainted(false);
    b44.setOpaque(true); b44.setBorderPainted(false);
    b45.setOpaque(true); b45.setBorderPainted(false);
    b46.setOpaque(true); b46.setBorderPainted(false);
    b47.setOpaque(true); b47.setBorderPainted(false);
          
    //    t1=new Thread(this);
          t=new Thread(this);
        t.start();
        
    }
    public void run()
    {   
          if(k==1){
            while(k1<=3){
                if(k1==1){
                    l.setText("3");
                    k1++;
                }if(k1==2){
                     l.setText("2");
                    k1++;
                }if(k1==3){
                    l.setText("Wait for a Second");
                    k1++;
                }
           try
	  {
	   t1.sleep(1000);
  	   }
	 catch(InterruptedException e){
	 }
         }
         k=0;
         k1=1;
        }      
          while(true)
        {    
            if(sl==150)
            {
                s=s+10;
                l1.setText(Integer.toString(s));
            }
               if(sl==400)
            {
                s=s-5;
                l1.setText(Integer.toString(s));
            }
             if(sl==100)
            {
                s=s+20;
                l1.setText(Integer.toString(s));
            }
              if(sl==50)
            {
                s=s+40;
                l1.setText(Integer.toString(s));
            }
                if(sl==40)
            {
                s=s+100;
                l1.setText(Integer.toString(s));
            }
             if(s>1000){
                 bg.setVisible(true);
             }
            
            l.setVisible(false);
             if(j==73){
             ran=r.nextInt(3);
             j=0;
             }
             i++;
             j++;
             call();
	   updateColors();                      
	  try
	  {
	   t.sleep(sl);          
	 }
	 catch(InterruptedException e){
             
	 }
	 }
        
    }
    public void updateColors()
    {
       if(i==1){
c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);

b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==2){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==3){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);
b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);

c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
}
if(i==4){
b.setBackground(Color.white);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==5){
    c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
b.setBackground(Color.white);
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==6){
b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==7){
    c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==8){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}
if(i==9){
    c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
b.setBackground(Color.white);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}  
if(i==10){
b.setBackground(Color.white);
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==11){
     c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}  
if(i==12){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}  
if(i==13){
     c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==14){
b.setBackground(Color.white);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}     
if(i==15){
    c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
    
b.setBackground(Color.white);
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
}  
if(i==16){
b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==17){
     c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
    
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.blue);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.blue);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==18){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.blue);
b16.setBackground(Color.blue);
b17.setBackground(Color.blue);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.blue);
b40.setBackground(Color.blue);
b41.setBackground(Color.blue);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==19){
      c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
    
b.setBackground(Color.white);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.blue);
b17.setBackground(Color.blue);
b18.setBackground(Color.blue);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.blue);
b41.setBackground(Color.blue);
b42.setBackground(Color.blue);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==20){
b.setBackground(Color.white);
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.blue);
b18.setBackground(Color.blue);
b19.setBackground(Color.blue);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.blue);
b42.setBackground(Color.blue);
b43.setBackground(Color.blue);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==21){
    c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
    
b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.blue);
b19.setBackground(Color.blue);
b20.setBackground(Color.blue);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.blue);
b43.setBackground(Color.blue);
b44.setBackground(Color.blue);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 
if(i==22){
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.blue);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.blue);
b20.setBackground(Color.blue);
b21.setBackground(Color.blue);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.blue);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.blue);
b44.setBackground(Color.blue);
b45.setBackground(Color.blue);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
} 

if(i==23){
     c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
    
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.white);
b4.setBackground(Color.white);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.blue);
b16.setBackground(Color.blue);
b17.setBackground(Color.blue);
b18.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.blue);
b21.setBackground(Color.blue);
b22.setBackground(Color.blue);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.white);
b33.setBackground(Color.white);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.white);
b38.setBackground(Color.white);
b39.setBackground(Color.blue);
b40.setBackground(Color.blue);
b41.setBackground(Color.blue);
b42.setBackground(Color.white);
b43.setBackground(Color.white);
b44.setBackground(Color.blue);
b45.setBackground(Color.blue);
b46.setBackground(Color.blue);
b47.setBackground(Color.white);
} 
if(i==24){
b.setBackground(Color.white);
b1.setBackground(Color.blue);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.white);
b5.setBackground(Color.white);
b6.setBackground(Color.blue);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.blue);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.blue);
b17.setBackground(Color.blue);
b18.setBackground(Color.blue);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.blue);
b22.setBackground(Color.blue);
b23.setBackground(Color.blue);

b24.setBackground(Color.white);
b25.setBackground(Color.blue);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.blue);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.white);
b34.setBackground(Color.white);
b35.setBackground(Color.blue);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.white);
b39.setBackground(Color.white);
b40.setBackground(Color.blue);
b41.setBackground(Color.blue);
b42.setBackground(Color.blue);
b43.setBackground(Color.white);
b44.setBackground(Color.white);
b45.setBackground(Color.blue);
b46.setBackground(Color.blue);
b47.setBackground(Color.blue);
} 
if(i==25){
     c1.setBackground(Color.black);
c2.setBackground(Color.white);
c3.setBackground(Color.black);
c4.setBackground(Color.white);
b.setBackground(Color.white);
b1.setBackground(Color.white);
b2.setBackground(Color.blue);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.blue);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.blue);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.blue);
b18.setBackground(Color.blue);
b19.setBackground(Color.blue);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.blue);
b23.setBackground(Color.blue);

b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.blue);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.blue);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.white);
b35.setBackground(Color.white);
b36.setBackground(Color.blue);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.white);
b40.setBackground(Color.white);
b41.setBackground(Color.blue);
b42.setBackground(Color.blue);
b43.setBackground(Color.blue);
b44.setBackground(Color.white);
b45.setBackground(Color.white);
b46.setBackground(Color.blue);
b47.setBackground(Color.blue);
}
if(i==26){
b.setBackground(Color.blue);
b1.setBackground(Color.white);
b2.setBackground(Color.white);
b3.setBackground(Color.blue);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.blue);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b18.setBackground(Color.blue);
b19.setBackground(Color.blue);
b20.setBackground(Color.blue);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.blue);

b24.setBackground(Color.blue);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.blue);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.white);
b31.setBackground(Color.white);
b32.setBackground(Color.blue);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.white);
b36.setBackground(Color.white);
b37.setBackground(Color.blue);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.white);
b41.setBackground(Color.white);
b42.setBackground(Color.blue);
b43.setBackground(Color.blue);
b44.setBackground(Color.blue);
b45.setBackground(Color.white);
b46.setBackground(Color.white);
b47.setBackground(Color.blue);
} 
if(i==27){
    c1.setBackground(Color.white);
c2.setBackground(Color.black);
c3.setBackground(Color.white);
c4.setBackground(Color.black);
    
b.setBackground(Color.blue);
b1.setBackground(Color.blue);
b2.setBackground(Color.white);
b3.setBackground(Color.white);
b4.setBackground(Color.blue);
b5.setBackground(Color.blue);
b6.setBackground(Color.blue);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.blue);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.blue);
b15.setBackground(Color.blue);
b16.setBackground(Color.blue);
b17.setBackground(Color.white);
b18.setBackground(Color.white);
b19.setBackground(Color.blue);
b20.setBackground(Color.blue);
b21.setBackground(Color.blue);
b22.setBackground(Color.white);
b23.setBackground(Color.white);

b24.setBackground(Color.blue);
b25.setBackground(Color.blue);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.blue);
b29.setBackground(Color.blue);
b30.setBackground(Color.blue);
b31.setBackground(Color.white);
b32.setBackground(Color.white);
b33.setBackground(Color.blue);
b34.setBackground(Color.blue);
b35.setBackground(Color.blue);
b36.setBackground(Color.white);
b37.setBackground(Color.white);
b38.setBackground(Color.blue);
b39.setBackground(Color.blue);
b40.setBackground(Color.blue);
b41.setBackground(Color.white);
b42.setBackground(Color.white);
b43.setBackground(Color.blue);
b44.setBackground(Color.blue);
b45.setBackground(Color.blue);
b46.setBackground(Color.white);
b47.setBackground(Color.white);
i=22;
} 
        // Force UI update
        getContentPane().validate();
        getContentPane().repaint();
    }
    public void call()
    { frd=0;
       if(ran==0){
        if(j==1)
        {
            w1.setVisible(true);
        }
        if(j==2)
        {
            w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
        }
        if(j==3)
        {
            w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);
        }
        if(j==4)
        {
            w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);
           
        }
        if(j==5)
        {     
            w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false);             
        }
        if(j==6){
            w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false);     
        }
        if(j==7){
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false);           
        }
        if(j==8){
            w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);
        }
        if(j==9){
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false);            
        }
        if(j==10){
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
        }
        if(j==11){
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false);                         
        }
        if(j==12){
            w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false);                       
        }
        if(j==13){
            w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false);           
        }
        if(j==14){
            w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false);  
             
            w1.setVisible(true);            
        }
        if(j==15){
            w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false); 
                 
                 w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
        }
        if(j==16){
            w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false);   
                 
             w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);                       
        }
        if(j==17)
        {
            w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false);
            
            w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);           
        }
      if(j==18){
          w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false);
           
            w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false);  
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}            
      }
      if(j==19){
          w19.setVisible(true);
          w18.setVisible(true);
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
          q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);
             w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false);            
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}          
      }
      if(j==20){
          w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }      
           w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false); 
      }
      if(j==21){
          w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);          
      }
      if(j==22){
          w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false);  
      }
      if(j==23){
          w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
      }
      if(j==24)
      {
          q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
              w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false); 
      }
      if(j==25){
          w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
            
        w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false); 
      }
      if(j==26){
          w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
             w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false);
           
      }
      if(j==27){
          w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false);
             w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false);  
      }
      if(j==28)
      { w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false); 
               
      }if(j==29){ w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false); 
                        
            
      }if(j==30){
               w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false);             
                
      }if(j==31){
             w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false);
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}        
             
      }if(j==32){
           w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
           q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);         
           if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}  
      }
      if(j==33){
           w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
      }if(j==34){
            w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
               u1.setVisible(true);
      }if(j==35){
           w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
           u1.setVisible(true);
            y1.setVisible(true);
             p1.setVisible(true);
              u2.setVisible(true);
      }if(j==36){
           w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;
           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
           u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);
            u1.setVisible(true);
      }if(j==37){
           q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }
            u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false);
      }if(j==38){
           w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
          
           u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false);    
      }if(j==39){
           w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
             u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);   
      }if(j==40){
           w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false);
           u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false); 
      }if(j==41){
           u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false);
      }if(j==42){
           u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);
      }if(j==43){
           u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false);
      }if(j==44){
          u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false);      
      }if(j==45){
            u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);             
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false); 
      }if(j==46){
             u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false);  
      }if(j==47){
          u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false);  
             
            u1.setVisible(true);  
      }if(j==48){
           u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false); 
                 
                 u2.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);
      }if(j==49){
           u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false);   
                 
             u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);           
      }if(j==50){
            u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p15.setVisible(false);
            y15.setVisible(false);
            y13.setVisible(false);              
            u13.setVisible(false);
            p13.setVisible(false);
            
            u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false); 
      }if(j==51){
            u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false);
           
            u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false);  
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}        
      }if(j==52){
          u19.setVisible(true);
          u18.setVisible(true);
        ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
          y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);
             u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);            
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}          
      }if(j==53){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }      
           u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false); 
      }if(j==54){
           u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false); 
      }if(j==55){
          u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);  
      }if(j==56){
           u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;           
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false);
      }if(j==57){
          y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
              u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false); 
      }if(j==58){
           u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
            
        u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);             
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false); 
      }if(j==59){
          u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
           u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
             u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false);
      }if(j==60){
           u23.setVisible(false);
          y23.setVisible(false);
          p23.setVisible(false);
             u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false);  
      } if(j==61){
         u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false);  
      }if(j==62){
          u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false); 
      }    if(j==63){
             u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p13.setVisible(false);
            y15.setVisible(false);
            p15.setVisible(false);              
            u13.setVisible(false);
            y13.setVisible(false); 
      }if(j==64){
            u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false);
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;} 
      }if(j==65){
           u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
           y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);         
           if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}  
      }if(j==66){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
      }if(j==67){
           u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
      }if(j==68){
            u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
      }if(j==69){
           u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;          
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                } 
      }if(j==70){
            y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }
    }if(j==71){
         u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
    }if(j==72){
         u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
         u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
    }if(j==73){
          u23.setVisible(false);
           y23.setVisible(false);
            p23.setVisible(false);
    }}
   if(ran==1){
   if(j==1)
        {
            w1.setVisible(true);
        }
        if(j==2)
        {
            w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
        }
        if(j==3)
        {
            w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);
        }
        if(j==4)
        {
            w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);
           
        }
        if(j==5)
        {     
            w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false);             
        }
        if(j==6){
            w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false);     
        } if(j==7){
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false);           
        }
        if(j==8){
            w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);
        }
        if(j==9){
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false);  
             
             
        }
        if(j==10){
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
            
           u1.setVisible(true);
           
        }
        if(j==11){
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false);
            
               u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);
            u2.setVisible(true);
            
        }
        if(j==12){
            w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false); 
            
             u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);
            u1.setVisible(true);
        }
        if(j==13){
            w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false); 
            
            u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false); 
        }
        if(j==14){
            w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false);  
             
             u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false);          
        }
        if(j==15){
            w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false); 
                 
               u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);
        }
        if(j==16){
            w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false);   
                 
             u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false); 
                 
        }
        if(j==17)
        {
            w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false);            
            
             u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false);
        }
      if(j==18){
          w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false);
           
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;} 
            u1.setVisible(true);
      }
      if(j==19){
          w19.setVisible(true);
          w18.setVisible(true);
     ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
          q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);
             u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false);           
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
              u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);
            u2.setVisible(true);
      }
      if(j==20){
          w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }      
         u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false);
          u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);
            u1.setVisible(true);   
      }
      if(j==21){
          w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);             
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false);  
          u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false); 
      }
      if(j==22){
          w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
             u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false); 
            
            u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false); 
      }
      if(j==23){
          w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false); 
            
                
               u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);
      }
      if(j==24)
      {
          q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false); 
               
          u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false);    
      }
      if(j==25){
          w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);ww=1;
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
            
        u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false); 
                u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false);
      }
      if(j==26){
          w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
             
             u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p15.setVisible(false);
            y15.setVisible(false);
            y13.setVisible(false);              
            u13.setVisible(false);
            p13.setVisible(false);
            
          u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);
      }
      if(j==27){
          w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false);
            
          u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false); 
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false); 
            
            w1.setVisible(true);
      }if(j==28){
           u19.setVisible(true);
          u18.setVisible(true);
        ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
          y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);
          if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
           u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false);
            
             w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
      }if(j==29){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
           u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);             
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false);
            
             w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);
      }if(j==30){
           u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false);  
            
             w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);
      }if(j==31){
          u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
           u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false); 
            
             w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false);   
      }if(j==32){
           u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;           
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false); 
                 
                 w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false); 
      }if(j==33){
          y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
           u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false); 
      
                 w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false); 
      }if(j==34){
            u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
          
           u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p15.setVisible(false);
            y15.setVisible(false);
            y13.setVisible(false);              
            u13.setVisible(false);
            p13.setVisible(false);
      
             w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);
      }if(j==35){
          u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
           u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
            
             u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false); 
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
            
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false); 
      }if(j==36){
          u23.setVisible(false);
          y23.setVisible(false);
          p23.setVisible(false);
          
            u19.setVisible(true);
          u18.setVisible(true);
        ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
          y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);
          if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
          
           w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
      }if(j==37){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
      
           w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false);
      }if(j==38){
          u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
                 w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false); 
      }if(j==39){
          u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
            w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false);
      }if(j==40){
            u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;           
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
           w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false); 
      }if(j==41){
           y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
            w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false);
      }if(j==42){
          u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
          
          w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false);  
      }if(j==43){
          u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
           u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
            
            w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false); 
      }if(j==44){
           u23.setVisible(false);
          y23.setVisible(false);
          p23.setVisible(false);
          
             w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false); 
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;} 
      }if(j==45){
           w19.setVisible(true);
          w18.setVisible(true);
     ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
          q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);
          if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;} 
      }if(j==46){
          w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
      }if(j==47){
          w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
      }if(j==48){
            w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
      }if(j==49){
          w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
      }
        if(j==50)
      {
          q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
              
      }
      if(j==51){
          w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);ww=1;
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
       
      }
      if(j==52){
          w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
    
      }
      if(j==53){
          w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false); 
          j=73;
      }}
    
    
    if(ran==2){
   if(j==1)
        {
            w1.setVisible(true);
        }
        if(j==2)
        {
            w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
        }
        if(j==3)
        {
            w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);
        }
        if(j==4)
        {
            w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);
           
        }
        if(j==5)
        {     
            w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false);             
        }
        if(j==6){
            w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false);     
        } if(j==7){
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false);           
        }
        if(j==8){
            w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);
        }
        if(j==9){
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false);  
             
             
        }
        if(j==10){
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
            
           u1.setVisible(true);
           
        }
        if(j==11){
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false);
            
               u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);
            u2.setVisible(true);
            
        }
        if(j==12){
            w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false); 
            
             u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);
            u1.setVisible(true);
        }
        if(j==13){
            w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false); 
            
            u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false); 
        }
        if(j==14){
            w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false);  
             
             u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false);          
        }
        if(j==15){
            w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false); 
                 
               u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);
        }
        if(j==16){
            w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false);   
                 
             u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false); 
                 
        }
        if(j==17)
        {
            w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false);            
            
             u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false);
        }
      if(j==18){
          w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false);
           
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;} 
           
      }
      if(j==19){
          w19.setVisible(true);
          w18.setVisible(true);
     ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
          q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);
             u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false);           
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
             w1.setVisible(true);   
      }if(j==20){
            w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }      
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false);
            
            w2.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);
      }
      if(j==21){
          w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);             
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false);  
            
             w3.setVisible(true);
            q2.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(false);
            e1.setVisible(false);
            w1.setVisible(true);
          
      }
      if(j==22){
          w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
             u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false); 
        w4.setVisible(true);
            q3.setVisible(true);
            w3.setVisible(true);
            e3.setVisible(true);
            w2.setVisible(true);
            w1.setVisible(true);
            q1.setVisible(true);
            e1.setVisible(true);            
            q2.setVisible(false);           
            e2.setVisible(false);
      }
      if(j==23){
          w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false); 
        w5.setVisible(true); 
            q2.setVisible(true);
            q4.setVisible(true);
            w2.setVisible(true);
            e2.setVisible(true);
            w3.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);                     
            q3.setVisible(false);            
            e3.setVisible(false);            
            w1.setVisible(false);
            q1.setVisible(false);
            e1.setVisible(false); 
      }
      if(j==24)
      {
          q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false); 
        
        w6.setVisible(true);
            w5.setVisible(true);
            q5.setVisible(true); 
            e5.setVisible(true);
            w4.setVisible(true);
            w3.setVisible(true);
            q3.setVisible(true);
            e3.setVisible(true);
            q2.setVisible(false);
            q4.setVisible(false);
            w2.setVisible(false);
            e2.setVisible(false);          
            e4.setVisible(false);
      }
      if(j==25){
          w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);ww=1;
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
            
        u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false);     
         w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);
            w5.setVisible(true);
            w4.setVisible(true);
            e4.setVisible(true);
           q4.setVisible(true);                      
            q5.setVisible(false); 
            e5.setVisible(false);
             w3.setVisible(false);
            q3.setVisible(false);
            e3.setVisible(false);  
      }
      if(j==26){
          w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
             
             u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p15.setVisible(false);
            y15.setVisible(false);
            y13.setVisible(false);              
            u13.setVisible(false);
            p13.setVisible(false);
       w8.setVisible(true);
             w7.setVisible(true);
              q7.setVisible(true);
               e7.setVisible(true);
             w6.setVisible(true);
              w5.setVisible(true);
              e5.setVisible(true);   
               q5.setVisible(true);
            q6.setVisible(false);
            e6.setVisible(false);            
            w4.setVisible(false);
            e4.setVisible(false);
           q4.setVisible(false);
      }
      if(j==27){
          w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false);
            
          u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false); 
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
            
             w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);
            w7.setVisible(true);
            w6.setVisible(true);
            q6.setVisible(true);
            e6.setVisible(true);            
             q7.setVisible(false);
             e7.setVisible(false);
            w5.setVisible(false);
              q5.setVisible(false);
             e5.setVisible(false);
    
      }if(j==28){
           u19.setVisible(true);
          u18.setVisible(true);
        ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
          y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);
          if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
           w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);
            w8.setVisible(true);
            w7.setVisible(true);
            q7.setVisible(true);
            e7.setVisible(true);            
            q8.setVisible(false);
            e8.setVisible(false);         
            w6.setVisible(false);
            q6.setVisible(false);
            e6.setVisible(false);
            
           u1.setVisible(true);
      }if(j==29){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
           w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);
            w9.setVisible(true);
            w8.setVisible(true);
            q8.setVisible(true);
            e8.setVisible(true);            
            q9.setVisible(false);
            e9.setVisible(false);            
            w7.setVisible(false);
            q7.setVisible(false);
            e7.setVisible(false);
            
               u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);
            u2.setVisible(true);
      }if(j==30){
           u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           w12.setVisible(true);
            w11.setVisible(true);
            q11.setVisible(true);
            e11.setVisible(true);
            w10.setVisible(true);
            w9.setVisible(true);
            q9.setVisible(true);
            e9.setVisible(true);             
            q10.setVisible(false);
            e10.setVisible(false);           
            w8.setVisible(false);
            q8.setVisible(false);
            e8.setVisible(false); 
            
             u3.setVisible(true);
            y2.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(false);
            p1.setVisible(false);
            u1.setVisible(true);
      }if(j==31){
          u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
            w13.setVisible(true);
            w12.setVisible(true);
            q12.setVisible(true);
            e12.setVisible(true);
            w11.setVisible(true);
            w10.setVisible(true);
            q10.setVisible(true);
            e10.setVisible(true);            
            q11.setVisible(false);
            e11.setVisible(false);           
            w9.setVisible(false);
            q9.setVisible(false);
            e9.setVisible(false); 
            
            u4.setVisible(true);
            y3.setVisible(true);
            u3.setVisible(true);
            p3.setVisible(true);
            u2.setVisible(true);
            u1.setVisible(true);
            y1.setVisible(true);
            p1.setVisible(true);            
            y2.setVisible(false);           
            p2.setVisible(false); 
      }if(j==32){
           u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;           
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           w14.setVisible(true);
             w13.setVisible(true);
              q13.setVisible(true);
             e13.setVisible(true);
              w12.setVisible(true);
               w11.setVisible(true);
                q11.setVisible(true);
                 e11.setVisible(true);
             q12.setVisible(false);
            e12.setVisible(false);           
            w10.setVisible(false);
            q10.setVisible(false);
            e10.setVisible(false);  
             
             u5.setVisible(true); 
            y2.setVisible(true);
            y4.setVisible(true);
            u2.setVisible(true);
            p2.setVisible(true);
            u3.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);                     
            y3.setVisible(false);            
            p3.setVisible(false);            
            u1.setVisible(false);
            y1.setVisible(false);
            p1.setVisible(false);  
      }if(j==33){
          y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
           w15.setVisible(true);
             w14.setVisible(true);
             q14.setVisible(true);
              e14.setVisible(true);
               w13.setVisible(true);
                w12.setVisible(true);
                 q12.setVisible(true); 
                 e12.setVisible(true);              
              q13.setVisible(false);
             e13.setVisible(false);              
               w11.setVisible(false);
                q11.setVisible(false);
                 e11.setVisible(false); 
                 
               u6.setVisible(true);
            u5.setVisible(true);
            y5.setVisible(true); 
            p5.setVisible(true);
            u4.setVisible(true);
            u3.setVisible(true);
            y3.setVisible(true);
            p3.setVisible(true);
            y2.setVisible(false);
            y4.setVisible(false);
            u2.setVisible(false);
            p2.setVisible(false);          
            p4.setVisible(false);
      }if(j==34){
            u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
          
           w16.setVisible(true);
             w15.setVisible(true);
              q15.setVisible(true);
               e15.setVisible(true);
                w14.setVisible(true);
                 w13.setVisible(true);
                 q13.setVisible(true);
                   e13.setVisible(true);
                q14.setVisible(false);
              e14.setVisible(false);               
                w12.setVisible(false);
                 q12.setVisible(false); 
                 e12.setVisible(false);   
                 
             u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);
            u5.setVisible(true);
            u4.setVisible(true);
            p4.setVisible(true);
           y4.setVisible(true);                      
            y5.setVisible(false); 
            p5.setVisible(false);
             u3.setVisible(false);
            y3.setVisible(false);
            p3.setVisible(false); 
      }if(j==35){
          u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
           u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
            
           w17.setVisible(true);
            w16.setVisible(true);
            q16.setVisible(true);
            e16.setVisible(true);
            w15.setVisible(true);
            w14.setVisible(true);
            q14.setVisible(true);
            e14.setVisible(true);
             e13.setVisible(false);
            q15.setVisible(false);
            e15.setVisible(false);              
            w13.setVisible(false);
            q13.setVisible(false);            
            
             u8.setVisible(true);
             u7.setVisible(true);
              y7.setVisible(true);
               p7.setVisible(true);
             u6.setVisible(true);
              u5.setVisible(true);
              p5.setVisible(true);   
               y5.setVisible(true);
            y6.setVisible(false);
            p6.setVisible(false);            
            u4.setVisible(false);
            p4.setVisible(false);
           y4.setVisible(false);  
      }if(j==36){
          u23.setVisible(false);
          y23.setVisible(false);
          p23.setVisible(false);
          
         w18.setVisible(true);
          ww=1;
          w17.setVisible(true);
          q17.setVisible(true);
          e17.setVisible(true);
          w16.setVisible(true);
          w15.setVisible(true);
          q15.setVisible(true);
          e15.setVisible(true);
           q16.setVisible(false);
           e16.setVisible(false);           
           w14.setVisible(false);
           q14.setVisible(false);
           e14.setVisible(false);
           
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);
            u7.setVisible(true);
            u6.setVisible(true);
            y6.setVisible(true);
            p6.setVisible(true);            
             y7.setVisible(false);
             p7.setVisible(false);
            u5.setVisible(false);
              y5.setVisible(false);
             p5.setVisible(false);
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}    
      }
        if(j==37){
          w19.setVisible(true);
          w18.setVisible(true);
     ww=1;
          q18.setVisible(true);
          e18.setVisible(true);
          w17.setVisible(true);
          w16.setVisible(true);
          q16.setVisible(true);
          e16.setVisible(true);
          q17.setVisible(false);
          e17.setVisible(false);         
          w15.setVisible(false);
          q15.setVisible(false);
          e15.setVisible(false);
             u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);
            u8.setVisible(true);
            u7.setVisible(true);
            y7.setVisible(true);
            p7.setVisible(true);            
            y8.setVisible(false);
            p8.setVisible(false);         
            u6.setVisible(false);
            y6.setVisible(false);
            p6.setVisible(false);           
            if(ww==1&&lb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
             
      }if(j==38){
            w20.setVisible(true);
           w19.setVisible(true);
            q19.setVisible(true);
             e19.setVisible(true);
           w18.setVisible(true);
           ww=1;
            w17.setVisible(true);
             q17.setVisible(true);
              e17.setVisible(true);
           q18.setVisible(false);
          e18.setVisible(false);         
          w16.setVisible(false);
          q16.setVisible(false);
          e16.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }      
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);
            u9.setVisible(true);
            u8.setVisible(true);
            y8.setVisible(true);
            p8.setVisible(true);            
            y9.setVisible(false);
            p9.setVisible(false);            
            u7.setVisible(false);
            y7.setVisible(false);
            p7.setVisible(false);
         
      }
      if(j==39){
          w21.setVisible(true);
          w20.setVisible(true);
          q20.setVisible(true);
          e20.setVisible(true);
          e18.setVisible(true);
           q19.setVisible(false);
             e19.setVisible(false);          
            w17.setVisible(false);
             q17.setVisible(false);
              e17.setVisible(false);
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u12.setVisible(true);
            u11.setVisible(true);
            y11.setVisible(true);
            p11.setVisible(true);
            u10.setVisible(true);
            u9.setVisible(true);
            y9.setVisible(true);
            p9.setVisible(true);      
          w19.setVisible(true);
          w18.setVisible(true);
          ww=1;
          q18.setVisible(true);       
            y10.setVisible(false);
            p10.setVisible(false);           
            u8.setVisible(false);
            y8.setVisible(false);
            p8.setVisible(false);  
     
      }
      if(j==40){
          w22.setVisible(true);
           w21.setVisible(true);
            q21.setVisible(true);
           e21.setVisible(true);
            w20.setVisible(true);
             w19.setVisible(true);
             ww=1;
              q19.setVisible(true);
           e19.setVisible(true);
           q20.setVisible(false);
          e20.setVisible(false);
            w18.setVisible(false);       
          q18.setVisible(false);
          e18.setVisible(false);
          if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
             u13.setVisible(true);
            u12.setVisible(true);
            y12.setVisible(true);
            p12.setVisible(true);
            u11.setVisible(true);
            u10.setVisible(true);
            y10.setVisible(true);
            p10.setVisible(true);            
            y11.setVisible(false);
            p11.setVisible(false);           
            u9.setVisible(false);
            y9.setVisible(false);
            p9.setVisible(false); 
   
      }
      if(j==41){
          w23.setVisible(true);
          w22.setVisible(true);
          q22.setVisible(true);
          e22.setVisible(true);
          w21.setVisible(true);
          w20.setVisible(true);
          ww=1;           
          q20.setVisible(true);
          e20.setVisible(true);
           q21.setVisible(false);
           e21.setVisible(false);          
           w19.setVisible(false);
           q19.setVisible(false);
           e19.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
           u14.setVisible(true);
             u13.setVisible(true);
              y13.setVisible(true);
             p13.setVisible(true);
              u12.setVisible(true);
               u11.setVisible(true);
                y11.setVisible(true);
                 p11.setVisible(true);
             y12.setVisible(false);
            p12.setVisible(false);           
            u10.setVisible(false);
            y10.setVisible(false);
            p10.setVisible(false); 
     
      }
      if(j==42)
      {
          q23.setVisible(true);
          w23.setVisible(true);
          e23.setVisible(true);
          w22.setVisible(true);
          q21.setVisible(true);
          w21.setVisible(true);
          e21.setVisible(true);
          ww=1;
           q22.setVisible(false);
          e22.setVisible(false);          
          w20.setVisible(false);                
          q20.setVisible(false);
          e20.setVisible(false);
           if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
            u15.setVisible(true);
             u14.setVisible(true);
             y14.setVisible(true);
              p14.setVisible(true);
               u13.setVisible(true);
                u12.setVisible(true);
                 y12.setVisible(true); 
                 p12.setVisible(true);              
              y13.setVisible(false);
             p13.setVisible(false);              
               u11.setVisible(false);
                y11.setVisible(false);
                 p11.setVisible(false); 
 
      }
      if(j==43){
          w22.setVisible(true);
           q22.setVisible(true);
            e22.setVisible(true);
             w23.setVisible(true);ww=1;
               if(ww==1&&lb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
          q23.setVisible(false);        
          e23.setVisible(false);         
          q21.setVisible(false);
          w21.setVisible(false);
          e21.setVisible(false);
            
        u16.setVisible(true);
             u15.setVisible(true);
              y15.setVisible(true);
               p15.setVisible(true);
                u14.setVisible(true);
                 u13.setVisible(true);
                 y13.setVisible(true);
                   p13.setVisible(true);
                y14.setVisible(false);
              p14.setVisible(false);               
                u12.setVisible(false);
                 y12.setVisible(false); 
                 p12.setVisible(false);     
      
      }
      if(j==44){
          w23.setVisible(true);
          q23.setVisible(true);
          e23.setVisible(true);
           w22.setVisible(false);
           q22.setVisible(false);
            e22.setVisible(false);
             
             u17.setVisible(true);
            u16.setVisible(true);
            y16.setVisible(true);
            p16.setVisible(true);
            u15.setVisible(true);
            u14.setVisible(true);
            y14.setVisible(true);
            p14.setVisible(true);
             p15.setVisible(false);
            y15.setVisible(false);
            y13.setVisible(false);              
            u13.setVisible(false);
            p13.setVisible(false);
   
      }
      if(j==45){
          w23.setVisible(false);
          q23.setVisible(false);
          e23.setVisible(false);
            
          u18.setVisible(true);
          ww=1;
          u17.setVisible(true);
          y17.setVisible(true);
          p17.setVisible(true);
          u16.setVisible(true);
          u15.setVisible(true);
          y15.setVisible(true);
          p15.setVisible(true);
           y16.setVisible(false);
           p16.setVisible(false);           
           u14.setVisible(false);
           y14.setVisible(false);
           p14.setVisible(false); 
            if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
       
      }if(j==46){
           u19.setVisible(true);
          u18.setVisible(true);
        ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
          u17.setVisible(true);
          u16.setVisible(true);
          y16.setVisible(true);
          p16.setVisible(true);
          y17.setVisible(false);
          p17.setVisible(false);         
          u15.setVisible(false);
          y15.setVisible(false);
          p15.setVisible(false);
          if(ww==1&&rb==1&&ex==0){
                game3 g3=new game3(s);
                g3.setVisible(true);
                this.setVisible(false);
                ex++;}
            else{
                ww=0;
                uu=0;}
      
      }if(j==47){
           u20.setVisible(true);
           u19.setVisible(true);
            y19.setVisible(true);
             p19.setVisible(true);
           u18.setVisible(true);
           ww=1;
            u17.setVisible(true);
             y17.setVisible(true);
              p17.setVisible(true);
           y18.setVisible(false);
          p18.setVisible(false);         
          u16.setVisible(false);
          y16.setVisible(false);
          p16.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }   
       
      }if(j==48){
           u21.setVisible(true);
          u20.setVisible(true);
          y20.setVisible(true);
          p20.setVisible(true);
          u19.setVisible(true);
          u18.setVisible(true);
          ww=1;
          y18.setVisible(true);
          p18.setVisible(true);
           y19.setVisible(false);
             p19.setVisible(false);          
            u17.setVisible(false);
             y17.setVisible(false);
              p17.setVisible(false);
               if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
        
      }if(j==49){
          u22.setVisible(true);
           u21.setVisible(true);
            y21.setVisible(true);
           p21.setVisible(true);
            u20.setVisible(true);
             u19.setVisible(true);
             ww=1;
              y19.setVisible(true);
           p19.setVisible(true);
           y20.setVisible(false);
          p20.setVisible(false);
            u18.setVisible(false);       
          y18.setVisible(false);
          p18.setVisible(false);
          if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
      
      }if(j==50){
           u23.setVisible(true);
          u22.setVisible(true);
          y22.setVisible(true);
          p22.setVisible(true);
          u21.setVisible(true);
          u20.setVisible(true);
          ww=1;           
          y20.setVisible(true);
          p20.setVisible(true);
           y21.setVisible(false);
           p21.setVisible(false);          
           u19.setVisible(false);
           y19.setVisible(false);
           p19.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }    
         
      }if(j==51){
          y23.setVisible(true);
          u23.setVisible(true);
          p23.setVisible(true);
          u22.setVisible(true);
          y21.setVisible(true);
          u21.setVisible(true);
          p21.setVisible(true);
          ww=1;
           y22.setVisible(false);
          p22.setVisible(false);          
          u20.setVisible(false);                
          y20.setVisible(false);
          p20.setVisible(false);
           if(ww==1&&rb==1&&ex==0){ this.setVisible(false);
                game3 g3=new game3(s);
                g3.setVisible(true);
                ex++;
               }
            else{
                ww=0;
                }  
        
      }if(j==52){
            u22.setVisible(true);
           y22.setVisible(true);
            p22.setVisible(true);
             u23.setVisible(true);
          y23.setVisible(false);        
          p23.setVisible(false);         
          y21.setVisible(false);
          u21.setVisible(false);
          p21.setVisible(false);
          
         
      }if(j==53){
          u23.setVisible(true);
          y23.setVisible(true);
          p23.setVisible(true);
           u22.setVisible(false);
           y22.setVisible(false);
            p22.setVisible(false);
        
      }if(j==54){
          u23.setVisible(false);
          y23.setVisible(false);
          p23.setVisible(false);
          j=73;
    }}
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x = new javax.swing.JButton();
        x4 = new javax.swing.JButton();
        x1 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        x6 = new javax.swing.JButton();
        x7 = new javax.swing.JButton();
        x8 = new javax.swing.JButton();
        x9 = new javax.swing.JButton();
        x10 = new javax.swing.JButton();
        x11 = new javax.swing.JButton();
        x13 = new javax.swing.JButton();
        x14 = new javax.swing.JButton();
        x15 = new javax.swing.JButton();
        bbr = new javax.swing.JButton();
        bbl = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        q1 = new javax.swing.JButton();
        w1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        q2 = new javax.swing.JButton();
        w2 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        q3 = new javax.swing.JButton();
        w3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        q4 = new javax.swing.JButton();
        w4 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        q5 = new javax.swing.JButton();
        w5 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        q6 = new javax.swing.JButton();
        w6 = new javax.swing.JButton();
        e7 = new javax.swing.JButton();
        q7 = new javax.swing.JButton();
        w7 = new javax.swing.JButton();
        e8 = new javax.swing.JButton();
        q8 = new javax.swing.JButton();
        w8 = new javax.swing.JButton();
        e9 = new javax.swing.JButton();
        q9 = new javax.swing.JButton();
        w9 = new javax.swing.JButton();
        e10 = new javax.swing.JButton();
        q10 = new javax.swing.JButton();
        w10 = new javax.swing.JButton();
        e11 = new javax.swing.JButton();
        q11 = new javax.swing.JButton();
        w11 = new javax.swing.JButton();
        e12 = new javax.swing.JButton();
        q12 = new javax.swing.JButton();
        w12 = new javax.swing.JButton();
        e13 = new javax.swing.JButton();
        q13 = new javax.swing.JButton();
        w13 = new javax.swing.JButton();
        e14 = new javax.swing.JButton();
        q14 = new javax.swing.JButton();
        w14 = new javax.swing.JButton();
        e15 = new javax.swing.JButton();
        q15 = new javax.swing.JButton();
        w15 = new javax.swing.JButton();
        e16 = new javax.swing.JButton();
        q16 = new javax.swing.JButton();
        w16 = new javax.swing.JButton();
        e17 = new javax.swing.JButton();
        q17 = new javax.swing.JButton();
        w17 = new javax.swing.JButton();
        e18 = new javax.swing.JButton();
        q18 = new javax.swing.JButton();
        w18 = new javax.swing.JButton();
        e19 = new javax.swing.JButton();
        q19 = new javax.swing.JButton();
        w19 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        y1 = new javax.swing.JButton();
        u1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        y2 = new javax.swing.JButton();
        u2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        y3 = new javax.swing.JButton();
        u3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        y4 = new javax.swing.JButton();
        u4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        y5 = new javax.swing.JButton();
        u5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        y6 = new javax.swing.JButton();
        u6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        y7 = new javax.swing.JButton();
        u7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        y8 = new javax.swing.JButton();
        u8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        y9 = new javax.swing.JButton();
        u9 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        y10 = new javax.swing.JButton();
        u10 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        y11 = new javax.swing.JButton();
        u11 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
        y12 = new javax.swing.JButton();
        u12 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        y13 = new javax.swing.JButton();
        u13 = new javax.swing.JButton();
        p14 = new javax.swing.JButton();
        y14 = new javax.swing.JButton();
        u14 = new javax.swing.JButton();
        p15 = new javax.swing.JButton();
        y15 = new javax.swing.JButton();
        u15 = new javax.swing.JButton();
        p16 = new javax.swing.JButton();
        y16 = new javax.swing.JButton();
        u16 = new javax.swing.JButton();
        p17 = new javax.swing.JButton();
        y17 = new javax.swing.JButton();
        u17 = new javax.swing.JButton();
        p18 = new javax.swing.JButton();
        y18 = new javax.swing.JButton();
        u18 = new javax.swing.JButton();
        p19 = new javax.swing.JButton();
        y19 = new javax.swing.JButton();
        u19 = new javax.swing.JButton();
        e20 = new javax.swing.JButton();
        q20 = new javax.swing.JButton();
        w20 = new javax.swing.JButton();
        e21 = new javax.swing.JButton();
        q21 = new javax.swing.JButton();
        w21 = new javax.swing.JButton();
        e22 = new javax.swing.JButton();
        q22 = new javax.swing.JButton();
        w22 = new javax.swing.JButton();
        e23 = new javax.swing.JButton();
        q23 = new javax.swing.JButton();
        w23 = new javax.swing.JButton();
        p20 = new javax.swing.JButton();
        y20 = new javax.swing.JButton();
        u20 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        y21 = new javax.swing.JButton();
        u21 = new javax.swing.JButton();
        p22 = new javax.swing.JButton();
        y22 = new javax.swing.JButton();
        u22 = new javax.swing.JButton();
        p23 = new javax.swing.JButton();
        y23 = new javax.swing.JButton();
        u23 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        x5 = new javax.swing.JButton();
        x12 = new javax.swing.JButton();
        bb1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        bg = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(40, 0, 30, 30);
        getContentPane().add(b1);
        b1.setBounds(40, 30, 30, 30);
        getContentPane().add(b2);
        b2.setBounds(40, 60, 30, 30);
        getContentPane().add(b3);
        b3.setBounds(40, 90, 30, 30);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(40, 120, 30, 30);
        getContentPane().add(b5);
        b5.setBounds(40, 150, 30, 30);
        getContentPane().add(b6);
        b6.setBounds(40, 180, 30, 30);
        getContentPane().add(b7);
        b7.setBounds(40, 210, 30, 30);
        getContentPane().add(b8);
        b8.setBounds(40, 240, 30, 30);
        getContentPane().add(b9);
        b9.setBounds(40, 270, 30, 30);
        getContentPane().add(b10);
        b10.setBounds(40, 300, 30, 30);

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(40, 330, 30, 30);
        getContentPane().add(b12);
        b12.setBounds(40, 360, 30, 30);

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13);
        b13.setBounds(40, 390, 30, 30);

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14);
        b14.setBounds(40, 420, 30, 30);
        getContentPane().add(b15);
        b15.setBounds(40, 450, 30, 30);
        getContentPane().add(b16);
        b16.setBounds(40, 480, 30, 30);

        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17);
        b17.setBounds(40, 510, 30, 30);
        getContentPane().add(b18);
        b18.setBounds(40, 540, 30, 30);
        getContentPane().add(b20);
        b20.setBounds(40, 600, 30, 30);
        getContentPane().add(b21);
        b21.setBounds(40, 630, 30, 30);
        getContentPane().add(b22);
        b22.setBounds(40, 660, 30, 30);
        getContentPane().add(b23);
        b23.setBounds(40, 690, 30, 30);

        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24);
        b24.setBounds(510, 0, 30, 30);

        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25);
        b25.setBounds(510, 30, 30, 30);

        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26);
        b26.setBounds(510, 60, 30, 30);

        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27);
        b27.setBounds(510, 90, 30, 30);
        getContentPane().add(c2);
        c2.setBounds(280, 170, 20, 140);
        getContentPane().add(c1);
        c1.setBounds(280, 0, 20, 120);
        getContentPane().add(c4);
        c4.setBounds(280, 550, 20, 160);
        getContentPane().add(c3);
        c3.setBounds(280, 350, 20, 150);
        getContentPane().add(x3);
        x3.setBounds(160, 540, 30, 30);
        getContentPane().add(x);
        x.setBounds(160, 510, 30, 30);
        getContentPane().add(x4);
        x4.setBounds(160, 570, 30, 30);
        getContentPane().add(x1);
        x1.setBounds(190, 540, 30, 30);
        getContentPane().add(x2);
        x2.setBounds(130, 540, 30, 30);
        getContentPane().add(x6);
        x6.setBounds(130, 600, 30, 30);
        getContentPane().add(x7);
        x7.setBounds(190, 600, 30, 30);
        getContentPane().add(x8);
        x8.setBounds(390, 510, 30, 30);
        getContentPane().add(x9);
        x9.setBounds(360, 540, 30, 30);
        getContentPane().add(x10);
        x10.setBounds(420, 540, 30, 30);
        getContentPane().add(x11);
        x11.setBounds(390, 540, 30, 30);
        getContentPane().add(x13);
        x13.setBounds(390, 600, 30, 30);
        getContentPane().add(x14);
        x14.setBounds(420, 600, 30, 30);
        getContentPane().add(x15);
        x15.setBounds(360, 600, 30, 30);

        bbr.setText(">");
        bbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbrActionPerformed(evt);
            }
        });
        getContentPane().add(bbr);
        bbr.setBounds(750, 360, 80, 50);

        bbl.setText("<");
        bbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bblActionPerformed(evt);
            }
        });
        getContentPane().add(bbl);
        bbl.setBounds(670, 360, 80, 50);
        getContentPane().add(e1);
        e1.setBounds(190, 0, 30, 30);
        getContentPane().add(q1);
        q1.setBounds(130, 0, 30, 30);
        getContentPane().add(w1);
        w1.setBounds(160, 0, 30, 30);
        getContentPane().add(e2);
        e2.setBounds(190, 30, 30, 30);
        getContentPane().add(q2);
        q2.setBounds(130, 30, 30, 30);
        getContentPane().add(w2);
        w2.setBounds(160, 30, 30, 30);
        getContentPane().add(e3);
        e3.setBounds(190, 60, 30, 30);
        getContentPane().add(q3);
        q3.setBounds(130, 60, 30, 30);
        getContentPane().add(w3);
        w3.setBounds(160, 60, 30, 30);
        getContentPane().add(e4);
        e4.setBounds(190, 90, 30, 30);
        getContentPane().add(q4);
        q4.setBounds(130, 90, 30, 30);
        getContentPane().add(w4);
        w4.setBounds(160, 90, 30, 30);
        getContentPane().add(e5);
        e5.setBounds(190, 120, 30, 30);
        getContentPane().add(q5);
        q5.setBounds(130, 120, 30, 30);
        getContentPane().add(w5);
        w5.setBounds(160, 120, 30, 30);
        getContentPane().add(e6);
        e6.setBounds(190, 150, 30, 30);
        getContentPane().add(q6);
        q6.setBounds(130, 150, 30, 30);
        getContentPane().add(w6);
        w6.setBounds(160, 150, 30, 30);
        getContentPane().add(e7);
        e7.setBounds(190, 180, 30, 30);
        getContentPane().add(q7);
        q7.setBounds(130, 180, 30, 30);
        getContentPane().add(w7);
        w7.setBounds(160, 180, 30, 30);
        getContentPane().add(e8);
        e8.setBounds(190, 210, 30, 30);
        getContentPane().add(q8);
        q8.setBounds(130, 210, 30, 30);
        getContentPane().add(w8);
        w8.setBounds(160, 210, 30, 30);
        getContentPane().add(e9);
        e9.setBounds(190, 240, 30, 30);
        getContentPane().add(q9);
        q9.setBounds(130, 240, 30, 30);
        getContentPane().add(w9);
        w9.setBounds(160, 240, 30, 30);
        getContentPane().add(e10);
        e10.setBounds(190, 270, 30, 30);
        getContentPane().add(q10);
        q10.setBounds(130, 270, 30, 30);
        getContentPane().add(w10);
        w10.setBounds(160, 270, 30, 30);
        getContentPane().add(e11);
        e11.setBounds(190, 300, 30, 30);
        getContentPane().add(q11);
        q11.setBounds(130, 300, 30, 30);
        getContentPane().add(w11);
        w11.setBounds(160, 300, 30, 30);
        getContentPane().add(e12);
        e12.setBounds(190, 330, 30, 30);
        getContentPane().add(q12);
        q12.setBounds(130, 330, 30, 30);
        getContentPane().add(w12);
        w12.setBounds(160, 330, 30, 30);
        getContentPane().add(e13);
        e13.setBounds(190, 360, 30, 30);
        getContentPane().add(q13);
        q13.setBounds(130, 360, 30, 30);
        getContentPane().add(w13);
        w13.setBounds(160, 360, 30, 30);
        getContentPane().add(e14);
        e14.setBounds(190, 390, 30, 30);
        getContentPane().add(q14);
        q14.setBounds(130, 390, 30, 30);
        getContentPane().add(w14);
        w14.setBounds(160, 390, 30, 30);
        getContentPane().add(e15);
        e15.setBounds(190, 420, 30, 30);
        getContentPane().add(q15);
        q15.setBounds(130, 420, 30, 30);
        getContentPane().add(w15);
        w15.setBounds(160, 420, 30, 30);
        getContentPane().add(e16);
        e16.setBounds(190, 450, 30, 30);
        getContentPane().add(q16);
        q16.setBounds(130, 450, 30, 30);
        getContentPane().add(w16);
        w16.setBounds(160, 450, 30, 30);
        getContentPane().add(e17);
        e17.setBounds(190, 480, 30, 30);
        getContentPane().add(q17);
        q17.setBounds(130, 480, 30, 30);
        getContentPane().add(w17);
        w17.setBounds(160, 480, 30, 30);
        getContentPane().add(e18);
        e18.setBounds(190, 510, 30, 30);
        getContentPane().add(q18);
        q18.setBounds(130, 510, 30, 30);
        getContentPane().add(w18);
        w18.setBounds(160, 510, 30, 30);
        getContentPane().add(e19);
        e19.setBounds(190, 540, 30, 30);
        getContentPane().add(q19);
        q19.setBounds(130, 540, 30, 30);
        getContentPane().add(w19);
        w19.setBounds(160, 540, 30, 30);
        getContentPane().add(p1);
        p1.setBounds(420, 0, 30, 30);
        getContentPane().add(y1);
        y1.setBounds(360, 0, 30, 30);
        getContentPane().add(u1);
        u1.setBounds(390, 0, 30, 30);
        getContentPane().add(p2);
        p2.setBounds(420, 30, 30, 30);
        getContentPane().add(y2);
        y2.setBounds(360, 30, 30, 30);
        getContentPane().add(u2);
        u2.setBounds(390, 30, 30, 30);
        getContentPane().add(p3);
        p3.setBounds(420, 60, 30, 30);
        getContentPane().add(y3);
        y3.setBounds(360, 60, 30, 30);
        getContentPane().add(u3);
        u3.setBounds(390, 60, 30, 30);
        getContentPane().add(p4);
        p4.setBounds(420, 90, 30, 30);
        getContentPane().add(y4);
        y4.setBounds(360, 90, 30, 30);
        getContentPane().add(u4);
        u4.setBounds(390, 90, 30, 30);
        getContentPane().add(p5);
        p5.setBounds(420, 120, 30, 30);
        getContentPane().add(y5);
        y5.setBounds(360, 120, 30, 30);
        getContentPane().add(u5);
        u5.setBounds(390, 120, 30, 30);
        getContentPane().add(p6);
        p6.setBounds(420, 150, 30, 30);
        getContentPane().add(y6);
        y6.setBounds(360, 150, 30, 30);
        getContentPane().add(u6);
        u6.setBounds(390, 150, 30, 30);
        getContentPane().add(p7);
        p7.setBounds(420, 180, 30, 30);
        getContentPane().add(y7);
        y7.setBounds(360, 180, 30, 30);
        getContentPane().add(u7);
        u7.setBounds(390, 180, 30, 30);
        getContentPane().add(p8);
        p8.setBounds(420, 210, 30, 30);
        getContentPane().add(y8);
        y8.setBounds(360, 210, 30, 30);
        getContentPane().add(u8);
        u8.setBounds(390, 210, 30, 30);
        getContentPane().add(p9);
        p9.setBounds(420, 240, 30, 30);
        getContentPane().add(y9);
        y9.setBounds(360, 240, 30, 30);
        getContentPane().add(u9);
        u9.setBounds(390, 240, 30, 30);
        getContentPane().add(p10);
        p10.setBounds(420, 270, 30, 30);
        getContentPane().add(y10);
        y10.setBounds(360, 270, 30, 30);
        getContentPane().add(u10);
        u10.setBounds(390, 270, 30, 30);
        getContentPane().add(p11);
        p11.setBounds(420, 300, 30, 30);
        getContentPane().add(y11);
        y11.setBounds(360, 300, 30, 30);
        getContentPane().add(u11);
        u11.setBounds(390, 300, 30, 30);
        getContentPane().add(p12);
        p12.setBounds(420, 330, 30, 30);
        getContentPane().add(y12);
        y12.setBounds(360, 330, 30, 30);
        getContentPane().add(u12);
        u12.setBounds(390, 330, 30, 30);
        getContentPane().add(p13);
        p13.setBounds(420, 360, 30, 30);
        getContentPane().add(y13);
        y13.setBounds(360, 360, 30, 30);
        getContentPane().add(u13);
        u13.setBounds(390, 360, 30, 30);
        getContentPane().add(p14);
        p14.setBounds(420, 390, 30, 30);
        getContentPane().add(y14);
        y14.setBounds(360, 390, 30, 30);
        getContentPane().add(u14);
        u14.setBounds(390, 390, 30, 30);
        getContentPane().add(p15);
        p15.setBounds(420, 420, 30, 30);
        getContentPane().add(y15);
        y15.setBounds(360, 420, 30, 30);
        getContentPane().add(u15);
        u15.setBounds(390, 420, 30, 30);
        getContentPane().add(p16);
        p16.setBounds(420, 450, 30, 30);
        getContentPane().add(y16);
        y16.setBounds(360, 450, 30, 30);
        getContentPane().add(u16);
        u16.setBounds(390, 450, 30, 30);
        getContentPane().add(p17);
        p17.setBounds(420, 480, 30, 30);
        getContentPane().add(y17);
        y17.setBounds(360, 480, 30, 30);
        getContentPane().add(u17);
        u17.setBounds(390, 480, 30, 30);
        getContentPane().add(p18);
        p18.setBounds(420, 510, 30, 30);
        getContentPane().add(y18);
        y18.setBounds(360, 510, 30, 30);
        getContentPane().add(u18);
        u18.setBounds(390, 510, 30, 30);
        getContentPane().add(p19);
        p19.setBounds(420, 540, 30, 30);
        getContentPane().add(y19);
        y19.setBounds(360, 540, 30, 30);
        getContentPane().add(u19);
        u19.setBounds(390, 540, 30, 30);
        getContentPane().add(e20);
        e20.setBounds(190, 570, 30, 30);
        getContentPane().add(q20);
        q20.setBounds(130, 570, 30, 30);
        getContentPane().add(w20);
        w20.setBounds(160, 570, 30, 30);
        getContentPane().add(e21);
        e21.setBounds(190, 600, 30, 30);
        getContentPane().add(q21);
        q21.setBounds(130, 600, 30, 30);
        getContentPane().add(w21);
        w21.setBounds(160, 600, 30, 30);
        getContentPane().add(e22);
        e22.setBounds(190, 630, 30, 30);
        getContentPane().add(q22);
        q22.setBounds(130, 630, 30, 30);
        getContentPane().add(w22);
        w22.setBounds(160, 630, 30, 30);
        getContentPane().add(e23);
        e23.setBounds(190, 660, 30, 30);
        getContentPane().add(q23);
        q23.setBounds(130, 660, 30, 30);
        getContentPane().add(w23);
        w23.setBounds(160, 660, 30, 30);
        getContentPane().add(p20);
        p20.setBounds(420, 570, 30, 30);
        getContentPane().add(y20);
        y20.setBounds(360, 570, 30, 30);
        getContentPane().add(u20);
        u20.setBounds(390, 570, 30, 30);
        getContentPane().add(p21);
        p21.setBounds(420, 600, 30, 30);
        getContentPane().add(y21);
        y21.setBounds(360, 600, 30, 30);
        getContentPane().add(u21);
        u21.setBounds(390, 600, 30, 30);
        getContentPane().add(p22);
        p22.setBounds(420, 630, 30, 30);
        getContentPane().add(y22);
        y22.setBounds(360, 630, 30, 30);
        getContentPane().add(u22);
        u22.setBounds(390, 630, 30, 30);
        getContentPane().add(p23);
        p23.setBounds(420, 660, 30, 30);
        getContentPane().add(y23);
        y23.setBounds(360, 660, 30, 30);
        getContentPane().add(u23);
        u23.setBounds(390, 660, 30, 30);
        getContentPane().add(b19);
        b19.setBounds(40, 570, 30, 30);
        getContentPane().add(x5);
        x5.setBounds(160, 600, 30, 30);
        getContentPane().add(x12);
        x12.setBounds(390, 570, 30, 30);

        bb1.setBackground(new java.awt.Color(255, 255, 255));
        bb1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        bb1.setText("Pause");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });
        getContentPane().add(bb1);
        bb1.setBounds(700, 150, 110, 40);

        jButton4.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton4.setText("play");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(700, 230, 110, 40);

        l.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 255));
        l.setText("wait for a second");
        getContentPane().add(l);
        l.setBounds(650, 70, 240, 40);

        jButton1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 440, 50, 40);

        jButton2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(690, 440, 50, 40);

        jButton3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 440, 50, 40);

        jButton5.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(790, 440, 50, 40);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Score");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 20, 90, 40);

        l1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("kdslf");
        getContentPane().add(l1);
        l1.setBounds(760, 20, 150, 40);

        bg.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        bg.setText("5");
        bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgActionPerformed(evt);
            }
        });
        getContentPane().add(bg);
        bg.setBounds(840, 440, 50, 40);

        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28);
        b28.setBounds(510, 120, 30, 30);

        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29);
        b29.setBounds(510, 150, 30, 30);

        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30);
        b30.setBounds(510, 180, 30, 30);

        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31);
        b31.setBounds(510, 210, 30, 30);

        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32);
        b32.setBounds(510, 240, 30, 30);

        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33);
        b33.setBounds(510, 270, 30, 30);

        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34);
        b34.setBounds(510, 300, 30, 30);

        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35);
        b35.setBounds(510, 330, 30, 30);

        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36);
        b36.setBounds(510, 360, 30, 30);

        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37);
        b37.setBounds(510, 390, 30, 30);

        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38);
        b38.setBounds(510, 420, 30, 30);

        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39);
        b39.setBounds(510, 450, 30, 30);

        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40);
        b40.setBounds(510, 480, 30, 30);

        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41);
        b41.setBounds(510, 510, 30, 30);

        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42);
        b42.setBounds(510, 540, 30, 30);

        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43);
        b43.setBounds(510, 570, 30, 30);

        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44);
        b44.setBounds(510, 600, 30, 30);

        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45);
        b45.setBounds(510, 630, 30, 30);

        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46);
        b46.setBounds(510, 660, 30, 30);

        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47);
        b47.setBounds(510, 690, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/light_gray-wallpaper-1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 690);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leopard_aurora_purple-1680x1050.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 0, 380, 710);

        setBounds(0, 0, 958, 714);
    }// </editor-fold>//GEN-END:initComponents

    private void bbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbrActionPerformed
        if(frd==0){   
        x.setVisible(false);
         x1.setVisible(false);
          x2.setVisible(false);
           x3.setVisible(false);
            x4.setVisible(false);
             x5.setVisible(false);
              x6.setVisible(false);
               x7.setVisible(false);
                x8.setVisible(true);
         x9.setVisible(true);
          x10.setVisible(true);
           x11.setVisible(true);
            x12.setVisible(true);
             x13.setVisible(true);
              x14.setVisible(true);
               x15.setVisible(true);
               rb=1;
               lb=0;   
             /* if(frd==1)
              {    s=s-s;
                   l1.setText(Integer.toString(s));
              }*/
        }
    }//GEN-LAST:event_bbrActionPerformed

    private void bblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bblActionPerformed
        if(frd==0){ 
        x8.setVisible(false);
         x9.setVisible(false);
          x10.setVisible(false);
           x11.setVisible(false);
            x12.setVisible(false);
             x13.setVisible(false);
              x14.setVisible(false);
               x15.setVisible(false);
         x.setVisible(true);
         x1.setVisible(true);
          x2.setVisible(true);
           x3.setVisible(true);
            x4.setVisible(true);
             x5.setVisible(true);
              x6.setVisible(true);
               x7.setVisible(true);
               lb=1;
               rb=0;
               /* if(frd==1)
              {    s=s-s;
                   l1.setText(Integer.toString(s));
              }*/
        }
    }//GEN-LAST:event_bblActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
       x.setBackground(Color.pink);
         s1=evt.getKeyChar();
         
    /*  if(s1=='s')
      {
             x8.setVisible(false);
         x9.setVisible(false);
          x10.setVisible(false);
           x11.setVisible(false);
            x12.setVisible(false);
             x13.setVisible(false);
              x14.setVisible(false);
               x15.setVisible(false);
                x.setVisible(true);
         x1.setVisible(true);
          x2.setVisible(true);
           x3.setVisible(true);
            x4.setVisible(true);
             x5.setVisible(true);
              x6.setVisible(true);
               x7.setVisible(true);
      }
      if(s1=='d')
      {
               x.setVisible(false);
         x1.setVisible(false);
          x2.setVisible(false);
           x3.setVisible(false);
            x4.setVisible(false);
             x5.setVisible(false);
              x6.setVisible(false);
               x7.setVisible(false);
                x8.setVisible(true);
         x9.setVisible(true);
          x10.setVisible(true);
           x11.setVisible(true);
            x12.setVisible(true);
             x13.setVisible(true);
              x14.setVisible(true);
               x15.setVisible(true);
      }*/
    }//GEN-LAST:event_formKeyTyped

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b27ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         key = evt.getKeyCode(); 
        // l.setVisible(true);
        // l.setText("shsddkjc");
         
      /*  if (key == 39) {
            x8.setVisible(false);
            x9.setVisible(false);
            x10.setVisible(false);
            x11.setVisible(false);
            x12.setVisible(false);
            x13.setVisible(false);
            x14.setVisible(false);
            x15.setVisible(false);
            x.setVisible(true);
            x1.setVisible(true);
            x2.setVisible(true);
            x3.setVisible(true);
            x4.setVisible(true);
            x5.setVisible(true);
            x6.setVisible(true);
            x7.setVisible(true);
        } else if (key == 37) {
            x.setVisible(false);
            x1.setVisible(false);
            x2.setVisible(false);
            x3.setVisible(false);
            x4.setVisible(false);
            x5.setVisible(false);
            x6.setVisible(false);
            x7.setVisible(false);
            x8.setVisible(true);
            x9.setVisible(true);
            x10.setVisible(true);
            x11.setVisible(true);
            x12.setVisible(true);
            x13.setVisible(true);
            x14.setVisible(true);
            x15.setVisible(true);
        }*/
    }//GEN-LAST:event_formKeyPressed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed
         sl=6000;
         bbl.setVisible(false);
        bbr.setVisible(false);
    }//GEN-LAST:event_bb1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        k=1; 
        frd=1;
        sl=150;
      l.setVisible(true);
      bbl.setVisible(true);
         bbr.setVisible(true); 
    //  t1.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       sl=150;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        sl=50;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       sl=400;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       sl=100;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgActionPerformed
       sl=40;
    }//GEN-LAST:event_bgActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b14ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b24ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b26ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b29ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b30ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b31ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b32ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b33ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b35ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b36ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b37ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b38ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b39ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b40ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b45ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b46ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b47ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed
        public static void main(String args[]) {
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        game2 g2=new game2();
        g2.setVisible(true);  
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bbl;
    private javax.swing.JButton bbr;
    private javax.swing.JButton bg;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton e1;
    private javax.swing.JButton e10;
    private javax.swing.JButton e11;
    private javax.swing.JButton e12;
    private javax.swing.JButton e13;
    private javax.swing.JButton e14;
    private javax.swing.JButton e15;
    private javax.swing.JButton e16;
    private javax.swing.JButton e17;
    private javax.swing.JButton e18;
    private javax.swing.JButton e19;
    private javax.swing.JButton e2;
    private javax.swing.JButton e20;
    private javax.swing.JButton e21;
    private javax.swing.JButton e22;
    private javax.swing.JButton e23;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton e8;
    private javax.swing.JButton e9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p10;
    private javax.swing.JButton p11;
    private javax.swing.JButton p12;
    private javax.swing.JButton p13;
    private javax.swing.JButton p14;
    private javax.swing.JButton p15;
    private javax.swing.JButton p16;
    private javax.swing.JButton p17;
    private javax.swing.JButton p18;
    private javax.swing.JButton p19;
    private javax.swing.JButton p2;
    private javax.swing.JButton p20;
    private javax.swing.JButton p21;
    private javax.swing.JButton p22;
    private javax.swing.JButton p23;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JButton q1;
    private javax.swing.JButton q10;
    private javax.swing.JButton q11;
    private javax.swing.JButton q12;
    private javax.swing.JButton q13;
    private javax.swing.JButton q14;
    private javax.swing.JButton q15;
    private javax.swing.JButton q16;
    private javax.swing.JButton q17;
    private javax.swing.JButton q18;
    private javax.swing.JButton q19;
    private javax.swing.JButton q2;
    private javax.swing.JButton q20;
    private javax.swing.JButton q21;
    private javax.swing.JButton q22;
    private javax.swing.JButton q23;
    private javax.swing.JButton q3;
    private javax.swing.JButton q4;
    private javax.swing.JButton q5;
    private javax.swing.JButton q6;
    private javax.swing.JButton q7;
    private javax.swing.JButton q8;
    private javax.swing.JButton q9;
    private javax.swing.JButton u1;
    private javax.swing.JButton u10;
    private javax.swing.JButton u11;
    private javax.swing.JButton u12;
    private javax.swing.JButton u13;
    private javax.swing.JButton u14;
    private javax.swing.JButton u15;
    private javax.swing.JButton u16;
    private javax.swing.JButton u17;
    private javax.swing.JButton u18;
    private javax.swing.JButton u19;
    private javax.swing.JButton u2;
    private javax.swing.JButton u20;
    private javax.swing.JButton u21;
    private javax.swing.JButton u22;
    private javax.swing.JButton u23;
    private javax.swing.JButton u3;
    private javax.swing.JButton u4;
    private javax.swing.JButton u5;
    private javax.swing.JButton u6;
    private javax.swing.JButton u7;
    private javax.swing.JButton u8;
    private javax.swing.JButton u9;
    private javax.swing.JButton w1;
    private javax.swing.JButton w10;
    private javax.swing.JButton w11;
    private javax.swing.JButton w12;
    private javax.swing.JButton w13;
    private javax.swing.JButton w14;
    private javax.swing.JButton w15;
    private javax.swing.JButton w16;
    private javax.swing.JButton w17;
    private javax.swing.JButton w18;
    private javax.swing.JButton w19;
    private javax.swing.JButton w2;
    private javax.swing.JButton w20;
    private javax.swing.JButton w21;
    private javax.swing.JButton w22;
    private javax.swing.JButton w23;
    private javax.swing.JButton w3;
    private javax.swing.JButton w4;
    private javax.swing.JButton w5;
    private javax.swing.JButton w6;
    private javax.swing.JButton w7;
    private javax.swing.JButton w8;
    private javax.swing.JButton w9;
    private javax.swing.JButton x;
    private javax.swing.JButton x1;
    private javax.swing.JButton x10;
    private javax.swing.JButton x11;
    private javax.swing.JButton x12;
    private javax.swing.JButton x13;
    private javax.swing.JButton x14;
    private javax.swing.JButton x15;
    private javax.swing.JButton x2;
    private javax.swing.JButton x3;
    private javax.swing.JButton x4;
    private javax.swing.JButton x5;
    private javax.swing.JButton x6;
    private javax.swing.JButton x7;
    private javax.swing.JButton x8;
    private javax.swing.JButton x9;
    private javax.swing.JButton y1;
    private javax.swing.JButton y10;
    private javax.swing.JButton y11;
    private javax.swing.JButton y12;
    private javax.swing.JButton y13;
    private javax.swing.JButton y14;
    private javax.swing.JButton y15;
    private javax.swing.JButton y16;
    private javax.swing.JButton y17;
    private javax.swing.JButton y18;
    private javax.swing.JButton y19;
    private javax.swing.JButton y2;
    private javax.swing.JButton y20;
    private javax.swing.JButton y21;
    private javax.swing.JButton y22;
    private javax.swing.JButton y23;
    private javax.swing.JButton y3;
    private javax.swing.JButton y4;
    private javax.swing.JButton y5;
    private javax.swing.JButton y6;
    private javax.swing.JButton y7;
    private javax.swing.JButton y8;
    private javax.swing.JButton y9;
    // End of variables declaration//GEN-END:variables
}
