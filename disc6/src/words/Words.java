package words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Words {
	
	public ArrayList<String> wordList;	//All the words
	//Iterator<String> iter;		// iterator for the wordlist
	int numberOfWords;	// number of words in the file
	
	//String[] words;		// this array holds your words
	
	public Words() {
		wordList = new ArrayList<>();
	}
	
	public Words(String filename){
		wordList = new ArrayList<>();
		loadWords(filename);
	}
	/**
	 * This method loads the words from a given file
	 * @param fileName	input file name
	 */
	private void loadWords(String fileName){	
		wordList.clear();
		numberOfWords = 0;
		// This will reference one line at a time
        String line = null;
        int count = 0;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
            	wordList.add(line.toLowerCase());
                count++;
            }   

            // Always close files.
            bufferedReader.close(); 
            numberOfWords = count;
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'"); 
        }
	}
	
	
	/**
	 * @param index: index of the word you would like to retrieve 
	 * @returns {String} returns the word. Returns null if the index is out of bounds.
	 */	
	public String getWord(int index){
		//System.out.println(wordList);
		if(index < 0 || index >= numberOfWords){
			return null;
		}
		return wordList.get(index);
	}

	
	/**
	 * 
	 * @param word: the word to find
	 * @return true if the given word exits in the words array. False otherwise
	 */
	public boolean contains(String word){
		for(String s : wordList){
			if(s.equals(word)) return true;
		}
		return false;
	}
	
	
	/**
	 * An anagram is word or phrase formed by rearranging the letters of a 
	 * different word or phrase, typically using all the original letters 
	 * exactly once.[1] For example, 
	 * 
	Tar = Rat
	Arc = Car
	Elbow = Below
	State = Taste
	Cider = Cried
	Dusty = Study
	Night = Thing
	Inch = Chin
	Brag = Grab
	Cat = Act
	Bored = Robed
	Save = Vase
	Angel = Glean
	Stressed = Desserts
 
	 * @param word: input word
	 * output: print all possible anagrams in 20000words.txt file.
	 */
	/**
	 * @param word1: input word 1
	 * @param word2: input word 2
	 * @return true if word1 is the anagram of word2. False otherwise
	 */
	public boolean anagram(String word1, String word2){
		if(word1.length() != word2.length()) return false;
		
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		int[] freq = new int[256];
		
		
		for(char c: w1){
			freq[c]++;
		}
		for(char c: w2){
			freq[c]--;
		}
		for(int i = 0; i < 256; i++){
			if(freq[i] != 0) return false;
		}
		return true;
	}
	
	
	/**
	 * 
	 * @param word: the word to find
	 * 
	 * Checks to see if there is a word which can be scrambled to create the input.
	 * 
	 * e.g Our class contains the word "owns", so it will return true for containsAnagrams("snow")
	 * 
	 * @return true if the given word exits in the words array. False otherwise
	 */
	public boolean containsAnagrams(String word){
		for(String s : wordList){
			if(anagram(s, word)) return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param sentence: input sentence
	 * @return true if every word in the sentence exists in your words array. 
	 * False otherwise.
	 */
	public boolean containsSentence(String sentence){
	
		String[] splitted = sentence.split(" ");
		for(String s:splitted){
			if(!contains(s)) return false;
		}
		return true;
	}
	
	/**
	 * 	reverse a sentence
	 * 
	 * @param sentence: input sentence
	 * @return reversed sentence.
	 * For example: 
	 * 	input: "i love you"
	 *  return: "you love i" (hint: trim leading and trailing spaces")
	 */
	public String reverseSentence(String sentence){
		
		String[] splitted = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = splitted.length-1; i >= 0 ; i--){
			sb.append(splitted[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	

	/**
	 * 
	 * @param word: input word
	 * @return the number of occurrences of the word.
	 */
	public int count(String word){
		int count = 0;
		for(String s:wordList){
			if(s.equals(word)) count++;
		}
		return count;
	}
	
	/**
	 * 
	 * @param word: input word
	 * @return the number of occurrences of the anagram for the word.
	 */
	public int countAnagrams(String word){
		int count = 0;
		for(String s:wordList){
			if(anagram(s, word)) count++;
		}
		return count;
	}
	

	
		
	
	/**
	 
	 * 
	 * @param word: input word
	 * @param fileName: input file name
	 * 
	 * Given a file that includes a list words, print all words that are the anagrams 
	 * of a given word.  **The iterator must work concurrently**
	 * File name of the file is given as the second argument 
	 * 
	 * @return {Iterator} Iterator that goes through the results
	 * 
	 */
	public Iterator<String> findAnagram(String word){
		//TODO
	}
	
	
	/**
	 * 
	 * @param letters: input
	 * @param fileName: file name of the word list
	 * 
	 * List all words from the file if we make the word using the characters 
	 * of the first argument letter. **The iterator must work concurrently**.
	 * 
	 * For example: you can make rain, gain, virgin using the letters of virginia. 
	 * @return 
	 * @returns {Iterator} Iterator that goes through the results
	 */
	public Iterator<String> findWords(String letters, String fileName){
		//TODO
	}
}
