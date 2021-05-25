/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Shapes2D.Circle;
import Shapes2D.Line;
import Shapes2D.Rectangle;
import Shapes2D.Triangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Windmill {
    private Point O;
    private int size, R;
    private int r = 3;
    private Color color;

    public Windmill() {
    }

    public Windmill(Point O, int size, int R, Color color) {
        this.O = O;
        this.size = size;
        this.R = R;
        this.color = color;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point O) {
        this.O = O;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }
    
    public void draw(Graphics g){
        // Vẽ cây cột điện
        Point v = new Point((O.x + r*size/2), O.y);
        Point thanh = new Point((O.x - r*size/2), O.y+(R+r)*size);
        
        Rectangle rect = new Rectangle();
        rect.init(thanh, v, size, Color.red);
        rect.draw(g);
        
        Point A1;
        Point B1;
        // Vẽ cánh cối xay
        float canh = (float)Math.sqrt(3)*(R*size); 
        Point d1 = new Point((O.x + R*size/2), (int)(O.y + canh/2));
        Point d2 = new Point((O.x + R*size/2), (int)(O.y - canh/2));
        Point d3 = new Point((O.x - R*size), O.y);
        
        A1 = new Point(O.x + r*3, O.y - r*3);
        B1 = new Point(O.x - r*3, O.y + r*3);
        Line l = new Line();
        l.init(d1, A1, size, Color.yellow);
        l.draw(g);
        l.init(d1, B1, size, Color.yellow);
        l.draw(g);
        
        A1 = new Point(O.x + r*3, O.y +r*3);
        B1 = new Point(O.x - r*3, O.y -r*3);
        l.init(d2, A1, size, Color.yellow);
        l.draw(g);
        l.init(d2, B1, size, Color.yellow);
        l.draw(g);
        
        A1 = new Point(O.x , O.y + r*3);
        B1 = new Point(O.x , O.y - r*3);
        l.init(d3, A1, size, Color.yellow);
        l.draw(g);
        l.init(d3, B1, size, Color.yellow);
        l.draw(g);
        
        // Vẽ Tâm
        Circle c = new Circle();
        Point A = new Point(O.x + r*size, O.y + r*size);
        Point B = new Point(O.x - r*size, O.y - r*size);
        c.init(A, B, size, color);
        c.draw(g);
    }
}
