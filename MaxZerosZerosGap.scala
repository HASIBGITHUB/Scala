//MaxZerosGap

//Look for the longest string of zeros in binary representation for an integer


import scala.collection.JavaConverters._
import util.control.Breaks._

object MyMaxZerosGap extends App {
  def getZeroGap(n: Int): Int = {
    // write your code in Scala 2.12
    val binStr = n.toBinaryString
    
    var max : Int = 0
		var flagStart1 : Int = 0
		//var flagEnd1 : Int = 0
		var counter : Int = 0
    for (i <- 0 to binStr.length()-1)
    {
      
      breakable {
            if (binStr(i).equals('1') && flagStart1==0) {
            flagStart1=1
        		break
            }
        
      
       
      	if (binStr(i).equals('0') ) {
         counter+=1
        break
        }
      	
      
        
      	if (binStr(i).equals('1') && flagStart1==1)
      		if (max < counter)
      			max=counter
      			counter=0
      }
      
      	
    }
    return max
  }
}