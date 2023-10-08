package fastcampus.class01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Edge1 implements Comparable<Edge1>{
    public int distance;
    public String vertex;

    public Edge1(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    // System.out.println() 으로 객체 자체 출력시,
    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge1 edge) {
        return this.distance - edge.distance;
    }

    public static void main(String[] args) {
        PriorityQueue<Edge1> priorityQueue = new PriorityQueue<Edge1>();
        priorityQueue.add(new Edge1(2, "A"));
        priorityQueue.add(new Edge1(5, "B"));
        priorityQueue.offer(new Edge1(1, "C"));
        priorityQueue.offer(new Edge1(7, "D"));

        System.out.println(priorityQueue);
        priorityQueue.peek(); //꺼내기

        Edge1 edge1 = priorityQueue.poll(); //꺼내고 삭제하기
        System.out.println(edge1);
        System.out.println(priorityQueue);

        // 데이터 사이즈 확인하기
        System.out.println("priorityQueue.size() = " + priorityQueue.size());

        HashMap<String, ArrayList<Edge1>> graph = new HashMap<String, ArrayList<Edge1>>();
        graph.put("A", new ArrayList<Edge1>(Arrays.asList(new Edge1(8, "B"), new Edge1(1, "C"), new Edge1(2, "D"))));
        graph.put("B", new ArrayList<Edge1>());
        graph.put("C", new ArrayList<Edge1>(Arrays.asList(new Edge1(5, "B"), new Edge1(2, "D"))));
        graph.put("D", new ArrayList<Edge1>(Arrays.asList(new Edge1(3, "E"), new Edge1(5, "F"))));
        graph.put("E", new ArrayList<Edge1>(Arrays.asList(new Edge1(1, "F"))));
        graph.put("F", new ArrayList<Edge1>(Arrays.asList(new Edge1(5, "A"))));

        for (String key : graph.keySet()) {
            System.out.println(key);
            System.out.println(graph.get(key));
        }

        ArrayList<Edge1> nodeList = graph.get("A");
        for (int index = 0; index < nodeList.size(); index++) {
            System.out.println(nodeList.get(index));
        }
    }
}
