package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.filters.filtroSubmuestreo;
import edu.eci.arsw.blueprints.model.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													TEST: filtroSubmuestreoTest
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */
public class filtroSubmuestreoTest {
	
    @Test
    public void submuestreoFiltrado(){
        filtroSubmuestreo prueba = new filtroSubmuestreo();
        Point points[] = {new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8), new Point(9,10)};
        Blueprint blueprint = new Blueprint("mack","mypaint",points);
        blueprint = prueba.filter(blueprint);
        List<Point> resultado = new ArrayList<>();
        resultado.add(new Point(1,2));
        resultado.add(new Point(5,6));
        resultado.add(new Point(9,10));
        assertTrue(blueprint.getPoints().size() == resultado.size());
        List<Point> res = blueprint.getPoints();
        for (int i = 0; i < res.size(); i++){
            assertEquals(resultado.get(i),res.get(i));
        }
    }
}