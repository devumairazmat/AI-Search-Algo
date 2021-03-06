package net.codejava;
import java.util.Vector;
import java.util.Scanner;

class city{
 public int f_n; //straightLineDistfromGoal;
 public int g_n; //straightLineDistfromSource;
 public int total;
 public String cityName;
 Node n;

 city(String Name,int stDG, int stDS, Node nn){
 f_n = stDG;
 g_n = stDS;
 total = f_n + g_n;
 cityName = Name;
 n = nn;
 }
}
class Node{ 

 public String nodeName;
 public Vector<city> nextNodes; 
 Node Start;

 
 Node(String Name, Vector<city>  nns){
 nodeName = Name;
 nextNodes = nns; 
 }

Node(String Name){nodeName = Name;}
  
 public void Initialization(){
  Node Arad = new Node("Arad");
  Node Sibiu = new Node("Sibiu");
  Node RimicuVilcea = new Node("RimicuVilcea");
  Node Pitesti = new Node("Pitesti");
  Node Zerind = new Node("Zerind");
  Node Timisoara = new Node("Timisoara");
  Node Craiova = new Node("Craiova");
  Node Bucharest = new Node("Bucharest");
  Node Oradea = new Node("Oradea");
  Node Fagaras= new Node("Fagaras");
  Node Urziceni= new Node("Urziceni");
  Node Hirsova= new Node("Hirsova");
  Node Vaslui= new Node("Vaslui");
  Node Eforie= new Node("Eforie");
  Node Iasi= new Node("Iasi");
  Node Neamt= new Node("Neamt");
  Node Lugoj= new Node("Lugoj");
  Node Mehadia= new Node("Mehadia");
  Node Dobreta= new Node("Dobreta");
  Node Giurgiu = new Node ("Giurgiu");
 

  Vector<city> vec1 = new Vector<city>();
  vec1.add(new city("Sibiu",253,140,Sibiu));
  vec1.add(new city("Zerind",374,75,Zerind)); 
  vec1.add(new city("Timisoara",329,118,Timisoara));
  Arad.nodeName = "Arad";
  Arad.nextNodes = vec1;

  Vector<city> vec2 = new Vector<city>();
  vec2.add(new city("Arad",366,280,Arad));
  vec2.add(new city("Fagaras",176,239,Fagaras));
  vec2.add(new city("RimicuVilcea",193,220,RimicuVilcea));
  vec2.add(new city("Oradea",380,291,Oradea));
  Sibiu.nodeName = "Sibiu";
  Sibiu.nextNodes = vec2;

  Vector<city> vec3 = new Vector<city>();
  vec3.add(new city("Pitesti",100,317,Pitesti));
  vec3.add(new city("Craiova",160,366,Craiova));
  vec3.add(new city("Sibiu",253,300,Sibiu));
  RimicuVilcea.nodeName = "Rimicu_Vilcea";
  RimicuVilcea.nextNodes = vec3;


  Vector<city> vec4 = new Vector<city>();
  vec4.add(new city("RimicuVilcea",193,414,RimicuVilcea));
  vec4.add(new city("Craiova",160,455,Craiova));
  vec4.add(new city("Bucharest",0,418,Bucharest));
  Pitesti.nodeName  = "Pitesti";
  Pitesti.nextNodes = vec4;
  
  Vector<city> vec5 = new Vector<city>();
//  vec5.add(new city("Zerind",374,445,Zerind));
  vec5.add(new city("Sibiu",374,525,Sibiu));
  Oradea.nodeName = "Oradea";
  Oradea.nextNodes = vec5;
  
  Vector<city> vec6 = new Vector<city>();
  vec6.add(new city("Arad",366,441,Arad));
  vec6.add(new city("Oradea",380,522,Oradea));
  Zerind.nodeName = "Zerind";
  Zerind.nextNodes =vec6;

  Vector<city> vec7 = new Vector<city>();
  // vec7.add(new city("Arad",366,484,Arad)); 
  vec7.add(new city("Lugoj",244,355,Lugoj)); //undo
  Timisoara.nodeName = "Timisoara";
  Timisoara.nextNodes = vec7;
  

  Vector<city> vec8 = new Vector<city>();
  vec8.add(new city("Timisoara",329,440,Timisoara));
  vec8.add(new city("Mehadia",241,311,Mehadia)); //undo
  Lugoj.nodeName="Lugoj";
  Lugoj.nextNodes = vec8;
  
  Vector<city> vec9 = new Vector<city>();
//  vec9.add(new city("Lugoj",244,314,Lugoj));
  vec9.add(new city("Dobreta",242,317,Dobreta)); //undo
  Mehadia.nodeName="Mehadia";
  Mehadia.nextNodes = vec9;
  
  Vector<city> vec10 = new Vector<city>();
  vec10.add(new city("Mehadia",241,316,Mehadia));
  vec10.add(new city("Craiova",160,280,Craiova)); //undo
  Dobreta.nodeName="Dobreta";
  Dobreta.nextNodes = vec10;
  
  Vector<city> vec11 = new Vector<city>();
  vec11.add(new city("Dobreta",242,362,Mehadia));
  vec11.add(new city("Pitesti",100,238,Pitesti));
  vec11.add(new city("RimicuVilcea",193,339,RimicuVilcea));
  Craiova.nodeName="Craiova";
  Craiova.nextNodes = vec11;
  
  Vector<city> vec12 = new Vector<city>();
  vec12.add(new city("Sibiu",253,352,Sibiu));
  vec12.add(new city("Bucharest",0,211,Bucharest));
  Fagaras.nodeName="Fagaras";
  Fagaras.nextNodes = vec12;
  
  Vector<city> vec13 = new Vector<city>();
  vec13.add(new city("Bucharest",0,90,Bucharest));
  Giurgiu.nodeName="Giurgiu";
  Giurgiu.nextNodes = vec13;
  
  Vector<city> vec14 = new Vector<city>();
  vec14.add(new city("Iasi",226,313,Iasi));
  Neamt.nodeName="Neamt";
  Neamt.nextNodes = vec14;
  
  
  Vector<city> vec15 = new Vector<city>();
  vec15.add(new city("Vaslui",199,291,Vaslui));
  Iasi.nodeName="Iasi";
  Iasi.nextNodes = vec15;
  
  Vector<city> vec16 = new Vector<city>();
  vec16.add(new city("Urziceni",80,222,Urziceni));
  Vaslui.nodeName="Vaslui";
  Vaslui.nextNodes = vec16;
  
  Vector<city> vec17 = new Vector<city>();
  vec17.add(new city("Hirsova",151,249,Hirsova));
  vec17.add(new city("Bucharest",0,85,Bucharest));
  Urziceni.nodeName="Urziceni";
  Urziceni.nextNodes = vec17;
  
  Vector<city> vec18 = new Vector<city>();
  vec18.add(new city("Urziceni",80,178,Urziceni));
  vec18.add(new city("Eforie",161,247,Eforie));
  Hirsova.nodeName="Hirsova";
  Hirsova.nextNodes = vec18;
  
  Vector<city> vec19 = new Vector<city>();
  vec19.add(new city("Hirsova",80,166,Hirsova));
  Eforie.nodeName="Eforie";
  Eforie.nextNodes = vec19;
  
  Scanner scan = new Scanner(System.in);
	System.out.print("Please enter number for your starting City \n 1:Arad\n 2:Sibiu\n 3:Rimicu Vilcea \n 4:Pitesti \n  5:Oredea \n 6:Zerind \n 7:Timisoara \n 8:Lugoj \n 9:Mehadia \n 10:Dobreta \n 11:Craiova \n 12:Fagaras \n 13:Giurgiu \n 14:Neamt \n 15:Iasi \n 16:Vaslui \n 17:Urziceni \n 18:Hirsova \n 19:Eforie >>");
	  Integer startCity = scan.nextInt();
    if (startCity == 1) {

		  Start = Arad;
    }
    else if(startCity==2) {
		  Start = Sibiu;

    }
    else if(startCity==3) {
		  Start = RimicuVilcea;

  }
    else if(startCity==4) {
		  Start = Pitesti;

  }
    else if(startCity==5) {
		  Start = Oradea;

  }
    else if(startCity==6) {
		  Start = Zerind;

  }
    else if(startCity==7) {
		  Start = Timisoara;

}
    else if(startCity==8) {
		  Start = Lugoj;

}
    else if(startCity==9) {
		  Start = Mehadia;

} 
    else if(startCity==10) {
		  Start = Dobreta;

}
    else if(startCity==11) {
		  Start = Craiova;

}   
    else if(startCity==12) {
		  Start = Fagaras;

} 
    else if(startCity==13) {
		  Start = Giurgiu;

}
    else if(startCity==14) {
		  Start = Neamt;

}
    else if(startCity==15) {
		  Start = Iasi;

}
    else if(startCity==16) {
		  Start = Vaslui;

}
    else if(startCity==17) {
		  Start = Urziceni;

}
    else if(startCity==18) {
		  Start = Hirsova;

}
    else if(startCity==19) {
		  Start = Eforie;

}
    
    else {
    System.out.print("Please enter valid city");	
    }
    

  }
public void Search(){
  String dest = "ab";
  int min = 0;
  Node curr = Start;
  System.out.println(curr.nodeName);


  while (dest != "Bucharest"){
   min = curr.nextNodes.elementAt(0).total; 
   Node psudoCurr = curr.nextNodes.elementAt(0).n;
     for(int i = 1; i < curr.nextNodes.size(); i++){
         if (min > curr.nextNodes.elementAt(i).total){
            min = curr.nextNodes.elementAt(i).total;
            psudoCurr = curr.nextNodes.elementAt(i).n;
          }
      }
     curr = psudoCurr;
     dest = curr.nodeName; 
     System.out.println(dest);
   }
  }

}
public class HelloWorld {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Node n = new Node("dummy");
		 n.Initialization();
		 n.Search();
	}

}
