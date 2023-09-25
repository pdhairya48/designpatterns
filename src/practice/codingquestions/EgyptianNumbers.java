package practice.codingquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EgyptianNumbers {
    private static int convertToDecimal(String num, Map<Character, Integer> map){
        int base = map.size();
        int val = 0;
        for(int i = 0; i < num.length(); i++)
            val+= (int) (Math.pow(base, num.length() - 1 - i)*map.get(num.charAt(i)));
        return val;
    }

    private static String convertToBase(int num, Map<Integer, Character> map){
        int base = map.size();
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int remainder = num % base;
            num = num / base;
            sb.append(map.get(remainder));
        }
        return sb.reverse().toString();
    }

    private static String convert(String num, String alphabet1, String alphabet2){
        Map<Character, Integer> aMap1 = new HashMap<>();
        Map<Integer, Character> aMapReversed2 = new HashMap<>();

        for(int i=0; i<alphabet1.length(); i++)
            aMap1.put(alphabet1.charAt(i), i);

        for(int i=0; i<alphabet2.length(); i++)
            aMapReversed2.put(i, alphabet2.charAt(i));

        int decimal = convertToDecimal(num, aMap1);
        String res = convertToBase(decimal, aMapReversed2);
        return res;
    }

    private static String conver(String num,String alphabet1,String alphabet2){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Integer,Character> reverseMap = new HashMap<>();
        for(int i=0;i<alphabet1.length();i++){
            map1.put(alphabet1.charAt(i),i);
        }
        for(int i=0;i<alphabet1.length();i++){
            reverseMap.put(i,alphabet1.charAt(i));
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i=0; i < cases; i++){
            String inputCase = scanner.nextLine();
            String[] parts = inputCase.split(" ");
            String res = convert(parts[0], parts[1], parts[2]);
            System.out.println("Case #" + (i+1) + ": " + res);
        }
        scanner.close();
    }
}
