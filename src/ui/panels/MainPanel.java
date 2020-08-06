package ui.panels;

import controller.Controller;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static ui.Window.BG;

public class MainPanel extends Panel{

    public static final int PANEL_WIDTH = 1200;
    public static final int PANEL_HEIGHT = 650;
    public static final int MARGIN = 20;

    public static final String A = "A";
    public static final String B = "B";
    public static final String C = "C";
    public static final String D = "D";
    public static final String E = "E";
    public static final String F = "F";
    public static final String G = "G";
    public static final String H = "H";
    public static final String I = "I";
    public static final String J = "J";
    public static final String K = "K";
    public static final String L = "L";
    public static final String M = "M";
    public static final String N = "N";
    public static final String Ñ = "Ñ";
    public static final String O = "O";
    public static final String P = "P";
    public static final String Q = "Q";
    public static final String R = "R";
    public static final String S = "S";
    public static final String T = "T";
    public static final String U = "U";
    public static final String V = "V";
    public static final String W = "W";
    public static final String X = "X";
    public static final String Y = "Y";
    public static final String Z = "Z";
    public static final String START = "START";
    public static final String RESTART = "RESTART";
    public static final String EXIT = "QUIT";

    private final int BUTTON_WIDTH_WORDS = 50;
    private final int JTEXTFIELD_WORD_HEIGHT = 50;

    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;
    private JButton btnE;
    private JButton btnF;
    private JButton btnG;
    private JButton btnH;
    private JButton btnI;
    private JButton btnJ;
    private JButton btnK;
    private JButton btnL;
    private JButton btnM;
    private JButton btnN;
    private JButton btnÑ;
    private JButton btnO;
    private JButton btnP;
    private JButton btnQ;
    private JButton btnR;
    private JButton btnS;
    private JButton btnT;
    private JButton btnU;
    private JButton btnV;
    private JButton btnW;
    private JButton btnX;
    private JButton btnY;
    private JButton btnZ;
    private JButton btnSTART;
    private JButton btnRESTART;
    private JButton btnQUIT;

    private JLabel finding;
    private JTextField namePlayer;
    private JTextField wordUsed;
    private JTextField scripts;

    private int buttonCounter;
    private int buttonCounter2;
    private int textCounter;

    public MainPanel(){
        super();
    }

    /**
     * Funcion que inicia los componentes del Panel
     */
    @Override
    protected void init() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(BG);

        btnA = new JButton(A);
        btnA.setActionCommand(A);
        int BUTTON_HEIGHT_WORDS = 50;
        btnA.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnA.setLocation( nextButtonLocation() );
        btnA.setFocusable(false);
        add(btnA);

        btnB = new JButton(B);
        btnB.setActionCommand(B);
        btnB.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnB.setLocation( nextButtonLocation() );
        btnB.setFocusable(false);
        add(btnB);

        btnC = new JButton(C);
        btnC.setActionCommand(C);
        btnC.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnC.setLocation( nextButtonLocation() );
        btnC.setFocusable(false);
        add(btnC);

        btnD = new JButton(D);
        btnD.setActionCommand(D);
        btnD.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnD.setLocation( nextButtonLocation() );
        btnD.setFocusable(false);
        add(btnD);

        btnE = new JButton(E);
        btnE.setActionCommand(E);
        btnE.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnE.setLocation( nextButtonLocation() );
        btnE.setFocusable(false);
        add(btnE);

        btnF = new JButton(F);
        btnF.setActionCommand(F);
        btnF.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnF.setLocation( nextButtonLocation() );
        btnF.setFocusable(false);
        add(btnF);

        btnG = new JButton(G);
        btnG.setActionCommand(G);
        btnG.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnG.setLocation( nextButtonLocation() );
        btnG.setFocusable(false);
        add(btnG);

        btnH = new JButton(H);
        btnH.setActionCommand(H);
        btnH.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnH.setLocation( nextButtonLocation() );
        btnH.setFocusable(false);
        add(btnH);

        btnI = new JButton(I);
        btnI.setActionCommand(I);
        btnI.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnI.setLocation( nextButtonLocation() );
        btnI.setFocusable(false);
        add(btnI);

        btnJ = new JButton(J);
        btnJ.setActionCommand(J);
        btnJ.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnJ.setLocation( nextButtonLocation() );
        btnJ.setFocusable(false);
        add(btnJ);

        btnK = new JButton(K);
        btnK.setActionCommand(K);
        btnK.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnK.setLocation( nextButtonLocation() );
        btnK.setFocusable(false);
        add(btnK);

        btnL = new JButton(L);
        btnL.setActionCommand(L);
        btnL.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnL.setLocation( nextButtonLocation() );
        btnL.setFocusable(false);
        add(btnL);

        btnM = new JButton(M);
        btnM.setActionCommand(M);
        btnM.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnM.setLocation( nextButtonLocation() );
        btnM.setFocusable(false);
        add(btnM);

        btnN = new JButton(N);
        btnN.setActionCommand(N);
        btnN.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnN.setLocation( nextButtonLocation2() );
        btnN.setFocusable(false);
        add(btnN);

