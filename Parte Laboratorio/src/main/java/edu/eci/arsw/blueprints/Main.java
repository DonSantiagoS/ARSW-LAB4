package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.*;
import edu.eci.arsw.blueprints.persistence.*;
import edu.eci.arsw.blueprints.services.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CLASE: Main
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) throws BlueprintPersistenceException, BlueprintNotFoundException{
		
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices serviceBluePrint = appContext.getBean(BlueprintsServices.class);
        serviceBluePrint.addNewBlueprint(new Blueprint("Santiago","blueprintSantiago"));
        Blueprint blueprintSantiago=serviceBluePrint.getBlueprint("Santiago","blueprintSantiago");
        serviceBluePrint.addNewBlueprint(new Blueprint("Steven","blueprintSteven"));
		System.out.println(blueprintSantiago);
        System.out.println(serviceBluePrint.getBlueprintsByAuthor("Steven"));
        Point[] points= new Point[] {new Point(1,2),new Point(3,4),new Point(1,2)};
        serviceBluePrint.addNewBlueprint(new Blueprint("Santiago","bp3",points));
        System.out.println(serviceBluePrint.getAllBlueprints());
        Blueprint bp3=serviceBluePrint.getBlueprint("Santiago","bp3");
        System.out.println(serviceBluePrint.filtro(bp3).getPoints());
    }
}