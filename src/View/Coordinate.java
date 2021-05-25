/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class Coordinate extends JPanel{
    int pixel =5;
    
    public void drawCoor(JPanel panel, Graphics g){
        int w = panel.getWidth();
        int h = panel.getHeight();
        
        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);
        
    }
    
    public void drawGrid(JPanel panel, Graphics g, boolean flag){
        g.setColor(Color.lightGray);
        int w = panel.getWidth();
        int h = panel.getHeight();
        
        if(flag){
            for(int i = 1; i < w / pixel; i++) {
                if(i!= w/2) {
                    g.drawLine(i * pixel, 0, i * pixel, h);
                }
                g.drawLine(0, i * pixel, w, i * pixel);
            }
        }else if(!flag){
            for(int i = 1; i < w / pixel; i++) {
                if(i!= w/2) {
//                    g.drawLine(i * pixel, 0, i * pixel, h);
                    panel.repaint(i * pixel, 0, i * pixel, h);
                }
//                g.drawLine(0, i * pixel, w, i * pixel);
                panel.repaint(0, i * pixel, w, i * pixel);
            }
        }
    }
}
