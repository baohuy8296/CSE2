// Huy Hoang
// CSE2

public static int[] randomInput() {
int [] randomArray = new int[10];
for (int i =0; i<randomArray.length; i++){
    randomArray[i]= (int) (Math.random()*8)+1;
}
return randomArray;
}
    
    //method to delete an element
    public static int[] delete( int [] list , int pos){
        int[] result = new int [list.length -1];
        for (int i=0; i <result.length; i ++){
            if(i < pos){
                result[i]= list[i];
            }
            else {
                result[i]=list[i+1];
            }
            
        }
        return result;
    }
    
    //method to delete all targets
    
    public static int[] remove(int [] list, int target){
        int [] result = new int [list.length-target];
        for(int i =0; i < result.length; i ++){
            if(list[i]!=list[target] ){
                result[i]=list[i];
            }
        }
    
        return result;
    }
