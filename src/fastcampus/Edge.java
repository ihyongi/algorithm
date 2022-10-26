package fastcampus;

import java.util.Arrays;
import java.util.Comparator;

public class Edge implements Comparable<Edge> {
     /**
      * - Comparable 인터페이스는 compareTo() 메서드를 override 해서 구현
      *       - 일반적으로는 정렬할 객체에 implements 로 Comparable 인터페이스를 추가하여 구현
      * - Comparator 인터페이스는 compare() 메서드를 override 해서 구현
      *       - 일반적으로는 별도 클래스를 정의해서 구현하며, 따라서, 동일 객체에 다양한 정렬 기준을 가진 클래스를 작성 가능
      */
        public Integer distance;
        public String vertex;

        public Edge(Integer distance, String vertex) {
            this.distance = distance; //간선
            this.vertex = vertex; //가중치
        }

        @Override
        public int compareTo(Edge e) {
            return this.distance - e.distance;
        }

     public static void main(String[] args) {
         Edge edge1 = new Edge(12, "A");
         Edge edge2 = new Edge(10, "A");
         Edge edge3 = new Edge(13, "A");
         Edge[] edges = new Edge[]{edge1, edge2, edge3};

         //comparable
         Arrays.sort(edges);
         for(int index = 0; index<edges.length;index++) {
             System.out.println(edges[index].distance);
         }

        //comparator 더 우선순위를 가진다.. ;;뭐라노
         Arrays.sort(edges, new Comparator<Edge>() {
             @Override
             public int compare(Edge objectItem1, Edge objectItem2) {
                 return objectItem2.distance - objectItem1.distance;
             }
         });
     }
    }


