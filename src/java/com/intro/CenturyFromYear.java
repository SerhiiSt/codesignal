package com.intro;

public class CenturyFromYear {
    int centuryFromYear(int year) {
        return ((year-1)/100 + 1);
        //return (year % 100 == 0) ? year / 100 : year / 100 + 1;
    }

}
