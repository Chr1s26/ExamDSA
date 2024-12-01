package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnagramGenerator {


	  public static void main(String[] args) {

		  char[] chars = {'a','b','c'};

		  
		  //if input is zxc
		  
		  // win mae hr ka cxz
		  
		  Arrays.sort(chars);
		  
		  //loop htl sa win ml 
		  //Start ko 0 pyy ml
		  
		  generateanag(chars, 0);
      

		  for (String anagram : anag) {
			  System.out.println(anagram);
		  }
		  
  }	
	  //List htl thein
	  public static List<String> anag = new ArrayList<>();
	  
	  public static void generateanag(char[] chars, int first) {
		  
		  //first ka ma tu ma chin 
		  // debug = first = 0,1,2   <= 2 mhr sa tu loh return pyn ml
		  
	      if (first == chars.length - 1) {
	          anag.add(new String(chars));
	          return;
	      }
	     
	      
	      
	      for (int i = first; i < chars.length; i++) {
	        
	    	  // i ka first ka sa ma tu yin nk char ka continue lote 
	    	  //base case hti a lote lote ml
	    	  // 3-1 mhr sa p return pyn ml 3-1 ka 2 nk tu ak tok i ka 2 nk tu p sa pyn
	          if (i != first && chars[i] == chars[first]) { 
	        	  continue;
	        	  }
	          
	          // char first htl ka hr ko store 
	          // a kywy kyn tr twy lote phoe yay khae
	          char temp = chars[first];
	          chars[first] = chars[i];
	          chars[i] = temp;
	          
	          // amyl tnn first ko toe p yu
	          //base case yout 
	          generateanag(chars, first + 1);
	          
	          // akywy twy pyn sat
	          temp = chars[first];
	          chars[first] = chars[i];
	          chars[i] = temp;
	      }
	  }

	
}
