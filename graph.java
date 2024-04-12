import java.util.*;
public class graph
{
    static class edge
    {
        int src;
        int dest;
        int wt;
        public edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void create(ArrayList<edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2,2));
        graph[1].add(new edge(1,2,10));
        graph[1].add(new edge(1,3,6));
        graph[2].add(new edge(2,0,3));
        graph[2].add(new edge(2,1,-4));
        graph[2].add(new edge(2,3,5));
        graph[3].add(new edge(3,1,4));
        graph[3].add(new edge(3,0,1));
    }
    static void main(String args[])
    {
        int v=4;
        Scanner sc=new Scanner(System.in);
        ArrayList<edge> graph[]=new ArrayList[v];
        create(graph);
        System.out.println("Enter the vertex whose neighbours you want=");
        int a=sc.nextInt();
        for(int i=0;i<graph[a].size();i++)
        {
            edge e=graph[a].get(i);
            System.out.println(e.dest+","+e.wt);
        }
    }
}