import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.net.*;
import javax.sql.*;

public class porcentajetiempo extends Thread
{


public static int i=4,j; 
public static double a,b,suma,pora,porb;
public static String spora,sporb;
public static JButton ba,bb,bdet,bacci;
public static JFrame framemain;
public static JLabel la,lb,linfo;
public static Color color;

public  void igumain()
{
	ba= new JButton("Grupo A");
	ba.setBackground(color.blue);
	ba.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){grupoa();}});
	bb= new JButton("Grupo B");
	bb.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){grupob();}});
	bb.setBackground(color.red);
	bdet= new JButton("Detener");
	bdet.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){det();}});

	la= new JLabel("");
	lb= new JLabel("");
	linfo= new JLabel("Este programa calcula el porcentaje de tiempo entre dos variables");
	
	framemain= new JFrame("Porcentaje tiempo");
	framemain.add(linfo);
	framemain.add(ba);
	framemain.add(bb);
	framemain.add(bdet);
	framemain.add(la);
	framemain.add(lb);
	
	framemain.reshape(400,100,400,130);
	framemain.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	framemain.show();
	porcentajetiempo t=new porcentajetiempo(); t.start();
}
public void  grupoa()
{

i=1;
	
}

public void grupob()
{
i=0;

	
}

public  void det()
{
i=2;
}

public  void run()
{
try
{

while(i!=2)	
{

	while(i==1)
	{
		Thread.sleep(1000);
		a=a+1;
	}
		
	while(i==0)	
	{
		Thread.sleep(1000);
		b=b+1;
	}
	
}
	if(i==2)
	{
	suma=a+b;
	pora=(a*100)/suma;	
	porb=(b*100)/suma;
	spora=Double.toString(pora);
	sporb=Double.toString(porb);
	la.setText("Tiempo A : "+spora+" %");	
	lb.setText("Tiempo B : "+sporb+" %");	
	}
}catch(Exception e){}
}

public static void main (String[]args)
{
porcentajetiempo t=new porcentajetiempo();
t.igumain();
}
}