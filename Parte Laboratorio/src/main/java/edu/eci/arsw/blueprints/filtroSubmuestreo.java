package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CLASE: filtroSubmuestreo
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 
@Service("filtroSubmuestreo")
public class filtroSubmuestreo implements filtroBlueprints {
    
	public filtroSubmuestreo(){
	}
	
	/**
	* 
	*/
	@Override
    public Blueprint filtro(Blueprint bp) {
        List<Point> oldPoints=bp.getPoints();
        ArrayList<Point> points=new ArrayList<Point>();
        for(int i=0;i<oldPoints.size();i++){
            if((i%2)==0){
                points.add(oldPoints.get(i));
            }
        }
        return new Blueprint(bp.getAuthor(),bp.getName(),points);
    }
}