        btnÑ = new JButton(Ñ);
        btnÑ.setActionCommand(Ñ);
        btnÑ.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnÑ.setLocation( nextButtonLocation2() );
        btnÑ.setFocusable(false);
        add(btnÑ);

        btnO = new JButton(O);
        btnO.setActionCommand(O);
        btnO.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnO.setLocation( nextButtonLocation2() );
        btnO.setFocusable(false);
        add(btnO);

        btnP = new JButton(P);
        btnP.setActionCommand(P);
        btnP.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnP.setLocation( nextButtonLocation2() );
        btnP.setFocusable(false);
        add(btnP);

        btnQ = new JButton(Q);
        btnQ.setActionCommand(Q);
        btnQ.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnQ.setLocation( nextButtonLocation2() );
        btnQ.setFocusable(false);
        add(btnQ);

        btnR = new JButton(R);
        btnR.setActionCommand(R);
        btnR.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnR.setLocation( nextButtonLocation2() );
        btnR.setFocusable(false);
        add(btnR);

        btnS = new JButton(S);
        btnS.setActionCommand(S);
        btnS.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnS.setLocation( nextButtonLocation2() );
        btnS.setFocusable(false);
        add(btnS);

        btnT = new JButton(T);
        btnT.setActionCommand(T);
        btnT.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnT.setLocation( nextButtonLocation2() );
        btnT.setFocusable(false);
        add(btnT);

        btnU = new JButton(U);
        btnU.setActionCommand(U);
        btnU.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnU.setLocation( nextButtonLocation2() );
        btnU.setFocusable(false);
        add(btnU);

        btnV = new JButton(V);
        btnV.setActionCommand(V);
        btnV.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnV.setLocation( nextButtonLocation2() );
        btnV.setFocusable(false);
        add(btnV);

        btnW = new JButton(W);
        btnW.setActionCommand(W);
        btnW.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnW.setLocation( nextButtonLocation2() );
        btnW.setFocusable(false);
        add(btnW);

        btnX = new JButton(X);
        btnX.setActionCommand(X);
        btnX.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnX.setLocation( nextButtonLocation2() );
        btnX.setFocusable(false);
        add(btnX);

        btnY = new JButton(Y);
        btnY.setActionCommand(Y);
        btnY.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnY.setLocation( nextButtonLocation2() );
        btnY.setFocusable(false);
        add(btnY);

        btnZ = new JButton(Z);
        btnZ.setActionCommand(Z);
        btnZ.setSize(BUTTON_WIDTH_WORDS, BUTTON_HEIGHT_WORDS);
        btnZ.setLocation( nextButtonLocation2() );
        btnZ.setFocusable(false);
        add(btnZ);

        btnSTART = new JButton(START);
        btnSTART.setActionCommand(START);
        btnSTART.setFont(new Font("Arial", Font.BOLD,22));
        int BUTTON_WIDTH = 150;
        int BUTTON_HEIGHT = 60;
        btnSTART.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        btnSTART.setLocation( MARGIN, PANEL_HEIGHT - MARGIN - 80 );
        btnSTART.setFocusable(false);
        add(btnSTART);

        btnRESTART = new JButton(RESTART);
        btnRESTART.setActionCommand(RESTART);
        btnRESTART.setFont(new Font("Arial", Font.BOLD,22));
        btnRESTART.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        btnRESTART.setLocation( MARGIN + 280, PANEL_HEIGHT - MARGIN - 80 );
        btnRESTART.setFocusable(false);
        add(btnRESTART);

        btnQUIT = new JButton(EXIT);
        btnQUIT.setActionCommand(EXIT);
        btnQUIT.setFont(new Font("Arial", Font.BOLD,22));
        btnQUIT.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        btnQUIT.setLocation(PANEL_WIDTH / 2 -35, PANEL_HEIGHT - MARGIN - 80 );
        btnQUIT.setFocusable(false);
        add(btnQUIT);

        finding = new JLabel(" ");
        int JLABEL_WIDTH = 400;
        int JLABEL_HEIGHT = 580;
        finding.setSize(JLABEL_WIDTH, JLABEL_HEIGHT);
        finding.setLocation(750, MARGIN );
        finding.setBorder(new LineBorder(new Color(0,0,0),3,true));
        add(finding);

        JLabel titlePlayer = new JLabel("PLAYER NAME : ");
        titlePlayer.setFont(new Font("Arial", Font.BOLD, 18));
        titlePlayer.setForeground(Color.green);
        int JLABEL_TITLE_WIDTH = 200;
        int JLABEL_TITLE_HEIGHT = 40;
        titlePlayer.setSize(JLABEL_TITLE_WIDTH, JLABEL_TITLE_HEIGHT);
        titlePlayer.setLocation(nextTextLocation());
        add(titlePlayer, BorderLayout.NORTH);

        namePlayer = new JTextField();
        namePlayer.setFont(new Font("Serif", Font.PLAIN, 26));
        namePlayer.setForeground(Color.black);
        int JTEXTFIELD_WORD_WIDTH = 300;
        namePlayer.setSize(JTEXTFIELD_WORD_WIDTH,JTEXTFIELD_WORD_HEIGHT);
        namePlayer.setLocation(nextTextLocation());
        add(namePlayer);

