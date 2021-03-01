package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CLASE: filtroRedundancia
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */

@Service("filtroRedundancia")
public class filtroRedundancia implements filtroBlueprints {
    
	public filtroRedundancia(){
	}
	
	@Override
    public Blueprint filtro(Blueprint bp) {
		boolean redundancia;
        ArrayList<Point> points=new ArrayList<Point>();
        for (Point i :bp.getPoints()){
            redundancia=false;
            for(Point j : points){
                if(i.equals(j)){
                    redundancia=true;
                    break;
                }
            }
            if(redundancia==false){
				points.add(i);
			}
        }
        return new Blueprint(bp.getAuthor(),bp.getName(),points);
    }
}