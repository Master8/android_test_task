package com.michael;

public class Solution
{
    public static void main(String[] args)
    {
        DisjointSets disjointSets = new DisjointSets(8);
        disjointSets.union(1, 4);
        disjointSets.union(5, 4);
        disjointSets.union(2, 3);
        disjointSets.union(6, 2);
        disjointSets.union(7, 3);

        System.out.println(disjointSets.find(2, 5));

        disjointSets.union(2, 5);

        System.out.println(disjointSets.find(2, 5));
        System.out.println(disjointSets.find(0, 1));
    }
}
