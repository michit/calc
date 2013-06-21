package calc;

import javax.swing.*;

public class NumArea extends JLabel {

	private static final long serialVersionUID = 1L;
//	private String text;
	public double waru;
	private int numlen = 0;
	private TextArea textArea;
	
	
	public NumArea(TextArea textArea){
		super.setText("0");
		this.textArea = textArea;
	}
	
	
	public void addnum(int i) {
	    if(numlen < 7){
			String b = super.getText();
			if( b.equals("0") ){
				super.setText(Integer.toString(i));
			}
			else{
				super.setText(super.getText() + Integer.toString(i));
			}
			numlen++;
		}
		System.out.println(numlen);
	}
	
	
	public void addDot() {
		if(super.getText().indexOf(".") == -1)
			{super.setText(super.getText() + "." );}
		System.out.println(numlen);
	}

	public int subStr() {
		int i = 0;
		int a = super.getText().length() - 1;
		if(a >= 0){
			if(numlen > 0 && super.getText().indexOf(".") == -1)numlen--;
			super.setText(super.getText().substring(0,a));

		}
		if(super.getText().length() == 0){
			super.setText("0");
			i = 1;
		}
		
		return i;
	}

	public void pm() {
		double pm =Double.valueOf(super.getText());
		pm = -pm;
		if(super.getText().indexOf(".") == -1){
		int pmi = (int)pm;
		super.setText(Integer.toString(pmi));
		}
		else {super.setText(Double.toString(pm));}
		System.out.println(pm);
	}
	
	public void clear() {
		numlen = 0;
		super.setText("0");
		// TODO 自動生成されたメソッド・スタブ
		
	}


	public String getValu() {
		String a = super.getText();
		clear();
		return a;
	}


}
