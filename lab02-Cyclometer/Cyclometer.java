// Huy Hoang
// 02/05/2016
// CSE 2 

// 
public class Cyclometer {
   
   //main method required for every java program
   
    public static void main(String [] args){
        
     //end of main method
 //end of class

// our input data. Document your variable by placing your // comments after the "//".State the purpose of each variable

int secsTrip1=480; // time it takes for Trip 1 in seconds 
int secsTrip2=3220; // time it takes for Trip 2 in seconds
int countsTrip1=1561; // distance of Trip 1 in miles 
int countsTrip2=9037; // distance of Trip 2 in miles

double WheelDiameter=27,//
PI=3.14159,//
FeetPerMile=5280,//
inchesperFoot=12,//
secondsperMinute=60;//
double distanceTrip1, distanceTrip2,TotalDistance;//

System.out.println("Trip1 took"+ (secsTrip1/secondsperMinute)+"minutes and had"+ countsTrip1 +"counts.");

System.out.println("Trip2 took"+ (secsTrip2/secondsperMinute)+"minutes and had"+ countsTrip2 +"counts.");

distanceTrip1=countsTrip1*WheelDiameter*PI;
// Above gives distance in inches
// (for each count, a rotation of wheels travel
// the diameterin inches time PI)
distanceTrip1/=inchesperFoot*FeetPerMile;//Gives distance in miles\
distanceTrip2/=countsTrip2*WheelDiameter*PI/inchesperFoot/FeetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data
System.out.println("Trip 1 was"+distanceTrip1+" miles");
System.out.println("Trip 2 was"+distanceTrip2+"miles");
System.out.println("The total Distance was"+TotalDistance+"miles");
}
}