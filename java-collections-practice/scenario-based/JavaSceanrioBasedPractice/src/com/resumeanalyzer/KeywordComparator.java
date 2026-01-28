package com.resumeanalyzer;

import java.util.Comparator;

class KeywordComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        ResumeData r1 = (ResumeData) o1;
        ResumeData r2 = (ResumeData) o2;
        return r2.keywordCount - r1.keywordCount;
    }
}
