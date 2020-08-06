package manager;

import lists.Lists;
import messages.MessageInformation;
import ui.panels.MainPanel;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Game {

    private static final int MAX_FAILED = 7;
    private static final int CANT_LETTERS = 27;

    private final Lists lists = new Lists();
    private char[] letters;
    private char[] guiones;
    private char[] insertLetters;
    private int cantLetters;
    private int intentFailed = 0;

    public Game() {}

    /**
     * Funcion que devuelve el array de letras guiones
     * @return devuelve guiones
     */
    public char[] getGuiones() {
        return guiones;
    }

    /**
     * Funcion que devuelve el array de las letras utilizadas
     * @return devuelve letras usadas
     */
    public char[] getInsertLetters() {
        return insertLetters;
    }

    /**
     * Funcion que inicia el juego y genera la lista de palabras
     * como las letras de como array de la palabra a adivinar
     * @return String palabra a adivinar
     * @throws Exception exceptions
     */
    public String start() throws Exception {
        generateList();
        return generateLetters();
    }

    /**
     * Funcion que re inicia el juego una ves finalizado el anterior
     * Pone en cero el contador de intentos fallidos
     * Genera la palabra nueva a adivinar en su array
     * @return devuelve esa palabra String a adivinar
     */
    public String restart() {
        intentFailed =0;
        return generateLetters();
    }

    /**
     * Funcion del juego que va tomando letra a letra y
     * Compara letra a letra con la palabra a adivinar
     * Va devolviendo e imprimiento guiones y acertadas
     * Devuelve ademas si el Jugador Gano o Perdio
     * @param adivinar Palabra a adivinar
     * @param name Nombre del Jugador
     * @param word Letra seleccionada en los eventos de botones
     * @param panel panel del tipo de dato MainPanel
     */
    public void game(String adivinar, String name, char word, MainPanel panel) {
        boolean found = false;
        boolean win = false;
        boolean yes = false;

        new MessageInformation("GAMING", " NUMBER OF LETTERS REMAINING : " + " " + cantLetters);

        for (int i = 0; i < letters.length; i++) {
            letters[i] = changeWord(letters[i]);
            if (letters[i] == word) {
                guiones[i] = word;
                found = true;
                cantLetters--;
            }
        }

        for (int i = 0; i < CANT_LETTERS && !yes; i++){
            if (insertLetters[i] == '*'){
                insertLetters[i] = word;
                yes=true;
            }
        }
        if (!found) {
            intentFailed++;
            panel.setFinding(searchImageIcon(intentFailed));
        }

        if (Arrays.equals(letters, guiones)) {
            win = true;
            new MessageInformation("GAMING", name + " " + "THE WORD IS : " + " " + adivinar + " " + " YOU WIIIIIIIIIIIIIIIN CONGRATULATION!!!!");
            new MessageInformation("NEW GAME", "PRESS RESTART NEW GAME OR EXIT");
        }

        if (intentFailed >= MAX_FAILED && !win){
            new MessageInformation("GAME OVER", "YOU LOUSER....." + " " + "THE WORD TO GUESS WAS : " + " " + adivinar + " ");
            new MessageInformation("NEW GAME", "PRESS RESTART NEW GAME OR EXIT");
        }
    }

    /**
     * Funcion que genera los array de letras y guiones
     * @return String palabra a adivinar
     */
    private String generateLetters(){
        String pal = generateAdivinar();
        letters = pal.toCharArray();
        guiones = createGuiones(letters);
        cantLetters = letters.length;
        insertLetters = createInsertadas();
        return pal;
    }

    /**
     * Funcion que cambia toda letra con acentos en letra
     * sin acentos
     * @param word letra con o sin acentos
     * @return letra sin acentos
     */
    private char changeWord(char word) {
        if (word=='á') word='a';
        if (word=='é') word='e';
        if (word=='í') word='i';
        if (word=='ó') word='o';
        if (word=='ú') word='u';
        return word;
    }

    /**
     * Funcion que crea el array de Palabras Seleccionadas y usadas
     * @return array de letras a ser utilizadas
     */
    private char[] createInsertadas() {
        char[] letrasInsertadas = new char[CANT_LETTERS];
        for (int i = 0; i < CANT_LETTERS; i++) {
            letrasInsertadas[i] = '*';
        }
        return letrasInsertadas;
    }

    /**
     * Funcion que crea el array de letras con guiones
     * @param letras array de letras de la palabra a adivinar
     * para su comparacion
     * @return array de espacios o letras con guiones
     */
    private char[] createGuiones(char[] letras){
        char[] guiones = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            guiones[i] = '_';
        }
        return guiones;
    }

    /**
     * Genera un numero entero al azar para la posicion de la palabra
     * a adivinar en la lista de palabras en la base de datos
     * @return String con la palabra a adivinar
     */
    private String generateAdivinar() {
        int pos = (int) Math.floor(Math.random() * lists.palabrasListSize());
        return lists.searchPalabras(pos);
    }

    /**
     * Funcion que lee el archivo de letras de base de datos y
     * genera la lista a ser utilizada durante el juego
     * @throws Exception exceptions
     */
    private void generateList () throws Exception {
        File file = new File("data/bdPalabrasBiblia.bbl");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String lee;
        while ((lee = reader.readLine()) != null) {
            lists.addPalabrasList(lee);
        }
        reader.close();
    }

    /**
     * Funcion que a medida de los intentos fallidos va imprimiendo
     * por pantalla la imagen relacionada al numero de intento fallido
     * @param intentFailed Numero entero del contador de intentos fallidos
     * @return La imagen tipo jpg a mostrar por pantalla
     */
    private ImageIcon searchImageIcon(int intentFailed) {
        ImageIcon imageIcon = new ImageIcon();
        switch (intentFailed){
            case 0:
                imageIcon = new ImageIcon("data/1.jpg");
                break;
            case 1:
                imageIcon = new ImageIcon("data/2.jpg");
                break;
            case 2:
                imageIcon = new ImageIcon("data/3.jpg");
                break;
            case 3:
                imageIcon = new ImageIcon("data/4.jpg");
                break;
            case 4:
                imageIcon = new ImageIcon("data/5.jpg");
                break;
            case 5:
                imageIcon = new ImageIcon("data/6.jpg");
                break;
            case 6:
                imageIcon = new ImageIcon("data/7.jpg");
                break;
            case 7:
                imageIcon = new ImageIcon("data/8.jpg");
                break;
        }
        return imageIcon;
    }

}
