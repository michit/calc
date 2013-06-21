package calc;

import javax.swing.JTextArea;

public class TextArea extends JTextArea {

	private static final long serialVersionUID = 1L;
//	private String text;
	private double num = 0;
	private NumArea numArea;
//　sin,cos,etcFlag
	private boolean SKflag = false;
//kakko 数あわせる
	private int kakkomihari=0;
	public TextArea(String text,NumArea numArea){
	//	super.setText(text);
		this.numArea = numArea;
	}


/** *-/+ */ 
	public void addOp(String opStr) {
		String n = numArea.getValu();
		if(n != "0"){
			super.setText(super.getText() + n + opStr);
		}
		else super.setText(super.getText() + opStr);
	}
/** sin con tan arc~ */
	public void addSankaku(String sankaku) {
		String n = numArea.getValu();
		if(n != "0" ){
			super.setText(super.getText() + n + "*" + sankaku + "(");
		}
		else super.setText(super.getText() + sankaku + "(");
		SKflag = true;
	}
/** () */
	public void addkakko(String kakko) {
		//(の数を一応数えておく。=が押された時に調整すればいいかなあ
		if(kakko.equalsIgnoreCase("(")){kakkomihari++;}

		String n = numArea.getValu();
		if(n != "0" && kakko.equalsIgnoreCase("(") ){
			super.setText(super.getText() + n + "*" + kakko);
		}
		else if(n != "0" && kakko.equalsIgnoreCase(")") ){
			super.setText(super.getText() + n + kakko);
		}
		else super.setText(super.getText() + kakko);
	}
	
	public void addjosu(String josu) {
		String n = numArea.getValu();
		if(n == "0" ){
			super.setText(super.getText() + josu + "(");
		}
		else super.setText(super.getText() + n + josu + "(");
	}
	
	public void addtaisu(String taisu) {
		String n = numArea.getValu();
		if(n != "0" ){
			super.setText(super.getText() + n + "*" + taisu + "(");
		}
		else super.setText(super.getText() + taisu + "(");
	}
	
	public void addroot(String root) {
		String n = numArea.getValu();
	if(n != "0" ){
		super.setText(super.getText() + n + "*" + root + "(");
	}
	else super.setText(super.getText() + root + "(");
	}
	
	public void addcons(String cons) {
		String n = numArea.getValu();
		if(n != "0" ){
			super.setText(super.getText() + n + "*" + cons);
		}
		else super.setText(super.getText() + cons );		
	}
	
	/** clear */
	
	public void clear() {
		super.setText("");
		// TODO 自動生成されたメソッド・スタブ
	}

	/** delete function */
	public void subStr() {
		int a = super.getText().length() - 1;
		if(a >= 0){
			super.setText(super.getText().substring(0,a));
		}
		if(super.getText().length() == 0){
			super.setText("");
		}
	}


	


	


	


	



	



}
