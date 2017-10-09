package Anagram;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Anagram
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class AnagramList { //creating a class AnagramList
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
  //classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
List<String> list = new ArrayList<String>();//created an object
		
		//here in the we are adding the list of String values
		list.add("top");
		list.add("part");
		list.add("pot");
		list.add("opt");
		list.add("trap");
		list.add("silent");
		list.add(" listen");
		list.add("hello");
		list.add("hits");
		list.add("what");
		list.add("shit");
		
		    System.out.println(findAnagrams(list)); //it prints all the anagrams
		  //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream

	}
	//here we have taken a method of Map which shows a value list of anagrams and a key of String and input is list of words
		private static Map<String, List<String>>findAnagrams (List<String> words){
			 Map<String, List<String>> anagrams= null;  // created a HashMap string as a key and list as string 
			 
			 if(words == null || words.size() ==0){  //here it is check the list of words of is empty and return as null
				 return null;
				 
			 }
			    anagrams = new HashMap<String, List<String>>();
			    //HashMap is an implementation and we are implementing the anagrams 
			   
			    // for example pot takes the word and get into the charArray and sorted them after that they comes to string and forms a string 
			    for(String word : words){                
			    	//creating a for loop which checks the words which we have given
			    	char [] charArray = word.trim().toCharArray();
			    	Arrays.sort(charArray);
			    	String sortedWord = String.valueOf(charArray);
			    	
			    	if(anagrams.containsKey(sortedWord)){           
			    		//here it checks weather contains a key and get the sorted word 
			    		  List<String> newList = anagrams.get(sortedWord);     
			    		  newList.add(word);
			    		  anagrams.put(sortedWord, newList);
			    		  //we put a new list of sorted word
			    		  
			    	}
			    	else{                  //  if the map doesn't contain the sorted word we are creating a new array list of type string
			    		List<String> list = new ArrayList<String>();
			    		list.add(word);
			    		anagrams.put(sortedWord, list);
			    	}
			    }
			 return anagrams; //this returns the anagrams

	}

}
