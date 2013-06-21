package calc;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Calc extends JFrame{
	
	private static final long serialVersionUID = 1L;

	
	private NumButton[]		numButton;	
	private OpButton[]			opButton;
	private EqualButton		equalButton;
	private DotButton			dotButton;
	private KakkoButton[]		kakkoButton;
	private SankakuButton[]	sankakuButton;
	private TaisuButton[]		taisuButton;
	private ConstButton[]		constButton;
	private JosuButton			josuButton;
	private ClearButton		clearButton;
	private DeleteButton		deleteButton;
	private PuramaiButton		puramaiButton;
	private RootButton			rootButton;
	private UnknownButton[]	unknownButton;
	private NumArea numArea;
	private TextArea textArea;
	
	
	/** icon */
	private ImageIcon numbutton0 = new ImageIcon("src/calc/img/000.png");
	private ImageIcon numbutton1 = new ImageIcon("src/calc/img/111.png");
	private ImageIcon numbutton2 = new ImageIcon("src/calc/img/222.png");
	private ImageIcon numbutton3 = new ImageIcon("src/calc/img/333.png");
	private ImageIcon numbutton4 = new ImageIcon("src/calc/img/444.png");
	private ImageIcon numbutton5 = new ImageIcon("src/calc/img/555.png");
	private ImageIcon numbutton6 = new ImageIcon("src/calc/img/666.png");
	private ImageIcon numbutton7 = new ImageIcon("src/calc/img/777.png");
	private ImageIcon numbutton8 = new ImageIcon("src/calc/img/888.png");
	private ImageIcon numbutton9 = new ImageIcon("src/calc/img/999.png");
	private ImageIcon[] numButtons = {numbutton0,numbutton1,numbutton2,numbutton3,numbutton4,numbutton5,numbutton6,numbutton7,numbutton8,numbutton9};
	private ImageIcon puicon = new ImageIcon("src/calc/img/pu.png");
	private ImageIcon miicon = new ImageIcon("src/calc/img/ma.png");
	private ImageIcon kaicon = new ImageIcon("src/calc/img/ka.png");
	private ImageIcon waicon = new ImageIcon("src/calc/img/wa.png");
	private ImageIcon piicon = new ImageIcon("src/calc/img/pi.png");
	private ImageIcon eicon = new ImageIcon("src/calc/img/e.png");
	private ImageIcon rooticon = new ImageIcon("src/calc/img/root.png");
	private ImageIcon josuicon = new ImageIcon("src/calc/img/josu.png");
	private ImageIcon Cicon = new ImageIcon("src/calc/img/CCC.png");
	private ImageIcon Ricon = new ImageIcon("src/calc/img/Rkakko.png");
	private ImageIcon Licon = new ImageIcon("src/calc/img/Lkakko.png");
	private ImageIcon pmicon = new ImageIcon("src/calc/img/puramai.png");
	private ImageIcon doticon = new ImageIcon("src/calc/img/dot.png");
	private ImageIcon sinicon = new ImageIcon("src/calc/img/sin.png");
	private ImageIcon cosicon = new ImageIcon("src/calc/img/cos.png");
	private ImageIcon tanicon = new ImageIcon("src/calc/img/tan.png");
	private ImageIcon asinicon = new ImageIcon("src/calc/img/asin.png");
	private ImageIcon acosicon = new ImageIcon("src/calc/img/acos.png");
	private ImageIcon atanicon = new ImageIcon("src/calc/img/atan.png");
	private ImageIcon logicon = new ImageIcon("src/calc/img/log.png");
	private ImageIcon lnicon = new ImageIcon("src/calc/img/ln.png");
	private ImageIcon delicon = new ImageIcon("src/calc/img/del.png");
	private ImageIcon eqicon = new ImageIcon("src/calc/img/eq.png");
	private ImageIcon cp = new ImageIcon("src/calc/img/cp.png");
	JLabel cplabel = new JLabel(cp);
	


	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.setVisible(true);
	}
	
	public Calc(){
		initField();
		initGUI();
	}


	public void initField(){
		textArea = new TextArea("0",numArea);
		numArea = new NumArea(textArea);
		textArea = new TextArea("0",numArea);
		textArea.setFont(new Font("Arial",Font.ITALIC,30));
		numArea.setFont(new Font("Arial",Font.ITALIC,20));
		numArea.setHorizontalAlignment(JLabel.RIGHT);
//-------------- button ---------------------------------------------		
		numButton = new NumButton[10];
		for (int i = 0; i < 10; i++){
			numButton[i] = new NumButton(i,textArea,numArea);
			numButton[i].setIcon(numButtons[i]);
			numButton[i].setHorizontalTextPosition(JButton.CENTER);
			add(numButton[i]);
		}
		opButton			= new OpButton[4];
		opButton[0] 		= new OpButton("+",textArea);
		opButton[1] 		= new OpButton("-",textArea);
		opButton[2] 		= new OpButton("*",textArea);
		opButton[3] 		= new OpButton("/",textArea);
		equalButton			= new EqualButton();
		dotButton			= new DotButton(textArea,numArea);
		kakkoButton 		= new KakkoButton[2];
		kakkoButton[0]		= new KakkoButton("(",textArea);
		kakkoButton[1]		= new KakkoButton(")",textArea);
		sankakuButton		= new SankakuButton[6];
		sankakuButton[0]	= new SankakuButton("sin",textArea);
		sankakuButton[1]	= new SankakuButton("cos",textArea);
		sankakuButton[2]	= new SankakuButton("tan",textArea);
		sankakuButton[3]	= new SankakuButton("arcsin",textArea);		//騾�ｸ芽ｧ帝未謨ｰ not csc, sec, cot
		sankakuButton[4]	= new SankakuButton("arccos",textArea);
		sankakuButton[5]	= new SankakuButton("arctan",textArea);
		taisuButton			= new TaisuButton[2];
		taisuButton[0]		= new TaisuButton("log",textArea);
		taisuButton[1]		= new TaisuButton("ln",textArea);
		constButton			= new ConstButton[2];
		constButton[0]		= new ConstButton("pi",textArea);
		constButton[1]		= new ConstButton("e",textArea);
		josuButton			= new JosuButton(textArea);
		clearButton			= new ClearButton(textArea,numArea);
		deleteButton		= new DeleteButton(textArea,numArea);
		puramaiButton		= new PuramaiButton(numArea);
		rootButton			= new RootButton(textArea);
		unknownButton		= new UnknownButton[3];
		unknownButton[0]	= new UnknownButton(" ");
		unknownButton[1]	= new UnknownButton(" ");
		unknownButton[2]	= new UnknownButton(" ");
		

		
		

//-------------------------------------------------------------------

	}

	private void initGUI() {
		
		setSize(540,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		textArea.setBounds(40,20,450,60);
		add(textArea);
		numArea.setBounds(40,80,450,30);
		numArea.setOpaque(false);
		add(numArea);
		
//---------- Button no haichi ---------------------------------------------------------

		constButton[0].setBounds(40, 115,60,60);
		constButton[1].setBounds(105, 115,60,60);
		rootButton.setBounds(170,115,60,60);
		josuButton.setBounds(235,115,60,60);
		deleteButton.setBounds(365,115,60,60);
		clearButton.setBounds(430,115,60,60);
		
		sankakuButton[0].setBounds(40,180,60,60);
		sankakuButton[3].setBounds(105,180,60,60);
		numButton[7].setBounds(170,180,60,60);
		numButton[8].setBounds(235,180,60,60);
		numButton[9].setBounds(300,180,60,60);
		kakkoButton[0].setBounds(365,180,60,60);
		kakkoButton[1].setBounds(430,180,60,60);
		

		sankakuButton[1].setBounds(40,245,60,60);
		sankakuButton[4].setBounds(105,245,60,60);
		numButton[4].setBounds(170,245,60,60);
		numButton[5].setBounds(235,245,60,60);
		numButton[6].setBounds(300,245,60,60);
		opButton[0].setBounds(365,245,60,60);
		opButton[2].setBounds(430,245,60,60);

		sankakuButton[2].setBounds(40,310,60,60);
		sankakuButton[5].setBounds(105,310,60,60);
		numButton[1].setBounds(170,310,60,60);
		numButton[2].setBounds(235,310,60,60);
		numButton[3].setBounds(300,310,60,60);
		opButton[1].setBounds(365,310,60,60);
		opButton[3].setBounds(430,310,60,60);

		taisuButton[0].setBounds(40,375,60,60);
		taisuButton[1].setBounds(105,375,60,60);
		numButton[0].setBounds(170,375,60,60);
		dotButton.setBounds(235,375,60,60);
		puramaiButton.setBounds(300,375,60,60);		
		equalButton.setBounds(365,375,120,60);		
		cplabel.setBounds(310,435,180,30);
		add(cplabel);
		
//---------------------------------------------------
		
		constButton[0].setIcon(piicon);
		constButton[0].setHorizontalTextPosition(JButton.CENTER);
		add(constButton[0]);
		constButton[1].setIcon(eicon);
		constButton[1].setHorizontalTextPosition(JButton.CENTER);
		add(constButton[1]);
		rootButton.setIcon(rooticon);
		rootButton.setHorizontalTextPosition(JButton.CENTER);
		add(rootButton);
		josuButton.setIcon(josuicon);
		josuButton.setHorizontalTextPosition(JButton.CENTER);
		add(josuButton);
		deleteButton.setIcon(delicon);
		deleteButton.setHorizontalTextPosition(JButton.CENTER);
		add(deleteButton);
		clearButton.setIcon(Cicon);
		clearButton.setHorizontalTextPosition(JButton.CENTER);
		add(clearButton);
		equalButton.setIcon(eqicon);
		equalButton.setHorizontalTextPosition(JButton.CENTER);
		add(equalButton);
		
		kakkoButton[0].setIcon(Licon);
		kakkoButton[0].setHorizontalTextPosition(JButton.CENTER);
		add(kakkoButton[0]);
		kakkoButton[1].setIcon(Ricon);
		kakkoButton[1].setHorizontalTextPosition(JButton.CENTER);
		add(kakkoButton[1]);
		
		opButton[0].setIcon(puicon);
		opButton[0].setHorizontalTextPosition(JButton.CENTER);
		add(opButton[0]);
		opButton[1].setIcon(miicon);
		opButton[1].setHorizontalTextPosition(JButton.CENTER);
		add(opButton[1]);
		opButton[2].setIcon(kaicon);
		opButton[2].setHorizontalTextPosition(JButton.CENTER);
		add(opButton[2]);
		opButton[3].setIcon(waicon);
		opButton[3].setHorizontalTextPosition(JButton.CENTER);
		add(opButton[3]);
		
		
		dotButton.setIcon(doticon);
		dotButton.setHorizontalTextPosition(JButton.CENTER);
		add(dotButton);
		puramaiButton.setIcon(pmicon);
		puramaiButton.setHorizontalTextPosition(JButton.CENTER);
		add(puramaiButton);	
		
		taisuButton[0].setIcon(logicon);
		taisuButton[0].setHorizontalTextPosition(JButton.CENTER);
		add(taisuButton[0]);
		taisuButton[1].setIcon(lnicon);
		taisuButton[1].setHorizontalTextPosition(JButton.CENTER);
		add(taisuButton[1]);
		

		sankakuButton[0].setIcon(sinicon);
		sankakuButton[0].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[0]);
		sankakuButton[1].setIcon(cosicon);
		sankakuButton[1].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[1]);
		sankakuButton[2].setIcon(tanicon);
		sankakuButton[2].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[2]);
		sankakuButton[3].setIcon(asinicon);
		sankakuButton[3].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[3]);
		sankakuButton[4].setIcon(acosicon);
		sankakuButton[4].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[4]);
		sankakuButton[5].setIcon(atanicon);
		sankakuButton[5].setHorizontalTextPosition(JButton.CENTER);
		add(sankakuButton[5]);
		
		/* 一時撤退
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		this.setResizable(false);	//windowsize fixed
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = c.weighty = 1;
		c.gridx = GridBagConstraints.RELATIVE;
		
		c.gridy = 1;
		c.gridwidth = 1;
		add(constButton[0],c);
		add(constButton[1],c);
		add(rootButton,c);
		add(josuButton,c);
		add(unknownButton[0],c);
		add(deleteButton,c);
		add(clearButton,c);

		numButton[0].setIcon(icon0);
		add(numButton[0]);
		c.gridy = 2;
		add(sankakuButton[0],c);
		add(sankakuButton[3],c);
		add(numButton[7],c);
		add(numButton[8],c);
		add(numButton[9],c);
		add(kakkoButton[0],c);
		add(kakkoButton[1],c);

		c.gridy = 3;
		add(sankakuButton[1],c);
		add(sankakuButton[4],c);
		add(numButton[4],c);
		add(numButton[5],c);
		add(numButton[6],c);
		add(opButton[0],c);
		add(opButton[1],c);
		

		c.gridy = 4;
		add(sankakuButton[2],c);
		add(sankakuButton[5],c);
		add(numButton[1],c);
		add(numButton[2],c);
		add(numButton[3],c);
		add(opButton[2],c);
		add(opButton[3],c);

		c.gridy = 5;
		add(taisuButton[0],c);
		add(taisuButton[1],c);
		add(numButton[0],c);
		add(dotButton,c);
		add(puramaiButton,c);
		c.gridwidth = 2;
		add(equalButton,c);
	*/
		
		
	}
}
