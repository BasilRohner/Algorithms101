package structures;

import java.util.ArrayList;

public class UnionFind {

    private ArrayList<Integer> repLst;
    private int[] repArr;

    public UnionFind(ArrayList<Integer> vertices) {

    }

    public int getRep(int v) {
        return repArr[v];
    }

    public boolean same(int v, int w) {
        return getRep(v) == getRep(w);
    }

    public void unite(int v, int w) {

    }

}
