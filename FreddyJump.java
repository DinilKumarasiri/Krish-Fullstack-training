public class FreddyJump{
	double [] distanceArray = {5, 3, 1};
	double [] timeArray = {1, 2, 3.5};
	
	public double [] calculation(double distance){
		
		int remainder = (int)(distance % arrayElementSum(distanceArray)) ;
		int division = (int) (distance / arrayElementSum(distanceArray));
		//System.out.println("Division of the given distance - "+division);
		//System.out.println("Remainder of the given distance - "+remainder);
		double [] timeAndJumps = new double[2];
		double time = 0;
		int jumps = 0;
		if (remainder == 0){
			time = division*arrayElementSum(timeArray);
			jumps = division*(distanceArray.length);
			timeAndJumps[0] = time;
			timeAndJumps[1] = jumps; 
			return timeAndJumps;
		}else if (remainder <= 5){
			time = division*arrayElementSum(timeArray) + timeArray[0];
			jumps = division*(distanceArray.length) + 1;
			timeAndJumps[0] = time;
			timeAndJumps[1] = jumps; 
			return timeAndJumps;
		}else if (remainder <= 8){
			time = division*arrayElementSum(timeArray) + timeArray[1];
			jumps = division*(distanceArray.length) + 2;
			timeAndJumps[0] = time;
			timeAndJumps[1] = jumps; 
			return timeAndJumps;
		}
		return timeAndJumps;


	}

	public double arrayElementSum(double [] arr){
		double a = 0;
		for(int i=0; i < arr.length; i++){
			a += arr[i];
		}
		return a;
	}
	



}