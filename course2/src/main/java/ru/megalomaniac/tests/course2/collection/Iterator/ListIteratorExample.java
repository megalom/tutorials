package ru.megalomaniac.tests.course2.collection.Iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "tennet";
        List<Character> list = new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext()&&reverseIterator.hasPrevious()){
            if(iterator.next()!=reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

}
