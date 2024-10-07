package com.mycompany.lilbotmaven;

import com.mycompany.lilbotmaven.Recognizers.LilBotRecognizer;
import javax.swing.SwingUtilities;

public class LilBotMaven {

    public static void main(String[] args) {
        
        // Criando a GUI e inicializando o reconhecimento de fala
        LilBotGUI lilBotGUI = new LilBotGUI();
        LilBotRecognizer recognizer = new LilBotRecognizer(lilBotGUI);
        recognizer.startRecognition();
    }
}
