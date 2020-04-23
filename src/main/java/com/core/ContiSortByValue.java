package com.core;

public class ContiSortByValue implements Comparable<ContiSortByValue>
{
    private String key;
    private Integer value;
    public ContiSortByValue()
    {
        // TODO Auto-generated constructor stub
    }
       public ContiSortByValue(String key, Integer value)
      {
        super();
        this.key = key;
        this.value = value;
      }
    public int compareTo(ContiSortByValue obj)
   {    
        return this.value - obj.value;
    }
    @Override
    public String toString()
    {
        return key + "-->" + value;
    }

}