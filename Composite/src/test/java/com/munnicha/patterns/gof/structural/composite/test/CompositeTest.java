package com.munnicha.patterns.gof.structural.composite.test;

import com.munnicha.patterns.gof.structural.composite.model.Graphic;
import com.munnicha.patterns.gof.structural.composite.model.Line;
import com.munnicha.patterns.gof.structural.composite.model.Picture;
import com.munnicha.patterns.gof.structural.composite.model.Rectangle;
import com.munnicha.patterns.gof.structural.composite.model.Text;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class CompositeTest {
    
    @Test
    public void testComposite(){
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
        
        assertEquals(2,mainPicture.getChildren().size());
        assertEquals(3,rightPicture.getChildren().size());
        assertEquals(4,topRightPicture.getChildren().size());
    }
}