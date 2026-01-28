package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    public static void main(String[] args) {

        File folder = new File("resumes");
        File[] files = folder.listFiles();

        Map<String, ResumeData> resumeMap = new HashMap();
        List<ResumeData> list = new ArrayList();

        Pattern emailPattern =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
        Pattern phonePattern =
            Pattern.compile("\\b\\d{10}\\b");
        Pattern skillPattern =
            Pattern.compile("Java|Python|Spring");

        for (int i = 0; i < files.length; i++) {
            try {
                File file = files[i];

               

                BufferedReader br =
                    new BufferedReader(new FileReader(file));

                String line;
                String content = "";

                while ((line = br.readLine()) != null) {
                    content = content + line;
                }
                br.close();

                Matcher m1 = emailPattern.matcher(content);
                Matcher m2 = phonePattern.matcher(content);
                Matcher m3 = skillPattern.matcher(content);

                if (!m1.find()) {
                    throw new Exception("Email not found");
                }

                String email = m1.group();
                String phone = m2.find() ? m2.group() : "NA";

                int count = 0;
                while (m3.find()) {
                    count++;
                }

                ResumeData data =
                    new ResumeData(email, phone, count);

                resumeMap.put(email, data);
                list.add(data);

            } catch (Exception e) {
                System.out.println("Skipped: " + files[i].getName());
            }
        }

        Collections.sort(list, new KeywordComparator());

        for (int i = 0; i < list.size(); i++) {
            ResumeData r = list.get(i);
            System.out.println(
                r.email + " | " + r.phone + " | " + r.keywordCount
            );
        }
    }
}
