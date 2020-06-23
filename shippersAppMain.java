package shippersApp1;

import java.io.IOException;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;

public class shippersAppMain {

	private static final Logger LOGGER = Logger.getLogger(shippersAppStart.class.getName());
	private static FileHandler fileTxt;
	static private SimpleFormatter formatterTxt;

	public static void main(String[] args) throws IOException
	{
		doMyIntro();

		getResults();
	}

	static public void getResults() throws IOException
	{
		int weightsArray1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int weightsArray2[] = new int[]{3, 2, 2, 4, 1, 4};
		int weightsArray3[] = new int[]{1, 2, 3, 1, 1};
		int resultSimple1, resultSimple2, resultSimple3;

		LOGGER.log(LOGGER.getLevel(), "-----------------");

		shippersSimpleShip2 simpleShip2 = new shippersSimpleShip2();
		resultSimple1 = simpleShip2.shipWithinDays(weightsArray1, 5);
		LOGGER.log(LOGGER.getLevel(), "Simple Result 1 in days  " + resultSimple1);
		resultSimple2 = simpleShip2.shipWithinDays(weightsArray2, 3);
		LOGGER.log(LOGGER.getLevel(), "Simple Result 2 in days  " + resultSimple2);
		resultSimple3 = simpleShip2.shipWithinDays(weightsArray3, 4);
		LOGGER.log(LOGGER.getLevel(), "Simple Result 3 in days  " + resultSimple3);

	}

	static public void doMyIntro() throws IOException
	{
		setup();

		LOGGER.log(LOGGER.getLevel(), "-----------------");
		LOGGER.log(Level.INFO, "Welcome!\n");
		LOGGER.log(Level.INFO, "Let's calculate the minimum ship capacity\n");
		LOGGER.log(Level.INFO, "for shipping a number of products\n\n");

		LOGGER.log(Level.INFO, "Let's call the classes to calculate ship capacity.");
	}

	static public void setup() throws IOException
	{
		LOGGER.setLevel(Level.INFO);
		fileTxt = new FileHandler("joshLogging.txt");

		formatterTxt = new SimpleFormatter();
	    fileTxt.setFormatter(formatterTxt);
	    LOGGER.addHandler(fileTxt);
	}

}
