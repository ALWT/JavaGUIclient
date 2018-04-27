import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import classes.Medicament;

public class TotalChange implements ActionListener {
 private Medicament m;
 private String op;
 private Main main;
 private JTextField quantity;
 
	public TotalChange(Main main,Medicament m,String op,JTextField quantity) {
		super();
		this.m=m;
		this.op=op;
		this.main=main;
		this.quantity=quantity;
	}

	public void actionPerformed(ActionEvent arg0) {
		try{System.out.println(this.quantity.getText());
			int quant=Integer.parseInt(quantity.getText());
			if(op=="+")
			{main.total+=quant*m.getPret();
			main.sp.add(new SoldProduct(m,Integer.parseInt(quantity.getText())));
			}
		if(op=="-"&&main.total>=quant*m.getPret())
			main.total-=quant*m.getPret();
		main.calc_total();
		}
		catch(Exception e)
		{e.printStackTrace();}
	}

}
