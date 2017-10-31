import java.awt.*;
import java.lang.*;
import java.awt.event.*;

class Calculator extends Frame implements WindowListener ,ActionListener
{   
     Button bsqr,bc,bx,bd,bm,b7,b8,b9,bs,b4,b5,b6,ba,b1,b2,b3,br,b0,bp,bexp,bx2,bxy,binv,bsin,bcos,btan,brad,bdeg;
	 TextField tf;
boolean is_inv=false;
boolean is_sin=false;
boolean is_cos=false;
boolean is_tan=false;
boolean is_rad=false;
boolean is_deg=false;
                   boolean is_x2=false;
                   boolean is_xy=false;
                   boolean is_exp=false;
	 boolean is_sqrt=false; 
	 boolean is_add=false; 
	 boolean is_sub=false;
	 boolean is_mul=false;
	 boolean is_div=false;
	 boolean is_frac=false;
	 boolean dp = true;
	 double op1;
	 double op2;
	 double result;
	 StringBuffer msg=new StringBuffer();
	 
	Calculator()
	{ 
	
	  Font ft = new Font("Digital-7",0,25);
	Color c = new Color(224,224,224);   
	  setBackground(c);
	 tf=new TextField();
	 tf.setFont(ft);
	 bc = new Button("C");
	 bc.addActionListener(this);
	 bx = new Button("X");
	 bx.addActionListener(this);
	 bd = new Button("/");
	 bd.addActionListener(this);
	 
                   bsqr = new Button("sqrt");
	 bsqr.addActionListener(this);
bm = new Button("*");	 
bm.addActionListener(this);
	 b7 = new Button("7");
	 b7.addActionListener(this);
	 b8 = new Button("8");
	 b8.addActionListener(this);
	 b9 = new Button("9");
	 b9.addActionListener(this); 
	 bs = new Button("-");
	 bs.addActionListener(this);
                   bexp=new Button("e^x");
                   bexp.addActionListener(this);
	 b4 = new Button("4");
	 b4.addActionListener(this);
	 b5 = new Button("5");
	 b5.addActionListener(this);
	 b6 = new Button("6");
	 b6.addActionListener(this);
	 ba = new Button("+");
	 ba.addActionListener(this);
	 b1= new Button("1");
	 b1.addActionListener(this);
	 b2= new Button("2");
	 b2.addActionListener(this);	 
	 b3= new Button("3");
	 b3.addActionListener(this);
bx2= new Button("x^2");
	 bx2.addActionListener(this);
	 br=new Button("=");
	 br.addActionListener(this);
	 b0 = new Button("0");
	 b0.addActionListener(this);
	 bp =new Button(".");
	 bp.addActionListener(this);
binv = new Button("1/x");
	 binv.addActionListener(this);
bsin= new Button("sin");
	 bsin.addActionListener(this);
bcos = new Button("cos");
	 bcos.addActionListener(this);
btan = new Button("tan");
	 btan.addActionListener(this);
brad= new Button("rad");
	 brad.addActionListener(this);
bdeg = new Button("deg");
	 bdeg.addActionListener(this);
bxy= new Button("x^y");
	 bxy.addActionListener(this);

	 /********************line 1 ************************/
	 tf.setBounds(10,50,290,38);
	 bc.setBounds(10,93,51,40);
	 bx.setBounds(70,93,51,40);
	 bd.setBounds(130,93,51,40);
	 bm.setBounds(190,93,51,40);
	 ba.setBounds(250,93,51,40);
/**************************************line 2********************/
	 b7.setBounds(10,193,51,40);
	 b8.setBounds(70,193,51,40);
	 b9.setBounds(130,193,51,40);
	 bdeg.setBounds(190,193,51,40);
                    bexp.setBounds(250,193,51,40);
/*********************************line 3****************************/
     b4.setBounds(10,243,51,40); 
	 b5.setBounds(70,243,51,40); 
	 b6.setBounds(130,243,51,40); 
	 bsqr.setBounds(190,243,51,40);
                    binv.setBounds(250,243,51,40);
/********************************line 4**********************/

     b1.setBounds(10,293,51,40);
	 b2.setBounds(70,293,51,40);
	 b3.setBounds(130,293,51,40);
                   bx2.setBounds(190,293,51,40);
	 br.setBounds(250,293,51,90);
/********************************line 5 *******************/	 

/********************************line 6**********************/

     bsin.setBounds(10,143,51,40);
	 bcos.setBounds(70,143,51,40);
	 btan.setBounds(130,143,51,40);
                   brad.setBounds(190,143,51,40);
	 bs.setBounds(250,143,51,40);



/************************************************************/	
  b0.setBounds(10,343,112,40);
  bp.setBounds(130,343,51,40);
  bxy.setBounds(190,343,51,40); 

     add(tf);
	 add(bx);
     add(bc);
     add(bd);
     add(bm);
    add(bsqr);
/*************************************************************/
     add(b7);
     add(b8);
     add(b9);
     add(bs);
     add(bexp);
/************************line 3***********************************/	

     add(b4); 
	 add(b5);
	 add(b6);
	 add(ba);
                    add(binv);
	 /**********************line 4************************/
	 add(b1); 
	 add(b2);
	 add(b3);
                   add(bx2);
	 add(br);
	 /**********************line 5************************/
	 add(b0);
	 add(bp);
                   add(bxy);
 /**********************line 6************************/
	 add(bsin); 
	 add(bcos);
	 add(btan);
                   add(brad);
	 add(bdeg);
     setLayout(null);	 
	addWindowListener(this);	
		
		
		
	}
/****************** Listener for Window****************/
public void	windowActivated(WindowEvent e){}
public void	windowClosed(WindowEvent e){}
public void	windowClosing(WindowEvent e){System.exit(0);}
public void	windowDeactivated(WindowEvent e){}
public void	windowDeiconified(WindowEvent e){}
public void	windowIconified(WindowEvent e){}
public void	windowOpened(WindowEvent e){}
/*******************************************************/


/************LISTENER FOR BUTTONS*****************************/
    public void actionPerformed(ActionEvent e)
	{
	   if(e.getSource()==b0)
	   {
		 msg.append("0");
		 tf.setText(msg.toString());
	    }
     if(e.getSource()==b1)
	   {
		 msg.append("1");
		 tf.setText(msg.toString());
	    }			
		if(e.getSource()==bc)
		{
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 dp=true;
		}
		if(e.getSource()==bx)
		{
		  int i;
		  i=msg.length();
		  msg =msg.deleteCharAt(i-1);
		/* msg.toString() = msg.toString().substring(0,i-1);*/
		 tf.setText(msg.toString());
		 dp=true;
		}
		  if(e.getSource()==b2)
	   {
		 msg.append("2");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b3)
	   {
		 msg.append("3");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b4)
	   {
		 msg.append("4");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b5)
	   {
		 msg.append("5");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b6)
	   {
		 msg.append("6");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b7)
	   {
		 msg.append("7");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b8)
	   {
		 msg.append("8");
		 tf.setText(msg.toString());
	    }
		  if(e.getSource()==b9)
	   {
		 msg.append("9");
		 tf.setText(msg.toString());
	    }
		if(e.getSource()==ba)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_add=true;
		 dp=true;
	    }
		
