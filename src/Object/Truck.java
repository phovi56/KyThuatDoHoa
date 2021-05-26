/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import Shapes2D.Circle;
import Shapes2D.Line;
import Shapes2D.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class Truck {
    private Point O;
    private int sizeTruck;
    private int r = 4;
    private int size;

    public Truck() {
    }

    public Truck(Point O, int sizeTruck, int size) {
        this.O = O;
        this.sizeTruck = sizeTruck;
        this.size = size;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point O) {
        this.O = O;
    }

    public int getSizeTruck() {
        return sizeTruck;
    }

    public void setSizeTruck(int sizeTruck) {
        this.sizeTruck = sizeTruck;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    public void draw(Graphics g){
        // Khởi tạo các điểm
        Point A1, A2, A3 ,A4;// Điểm thân
        Point B1, B2, B3 ,B4;// Điểm cổ
        Point C1, C2, C3 ,C4;// Điểm đầu dưới
        Point D1, D2, D3 ,D4;// Điểm đầu trên
        Point DT1, DT2;// Điểm đường thẳng
        Point O1, O2;// Điểm tâm xe
        
        // Vẽ thân xe
        Rectangle rect = new Rectangle();
        int sizeBody = sizeTruck*3/4;
        int heightBody = sizeBody/2;
        A1 = new Point((O.x-((sizeBody-r)*size)), O.y-size);
        A2 = new Point((A1.x + sizeBody*size), A1.y);
        A3 = new Point(A2.x, O.y-heightBody*size);
        A4 = new Point(A1.x, A3.y);
        rect.init(A1, A3, size, Color.red);
        rect.draw(g);
        
        // Vẽ cổ xe
        B1 = A2;
        B2 = new Point(B1.x + ((r*size)*3/2), B1.y);
        B3 = new Point(B2.x, B2.y -(r*size));
        B4 = new Point(B1.x, B3.y);
        rect.init(B1, B3, size, Color.red);
        rect.draw(g);
        
        // Vẽ đầu dưới
        C1 = B2;
        C2 = new Point(A1.x+sizeTruck*size,C1.y);
        C3 = new Point(C2.x, C2.y - (heightBody/2)*size);
        C4 = new Point(C1.x, C3.y);
        rect.init(C1, C3, size, Color.red);
        rect.draw(g);
        
        // Vẽ đầu trên
        D1 = C4;
        D2 = new Point(D1.x +(C2.x-C1.x)/2, D1.y);
        D3 = new Point(D2.x, D2.y - (heightBody/4)*size);
        D4 = new Point(D1.x, D3.y);
        rect.init(D1, D3, size, Color.red);
        rect.draw(g);
        DT1 = D3;
        DT2 = new Point(D2.x + r*size,D2.y);
        Line l = new Line();
        l.init(DT1, DT2, size, Color.red);
        l.draw(g);
        
        // Vẽ Bánh Xe
        Circle c = new Circle();
        O1 = new Point((A1.x +((r*3/2)*size)), O.y);
        O2 = new Point((C1.x +((r*3/2)*size)), O.y);
        // Bánh cuối
        c.init(new Point(O1.x - r*size, O1.y), new Point(O1.x + r*size, O1.y), size, Color.yellow);
        c.draw(g);
        c.init(new Point(O1.x - r/2*size, O1.y), new Point(O1.x + r/2*size, O1.y), size, Color.yellow);
        c.draw(g);
        
        // Bánh giữa
        c.init(new Point(O.x-r*size, O.y), new Point(O.x+r*size, O.y), size, Color.black);
        c.draw(g);
        c.init(new Point(O.x-r/2*size, O.y), new Point(O.x+r/2*size, O.y), size, Color.black);
        c.draw(g);
        
        // Bánh đầu
        c.init(new Point(O2.x - r*size, O.y), new Point(O2.x + r*size, O.y), size, Color.yellow);
        c.draw(g);
        c.init(new Point(O2.x - r/2*size, O.y), new Point(O2.x + r/2*size, O.y), size, Color.yellow);
        c.draw(g);
    }
}
