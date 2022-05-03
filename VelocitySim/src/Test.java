class Graph{
	public static byte[][] generate(int x,int y){
		byte[][]graph=new byte[y][x];
		for(int a=0;a<y;a++){
			for(int b=0;b<x;b++){
				graph[a][b]=0;
			}
		}
		return graph;
	}
	public static void print(byte[][]graph,char space,char obj){
		for(int a=graph.length-1;a>=0;a--){
			for(int b=0;b<graph[a].length;b++){
				if (graph[a][b]==0){
					System.out.print(space);
				}
				else{
					System.out.print(obj);
				}
		}
		System.out.println();
		}
	
	}
}





class VelocitySimulation{
	public static float velocity(float s0,float sf,float t0,float tf){
		return ((sf-s0)/(tf-t0));
	}
	public void  test(){
		byte[][] graph=Graph.generate(10,10);
		graph[1][2]=1;
		Graph.print(graph,'.','#');
	}


	
}


public class Test{
	public static void main(String[]args){
		new VelocitySimulation().test();
	}
}