		if(e.getSource()==bs)
	   {
		 op1 = Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_sub=true;
		 dp=true;
	    }
		if(e.getSource()==bm)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_mul=true;
		 dp=true;
	    }
if(e.getSource()==bd)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_div=true;
		 dp=true;
	    }

		if(e.getSource()==bsqr)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_sqrt=true;
		 dp=true;
	    }
if(e.getSource()==bexp)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_exp=true;
		 dp=true;
	    }

if(e.getSource()==bx2)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_x2=true;
		 dp=true;
	    }
if(e.getSource()==bxy)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_xy=true;
		 dp=true;
	    }
if(e.getSource()==binv)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_inv=true;
		 dp=true;
	    }
if(e.getSource()==bsin)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_sin=true;
		 dp=true;
	    }
if(e.getSource()==bcos)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_cos=true;
		 dp=true;
	    }
if(e.getSource()==btan)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_tan=true;
		 dp=true;
	    }
if(e.getSource()==brad)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_rad=true;
		 dp=true;
	    }
if(e.getSource()==bdeg)
	   {
		 op1 = Double.parseDouble(msg.toString());
		 msg.delete(0,msg.length());
		 tf.setText(msg.toString());
		 is_deg=true;
		 dp=true;
	    }
		if(e.getSource()==bp)
	   { if(dp)
		 msg.append(".");
		 tf.setText(msg.toString());
		 is_frac=true;
		 dp=false;
		 
	    }
		if(e.getSource()==br)
	   {dp=true;
		 if(is_add)
			 add();
		 if(is_sub)
			 sub();
		 if(is_mul)
			 mul();
		 if(is_div)
			 div();
	 if(is_sqrt)
			 sqrt();
                   if(is_exp)
                                                       expq();
                   if(is_x2)
                                                       square();
                     if(is_xy)
                                                       power();
                     if(is_inv)
                                                       inverse();
                     if(is_sin)
                                                       sine();
                     if(is_cos)
                                                       cosine();
                     if(is_tan)
                                                       tangent();
                     if(is_rad)
                                                       radian();
                     if(is_deg)
                                                       degree();
		 
	    }
		
		
		 				
	}
	void add()
	{
		op2= Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		result=op1+op2;
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		op1=0;
		op2=0;
		result=0;
		is_add=false;
		msg.delete(0,msg.length());
		
	}
	
	void sub()
	{
		op2= Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		result=op1-op2;
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		op2=0;
		result=0;
		is_sub=false;
		msg.delete(0,msg.length());
	}
	void mul()
	{
		op2= Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		result=op1*op2;
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		op2=0;
		result=0;
		is_mul=false;
		msg.delete(0,msg.length());
		
	}
	void div()
	{
		op2= Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		result=op1/op2;
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		op2=0;
		result=0;
		is_div=false;
		msg.delete(0,msg.length());
		
	}
                  void sqrt()
	{
		
		msg.delete(0,msg.length());
		result=Math.sqrt(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		result=0;
		is_sqrt=false;
		msg.delete(0,msg.length());
	}
	void expq()
	{
		
		msg.delete(0,msg.length());
		result=(double)Math.exp(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		result=0;
		is_exp=false;
		msg.delete(0,msg.length());
	}
	void square()
	{
		
		msg.delete(0,msg.length());
		result=(double)Math.pow(op1,2);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		result=0;
		is_x2=false;
		msg.delete(0,msg.length());
	}
	void power()
	{
		op2= Double.parseDouble(msg.toString());
		msg.delete(0,msg.length());
		result=(double)Math.pow(op1,op2);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
                                    op2=0;
		result=0;
		is_xy=false;
		msg.delete(0,msg.length());
	}
	void inverse()
	{
		msg.delete(0,msg.length());
		result=(double)(3/op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		result=0;
		is_inv=false;
		msg.delete(0,msg.length());
	}
void sine()
	{
		msg.delete(0,msg.length());
		result=(double)Math.sin(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
                                    
		result=0;
		is_sin=false;
		msg.delete(0,msg.length());
	}
void cosine()
	{
		
		msg.delete(0,msg.length());
		result=(double)Math.cos(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
                                  
		result=0;
		is_cos=false;
		msg.delete(0,msg.length());
	}
void tangent()
	{
		
		msg.delete(0,msg.length());
		result=(double)Math.tan(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
                                    
		result=0;
		is_tan=false;
		msg.delete(0,msg.length());
	}
void radian()
	{
		
		msg.delete(0,msg.length());
		result=(double)Math.toRadians(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
                                    
		result=0;
		is_rad=false;
		msg.delete(0,msg.length());
	}
void degree()
	{
		msg.delete(0,msg.length());
		result=(double)Math.toDegrees(op1);
		long res=(long)result;
		if(is_frac)
		{
			Double d = new Double(result);
			msg.append(d.toString());
			tf.setText(msg.toString());
		}
		else
		{
			Long d = new Long(res);
			msg.append(d.toString());
			tf.setText(msg.toString());
			
		}
		
		op1=0;
		result=0;
		is_deg=false;
		msg.delete(0,msg.length());
	}
	public static void main(String args[])
	{
      Calculator calc = new Calculator();
      calc.setTitle("MY CALCULATOR");
      calc.setSize(310,400);
	  calc.setResizable(false);
      calc.setVisible(true);	  
	}

}