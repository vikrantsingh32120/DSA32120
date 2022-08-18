package recursionAndBackTracking;

import java.util.*;

public class KnightWalkGFG1 {
	
	static class Node
    {
        int y,x;
        int steps;
        Node(int i,int j,int moves)
        {
            y = j;
            x = i;
            steps = moves;
        }
    }
	
	static int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
    static int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    
	public static void main(String[] args) {
		Node source=new Node(4,5,0);
		Node Target=new Node(1,1,-1);
		int step=BFS(source,Target,6);
		System.out.println(step);
	}
	
	public static int BFS(Node source,Node target,int N) {
		HashSet<String> visited=new HashSet<>();
		Queue<Node> q=new LinkedList<>();
		q.add(source);
        
        // BFS traversal 
        while(!q.isEmpty())
        {
            Node front = q.poll();
            if(front.y == target.y && front.x == target.x)
            return front.steps;
            
            // traverse all neighbors of current cell
            for(int i=0;i<8;i++)
            {
                int next_y = front.y + dy[i];
                int next_x = front.x + dx[i];
                String search = next_y + "|" + next_x;
                if(visited.contains(search) == false && next_y > 0 && next_x > 0 && next_y <= N && next_x <= N)
                {
                    Node next = new Node(next_x,next_y,front.steps+1);
                    q.add(next);
                    visited.add(search);
                }
            }
        }
        return 0;
	}

}
