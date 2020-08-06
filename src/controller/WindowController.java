package controller;

import manager.Game;
import messages.MessageInformation;
import ui.Window;
import ui.panels.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static ui.panels.MainPanel.*;

public class WindowController extends Controller{

    private final Window window;
    private final Game game;
    private String player;
    private String finding;

    public WindowController(Window window) {
        super(window);
        this.window = window;
        this.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.window.setVisible(true);
        this.window.getPanel();
        game = new Game();
    }

    /**
     * Funcion que toma la accion de cada boton por letra
     * @param actionEvent El evento del boton presionado
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        MainPanel panel = (MainPanel) window.getPanel();

        switch (actionEvent.getActionCommand()){
            case A:
                run('a',panel);
                break;
            case B:
                run('b',panel);
                break;
            case C:
                run('c',panel);
                break;
            case D:
                run('d',panel);
                break;
            case E:
                run('e',panel);
                break;
            case F:
                run('f',panel);
                break;
            case G:
                run('g',panel);
                break;
            case H:
                run('h',panel);
                break;
            case I:
                run('i',panel);
                break;
            case J:
                run('j',panel);
                break;
            case K:
                run('k',panel);
                break;
            case L:
                run('l',panel);
                break;
            case M:
                run('m',panel);
                break;
            case N:
                run('n',panel);
                break;
            case Ñ:
                run('ñ',panel);
                break;
            case O:
                run('o',panel);
                break;
            case P:
                run('p',panel);
                break;
            case Q:
                run('q',panel);
                break;
            case R:
                run('r',panel);
                break;
            case S:
                run('s',panel);
                break;
            case T:
                run('t',panel);
                break;
            case U:
                run('u',panel);
                break;
            case V:
                run('v',panel);
                break;
            case W:
                run('w',panel);
                break;
            case X:
                run('x',panel);
                break;
            case Y:
                run('y',panel);
                break;
            case Z:
                run('z',panel);
                break;
            case START:
                printClear(panel);
                try {
                    finding = game.start();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                player = JOptionPane.showInputDialog(null, "ADD NAME PLAYER PLEAS : ", "DATA PLAYERS", JOptionPane.QUESTION_MESSAGE);
                new MessageInformation("WELCOME ", "WELCOME " + player);
                panel.setNamePlayer(player);
                new MessageInformation("INIT GAME", "SELECT ONE WORD");
                break;
            case RESTART:
                printClear(panel);
                try {
                    finding = game.restart();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            case EXIT:
                new MessageInformation("GAME OVER", "THANK YOU " + " " + player + " " + "FOR PLAYING WITH OUR");
                System.exit(0);
                break;
        }
    }

    /**
     * Funcion que deja en blanco los campos Letras Utilizadas y Acertadas
     * @param panel tipo de dato del MainPanel de Panel
     */
    private void printClear(MainPanel panel) {
        panel.setScripts(" ");
        panel.setWordUsed(" ");
    }

    /**
     * Funcion que envia la letra seleccionada con el evento del boton
     * @param word tipo de dato char letra
     * @param panel objeto panel del MainPanel
     */
    private void run(char word, MainPanel panel) {
        game.game(finding, player,word,panel);
        panel.setScripts(String.valueOf(game.getGuiones()));
        panel.setWordUsed(String.valueOf(game.getInsertLetters()));
    }
}
