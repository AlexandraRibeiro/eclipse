package avaj_launcher;

import java.util.ArrayList;

//static == global
//final == const

public class Tools {
	
	public static final boolean verbose = true;
	
	public static ArrayList<String> arrID = new ArrayList<String>();
	
	public static ArrayList<String> arrLogs = new ArrayList<String>(); // > simulation.txt
		
    public static String[] arrWeathers = {"SUN", "RAIN", "FOG", "SNOW", "WIND"}; //bonus Wind
    
    public static String[] arrAircrafts = {"JetPlane", "Helicopter", "Baloon", "Drone"}; //bonus Drone
	
    private static int[][][] arrAircraftMove = 	{ 	/*		SUN				RAIN				FOG				SNOW				WIND 		*/
				/* JetPlane */						{	{0, 10, 2},		{0, 5, 0},		{0, 1, 0},		{0, 0, -7},		{0, 3, -2}		},
				/* Helicopter */						{	{10, 0, 2},		{5, 0, 0},		{1, 0, 0},		{0, 0, -12},		{0, 5, -4}		},
				/* Baloon */							{	{2, 0, 4},		{0, 0, -5},		{0, 0, -3},		{0, 0, -15},		{0, 10, -8}		},
				/* Drone */			 				{	{4, 0, 2},		{6, 0, -2},		{1, 0, 0},		{0, 0, -12},		{0, 2, -5}		}			
													/* Longitude, Latitude, Height */  														 
									  			};
 
	public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30;1m";
    public static final String RED = "\u001B[31;1m";
    public static final String GREEN = "\u001B[32;1m";
    public static final String YELLOW = "\u001B[33;1m"; 		//for MyExceptions
    public static final String BLUE = "\u001B[34;1m";
    public static final String PURPLE = "\u001B[35;1m";
    public static final String CYAN = "\u001B[36;1m";
    public static final String WHITE = "\u001B[37;40;1m";

}
