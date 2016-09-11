package ru.sberbank;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution
{

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    File file = new File("E:\\ÑáåðÒåõ\\Java school\\HelloWorld\\src\\ru\\sberbank\\input.txt");
        //    FileReader fileReader = new FileReader(file);
        //   BufferedReader br = new BufferedReader(fileReader);
        int count = Integer.parseInt(br.readLine());
        String text;
        String pattern = "[e|y|u|i|o|a]{3,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        for (int i = 0; i<count; i++){
            m = p.matcher(text = br.readLine());
            if (!m.find())
                System.out.println(text);
        }

    }
}