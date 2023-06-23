/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TEST2 {

public static void main(String[] args) {
    String[] a={"X", "2153912686530215391268653021539126865302153912686530", "G" , "Asesino","1"};           
    List<List<String>> list = new TEST2().getAllCombinations(Arrays.asList(a));
    for (List<String> arr:list) {
        for(String s:arr){
            System.out.print(s);
        }
        System.out.println();
    }
}

public List<List<String>> getAllCombinations(List<String> elements) {
    List<List<String>> combinationList = new ArrayList<List<String>>();
    for ( long i = 1; i < Math.pow(2, elements.size()); i++ ) {
        List<String> list = new ArrayList<String>();
        for ( int j = 0; j < elements.size(); j++ ) {
            if ( (i & (long) Math.pow(2, j)) > 0 ) {
                list.add(elements.get(j));
            }
        }
        combinationList.add(list);
    }
    return combinationList;
}

}
    