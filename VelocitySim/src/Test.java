
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
	

	public static byte[][] setPoint(byte[][] graph,int[]coor){	
		try{
			graph[coor[0]][coor[1]]=1;
		}
		catch(ArrayIndexOutOfBoundsException e){
		}

		return graph;
	}
	public static byte[][] setPoints(byte[][] graph,int[][]coor){
		for(int []a : coor){
			Graph.setPoint(graph,a);
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
class Shapes{
	public static byte[][] circle(byte[][]graph,int cor[]){
		for(int a=0;a<360;a++){
			int x= (int)Math.round(cor[2]*Math.cos(a))+cor[0];
			int y= (int)Math.round(cor[2]*Math.sin(a))+cor[1];
			Graph.setPoint(graph,new int[]{x,y});
		}
		return graph;
	}
}





class VelocitySimulation{
	public static float velocity(float s0,float sf,float t0,float tf){
		return ((sf-s0)/(tf-t0));
	}
	
	public void  test(){
		int rows=200;
		int cols=200;
		byte[][] graph=Graph.generate(rows,cols);
		graph=Shapes.circle(graph,new int[]{cols/2,rows/2,20});
		graph=Shapes.circle(graph,new int[]{cols/2+4,rows/2+4,20});
		Graph.print(graph,' ','V');
	}


	
}


public class Test{
	public static void main(String[]args){
		new VelocitySimulation().test();
	}
}
