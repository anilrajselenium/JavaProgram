package com.csrk.excercises;

public class Rev
{
public String reverse(String str)
{
if ((str==null)||(str. length() <= 1) )
return str;
return reverse(str. substring(1)) + str. charAt(0);
}
}