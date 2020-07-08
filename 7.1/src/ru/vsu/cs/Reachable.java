package ru.vsu.cs;

import ru.vsu.cs.course1.graph.AdjListsGraph;
import ru.vsu.cs.course1.graph.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reachable {
    private Object ArrayList;

    public List<Integer> findUnreachable(Graph graph, Integer vertex){
        List<Integer> unreachableList = new ArrayList<>();
        for(int i=0;i<graph.vertexCount();i++){
            if(i!=vertex && !graph.isAdj(i,vertex)) {
                unreachableList.add(i);
            }
        }
        return unreachableList;
    }
}
