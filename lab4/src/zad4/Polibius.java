package zad4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Polibius implements Algorithm{

    static Map<Character, Integer> _lowercaseMap;
    static{
        Map<Character, Integer> tmp = new HashMap<Character, Integer>();
        tmp.put('a',11);
        tmp.put('b',12);
        tmp.put('c',13);
        tmp.put('d',14);
        tmp.put('e',15);
        tmp.put('f',21);
        tmp.put('g',22);
        tmp.put('h',23);
        tmp.put('i',24);
        tmp.put('j',24);
        tmp.put('k',25);
        tmp.put('l',31);
        tmp.put('m',32);
        tmp.put('n',33);
        tmp.put('o',34);
        tmp.put('p',35);
        tmp.put('q',41);
        tmp.put('r',42);
        tmp.put('s',43);
        tmp.put('t',44);
        tmp.put('u',45);
        tmp.put('v',51);
        tmp.put('w',52);
        tmp.put('x',53);
        tmp.put('y',54);
        tmp.put('z',55);
        _lowercaseMap = Collections.unmodifiableMap(tmp);
    }

    public String crypt(String word) {
        String crypted = "";
        for(int i=0;i<word.length();++i){
            crypted += _lowercaseMap.get(word.charAt(i));
        }
        return crypted;
    }

    @Override
    public String decrypt(String word) {
        String decrypted = "";
        String tmp = "";
        for(int i=0;i<word.length();i+=2){
            tmp += word.charAt(i);
            tmp += word.charAt(i+1);
            decrypted += _lowercaseMap;
        }
        return null;
    }
}
