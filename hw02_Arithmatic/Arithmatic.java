// Huy Hoang
// 08/02/2016
//

//
public class Arithmatic {
   
    //main method required for every java program
   
    public static void main(String [] args){
        
        //end of main method
 //end of class
    
// Number of pairs of pants
int numPants = 3;
// Cost per pair of pants 
double pantsPrice = 34.98;

// Number of sweatshirts
int numShirts = 2;
// Cost per shirt
double shirtPrice = 24.99; 

// Number of belts
int numBelts = 1;
// Cost per box of envolopes
double beltCost =33.99;

// the tax rate 
double paSalesTax = 0.06;

double TotalCostofPants = numPants * pantsPrice; // total cost of pants without tax
double Salestaxpants = TotalCostofPants * paSalesTax; // tax charged on pants
double TotalCostofPantstimes100 = TotalCostofPants*100; 
double RealCostofPants = TotalCostofPantstimes100/100;

double TotalCostofShirts = numShirts * shirtPrice; // total cost of sweatshirts without tax 
double Salestaxshirts = TotalCostofShirts * paSalesTax; // tax charged on shirts
double TotalCostofShirtstimes100 = TotalCostofShirts*100;
double RealCostofShirts = TotalCostofShirtstimes100/100;

double TotalCostofBelts = numBelts * beltCost; // total cost of belts without tax
double Salestaxbelts = TotalCostofBelts * paSalesTax; // tax charged on belts
double TotalCostofBeltstimes100 = TotalCostofBelts*100;
double RealCostofBelts = TotalCostofBeltstimes100/100;


double TotalCostPurchase = TotalCostofBelts + TotalCostofPants + TotalCostofShirts; // total purchase before tax 
double TotalSalesTax = Salestaxbelts + Salestaxpants + Salestaxshirts; // Total tax of purchase
double TotalTransaction = TotalCostPurchase + TotalSalesTax; // Total transaction with tax

// print out the data
System.out.println("TotalCostofPants"+(TotalCostofPants)+"dollar");
System.out.println("TotalCostofSweartshirt"+(TotalCostofShirts)+"dollar");
System.out.println("TotalCostofBelts"+(TotalCostofBelts)+"dollar");
System.out.println("SalestaxofPants"+(TotalSalesTax)+"dollar");
System.out.println("SalestaxofShirts"+(Salestaxshirts)+"dollar");
System.out.println("SalestaxofBelts"+(Salestaxbelts)+"dollar");
System.out.println("Totalcostbeforetax"+(TotalCostPurchase)+"dollar");
System.out.println("TotalTransaction"+(TotalTransaction)+"dollar");
}
}


