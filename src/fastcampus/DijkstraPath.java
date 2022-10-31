package fastcampus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraPath {
    public HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge1>> graph, String start) {
        Edge1 edgeNode;
        Edge1 adjacentNode;
        ArrayList<Edge1> nodeList;
        int currentDistance, weight, distance;
        String currentNode, adjacent;

        HashMap<String, Integer> distances = new HashMap<>();
        for (String key : graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<Edge1> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge1(distances.get(start), start));

        // 알고리즘 작성
        while (priorityQueue.size() > 0) {
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currentNode = edgeNode.vertex;

            if (distances.get(currentNode) < currentDistance) {
                continue;
            }

            nodeList = graph.get(currentNode);
            for (int index = 0; index < nodeList.size(); index++) {
                adjacentNode = nodeList.get(index);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;
                distance = currentDistance + weight;

                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.add(new Edge1(distance, adjacent));
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Edge1>> graph = new HashMap<String, ArrayList<Edge1>>();
        graph.put("A", new ArrayList<>(Arrays.asList(new Edge1(8, "B"), new Edge1(1, "C"), new Edge1(2, "D"))));
        graph.put("B", new ArrayList<>());
        graph.put("C", new ArrayList<>(Arrays.asList(new Edge1(5, "B"), new Edge1(2, "D"))));
        graph.put("D", new ArrayList<>(Arrays.asList(new Edge1(3, "E"), new Edge1(5, "F"))));
        graph.put("E", new ArrayList<>(Arrays.asList(new Edge1(1, "F"))));
        graph.put("F", new ArrayList<>(Arrays.asList(new Edge1(5, "A"))));

        DijkstraPath dObject = new DijkstraPath();
        HashMap<String, Integer> a = dObject.dijkstraFunc(graph, "A");
        System.out.println("a = " + a);
    }
}
