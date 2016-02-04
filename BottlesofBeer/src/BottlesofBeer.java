/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaifali Sood
 */
public class BottlesofBeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String b = "b";
        
        for( int beer=99; beer>-1;)
        {
            System.out.print(beer + " bottles " + b + " of beer on the wall");
            System.out.println(beer + " bottles " + b + " of beer");
          // when there is no beer left. (0 Bottles)
            if(beer==0)
            {
                System.out.print("No more bottles of beer on the wall ");
                System.exit(0); // ends song when 0 is reached and exits out of it.   
            }
            
            else
                System.out.print("Take one down, pass it around ");
            b= (--beer ==1)?"":"b";//decrementing beer bottles and putting the b value in 
            System.out.println(beer + " bottles " + b + " of beer on the wall!\n");
            
        }
        
    }
    
}