        JLabel titleWordUsed = new JLabel("LETTERS USED : ");
        titleWordUsed.setFont(new Font("Arial", Font.BOLD, 18));
        titleWordUsed.setForeground(Color.green);
        titleWordUsed.setSize(JLABEL_TITLE_WIDTH, JLABEL_TITLE_HEIGHT);
        titleWordUsed.setLocation(nextTextLocation());
        add(titleWordUsed, BorderLayout.NORTH);

        wordUsed = new JTextField();
        wordUsed.setFont(new Font("Serif", Font.PLAIN, 20));
        wordUsed.setForeground(Color.black);
        wordUsed.setSize(JTEXTFIELD_WORD_WIDTH,JTEXTFIELD_WORD_HEIGHT);
        wordUsed.setLocation(nextTextLocation());
        add(wordUsed);

        JLabel titleScripts = new JLabel("LETTERS ASSERT : ");
        titleScripts.setFont(new Font("Arial", Font.BOLD, 18));
        titleScripts.setForeground(Color.green);
        titleScripts.setSize(JLABEL_TITLE_WIDTH, JLABEL_TITLE_HEIGHT);
        titleScripts.setLocation(nextTextLocation());
        add(titleScripts, BorderLayout.NORTH);

        scripts = new JTextField();
        scripts.setFont(new Font("Serif", Font.PLAIN, 20));
        scripts.setForeground(Color.black);
        scripts.setSize(JTEXTFIELD_WORD_WIDTH,JTEXTFIELD_WORD_HEIGHT);
        scripts.setLocation(nextTextLocation());
        add(scripts);
    }

    /**
     * Funcion que setea y envia los botones al Controller
     * @param controller tipo de dato Controller
     */
    @Override
    public void setController(Controller controller) {
        btnA.addActionListener(controller);
        btnB.addActionListener(controller);
        btnC.addActionListener(controller);
        btnD.addActionListener(controller);
        btnE.addActionListener(controller);
        btnF.addActionListener(controller);
        btnG.addActionListener(controller);
        btnH.addActionListener(controller);
        btnI.addActionListener(controller);
        btnJ.addActionListener(controller);
        btnK.addActionListener(controller);
        btnL.addActionListener(controller);
        btnM.addActionListener(controller);
        btnN.addActionListener(controller);
        btnÑ.addActionListener(controller);
        btnO.addActionListener(controller);
        btnP.addActionListener(controller);
        btnQ.addActionListener(controller);
        btnR.addActionListener(controller);
        btnS.addActionListener(controller);
        btnT.addActionListener(controller);
        btnU.addActionListener(controller);
        btnV.addActionListener(controller);
        btnW.addActionListener(controller);
        btnX.addActionListener(controller);
        btnY.addActionListener(controller);
        btnZ.addActionListener(controller);
        btnSTART.addActionListener(controller);
        btnRESTART.addActionListener(controller);
        btnQUIT.addActionListener(controller);
    }

    /**
     * Funcion que establece la posicion del siguiente Boton
     * de la primera linea de botones a dibujar en el Panel
     * @return la posicion del mismo
     */
    private Point nextButtonLocation(){
        return new Point(MARGIN + BUTTON_WIDTH_WORDS * buttonCounter++ , MARGIN + 350);
    }

    /**
     * Funcion que establece la posicion del siguiente Boton de la segunda linea de botones
     * @return la posicion del mismo
     */
    private Point nextButtonLocation2(){
        Point location = new Point(MARGIN + BUTTON_WIDTH_WORDS * buttonCounter2++ , MARGIN + 410);
        if (!isFirstButton()) {
            location.y += MARGIN;
        }
        return location;
    }

    /**
     * Funcion que establece la siguiente posicion del texto a dibujar en el Panel
     * @return la posicion del mismo
     */
    private Point nextTextLocation(){
        return new Point(MARGIN, JTEXTFIELD_WORD_HEIGHT * textCounter++ + 30);
    }

    /**
     * Funcion que devuelve si es el primer Boton a dibujar
     * @return retorna verdadero o falso
     */
    private boolean isFirstButton(){
        return buttonCounter == 1;
    }

    /**
     * Setea el texto a imprimir en Guiones
     * @param scripts recibe el string a imprimir
     */
    public void setScripts(String scripts) {
        this.scripts.setText(scripts);
    }

    /**
     * Recibe el nombre del jugador
     * @param namePlayer imprime por pantalla el nombre del jugador
     */
    public void setNamePlayer(String namePlayer) {
        this.namePlayer.setText(namePlayer);
    }

    /**
     * Recibe y setea la palabra que ha sido utilizada
     * @param wordUsed recibe esa letra y la imprime por pantalla
     */
    public void setWordUsed(String wordUsed) {
        this.wordUsed.setText(wordUsed);
    }

    /**
     * Funcion que recibe la imagen tipo jpg a mostrar por pantalla
     * @param finding recibe jpg del tipo ImageIcon
     */
    public void setFinding(ImageIcon finding) {
        this.finding.setIcon(finding);
    }
}
