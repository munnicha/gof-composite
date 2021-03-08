package com.munnicha.patterns.gof.structural.composite;

import com.munnicha.patterns.gof.structural.composite.model.Graphic;
import com.munnicha.patterns.gof.structural.composite.model.Line;
import com.munnicha.patterns.gof.structural.composite.model.Picture;
import com.munnicha.patterns.gof.structural.composite.model.Rectangle;
import com.munnicha.patterns.gof.structural.composite.model.Text;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graphic mainPicture = new Picture();
            Graphic leftPicture = new Picture();
                leftPicture.add(new Text());
            mainPicture.add(leftPicture);
            Graphic rightPicture = new Picture();
                rightPicture.add(new Rectangle());
                rightPicture.add(new Line());
                Graphic topRightPicture = new Picture();
                    topRightPicture.add(new Text());
                    topRightPicture.add(new Line());
                    topRightPicture.add(new Line());
                    topRightPicture.add(new Rectangle());
                rightPicture.add(topRightPicture);
            mainPicture.add(rightPicture);
        mainPicture.draw();
        
        try{
            Graphic leafLine = new Line();
            leafLine.add(new Text());
        }catch(UnsupportedOperationException e){
            System.out.println("Leaf component cannot have child.");
        }
    }
}
