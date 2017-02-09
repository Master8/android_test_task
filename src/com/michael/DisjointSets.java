package com.michael;

public class DisjointSets
{
    private int[] elements;

    public DisjointSets(int size)
    {
        elements = new int[size];

        for (int i = 0; i < size; i++)
        {
            elements[i] = i;
        }
    }

    public void union(int p, int q)
    {
        int firstSet = elements[p];
        int secondSet = elements[q];

        if (firstSet == secondSet)
            return;

        for (int i = 0; i < elements.length; i++)
            if (elements[i] == secondSet)
                elements[i] = firstSet;
    }

    public boolean find(int p, int q)
    {
        return elements[p] == elements[q];
    }
}
