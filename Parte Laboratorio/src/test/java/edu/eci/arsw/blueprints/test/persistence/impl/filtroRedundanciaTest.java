package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.filtroRedundancia;
import edu.eci.arsw.blueprints.model.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													TEST: filtroRedundanciaTest
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 
public class filtroRedundanciaTest {
    
	@Test
    public void redundanciaEncontrada() {
        filtroRedundancia filtroRed = new filtroRedundancia();
        Point points[] = {new Point(1, 1), new Point(1, 1), new Point(2, 2), new Point(2, 2), new Point(3, 3), new Point(3, 3)};
        Blueprint blueprint = new Blueprint("mack", "mypaint", points);
        blueprint = filtroRed.filtro(blueprint);
        List<Point> resultado = new ArrayList<>();
        resultado.add(new Point(1, 1));
        resultado.add(new Point(2, 2));
        resultado.add(new Point(3, 3));
        assertTrue(blueprint.getPoints().size() == resultado.size());
        List<Point> res = blueprint.getPoints();
        for (int i = 0; i < res.size(); i++){
            assertEquals(resultado.get(i),res.get(i));
        }
    }
}