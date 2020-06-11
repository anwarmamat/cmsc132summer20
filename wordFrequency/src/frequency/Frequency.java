/*
* This class counts the word frequency
 */
package frequency;

import java.util.Iterator;
/**
 * @author UMD CS
 * CMSC132 Summer 2017
 */
public class Frequency<E extends Comparable> implements Iterable<E>{
    private Node first;	//starting node
    private Node parent;	//parent of currently processed node
    private int N;	//number of words
    
    /**
     * Linked List Node
     */
    private class Node {
    	private E key;
    	private int count;
        private Node next;
        /**
         * 	Constructor
         */
        Node(E e){
           key = e;
           count = 1;
           next = null;
        }
        /**
         * 	Constructor
         */
        Node(E e, Node r){
            key = e;
            count = 1;
            next = r;
         }
        
        @Override 
        public String toString(){
        	return "("+key +","+count+")";
        }
		
    }

   /**
    * Inserts a word into linked list
    * @param key to be insterted 
    * @return true if the key is inserted successfully.
    */
    public boolean insert(E key){
		//TODO
	}
    
   /**
    * removes the nodes with given key
    * @param key: 
    * @return the deleted node
    */
    private Node remove(E key){
		//TODO
	}

    /**
     * Inserts a node into correct location in the linked list
     * @param r is the node to be inserted
     * @return true if successful
     */
    private boolean insert(Node r){
		//TODO
	}
    
    
    /**
     * @param k is the key to be searched for
     * @return the node that has the word as its key
     */
    private Node find(E k){
		//TODO
	}
    
    /**
     * 
     * @param key is the key to be searched for
     * @return frequency of the key. Returns -1 if key does not exist
     * 
     */
    public int getCount(E key){
		//TODO
	}
    /**
     * Returns the first n words and count
     * @param n number of words to be returned
     * @return first n words in (word, count) format
     */
    public String getWords(int n){
		//TODO
	}
    
    
    /**
     * Frequency List iterator
     */
    @Override
    public Iterator<E> iterator() {
        return new FreqIterator();
    }
    
    /**
     * 
     * Frequency List iterator class
     *
     */
    private class FreqIterator implements Iterator<E>{
      @Override
      public boolean hasNext() {
		//TODO
	}
      @Override
      public E next() {
		//TODO
	}
    }
}
    
