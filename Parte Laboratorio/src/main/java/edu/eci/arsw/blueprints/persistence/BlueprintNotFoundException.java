package edu.eci.arsw.blueprints.persistence;

 /**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CLASE: BlueprintNotFoundException
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */
/**
 *
 * @author hcadavid
 */
public class BlueprintNotFoundException extends Exception{
	 /**
	 */
    public BlueprintNotFoundException(String message) {
        super(message);
    }

	/**
	 */
    public BlueprintNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}