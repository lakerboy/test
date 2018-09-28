package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaCollections {


	public static void main(String[] args) {

		List<Double> myScores = new ArrayList<>();
		myScores.add(78.3);
		myScores.add(18.6);
		myScores.add(71.11);
		myScores.add(22.1);
			
		for (Double score : myScores){
			System.out.println(score);
		}
		
		myScores.forEach(s -> System.out.println(s));
	}

}
