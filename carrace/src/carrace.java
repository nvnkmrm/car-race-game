/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.UIManager;

/**
 *
 * @author Naveen kumar
 */
public class carrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set cross-platform Look and Feel for proper color rendering on macOS
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game11().setVisible(true);
            }
        });
    }
    
}
