/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author AARONICA
 */
public class node {
    node(){};
     int da;//declare node value
node lft;//left pointer for left child
node rght;//right pointer for right child
node (int x){//node initializing constructor
    
    da=x;
    lft=null;
    rght=null;
}

//USe of traverse

  
public void d1(node q){//pre-order traversal
     
if(q==null)
System.out.print("");
else{
     System.out.print(q.da);
     
     
     d1(q.lft);
     d1(q.rght);
    
}
}
public void d(node v){//in-order traversal
       if(v==null){
           System.out.print("");
       }
       else {
           
          d(v.lft);
          System.out.print(v.da);
          d(v.rght);
         System.out.print(" ");
/*public void f(int z){
 da=z;
    lft=null;
    rght=null;
   
   
};*/

}
}

public void d2(node a){//Post order traversal
if(a!=null){
    d2(a.lft);
    d2(a.rght);
    System.out.print(a.da);
}
}

public void c1(node w, int e){// search operation
    int x=1;
    
    if(w==null)
       System.out.print(" not found ");
    
    Queue<node> queue=new LinkedList<>();
    queue.add(w);
    for(;!queue.isEmpty();){
        node current=queue.poll();
        if(current.da==e){
           System.out.print(" found ");
        break;}
        if(current.lft==null)
           System.out.print(" ");   
           else 
            queue.add(current.lft);
        if(current.rght==null){
         
            
        }
        else
                 queue.add(current.rght);
     
          if(current.lft==null&&current.rght==null&&queue.isEmpty()){
                 System.out.print(" not found ");
          break;
          }
    }
    
  

}

//deletion operation
public void del1(node r,int po){
if(r==null)
    System.out.print("deleted");
Queue<node> queue=new LinkedList<>();
  queue.add(r);
node start;
node finish;
while(!queue.isEmpty()){
    finish=queue.poll();
    
    if(finish.da==po){
        start=finish;
         for(;!queue.isEmpty();){
      node current=queue.poll();
      if(current.lft!=null&&current.lft==start){
            current.lft=null;
          break;}
      else
         queue.add(current.lft);
       if(current.rght!=null&&current.rght==start)
           current.rght=null;
  
  else
         queue.add(current.rght);
         }
        break;
    }
     if(finish.lft!=null)
        queue.add(finish.lft);
         if(finish.rght!=null)
        queue.add(finish.rght);
    
    
}

}/*  finish=start;
 del2(r, finish);     
}
public void del2(node rt, node f){
  Queue<node> queue=new LinkedList<>();
  queue.add(rt);
  while(!queue.isEmpty()){
      node current=queue.poll();
      if(current.lft==null)
            queue.add(current.lft);
          
      else
         queue.add(current.lft);
       if(current.rght!=null&&current.rght==f)
           current.rght=null;
  
  else
         queue.add(current.rght);
  }
  
}*/




//insertion operation
public void insert(int val) {
node rot=null;
    
       if(rot==null){
             rot=new node(val);
       
       }
       /*Queue<node> queue=new LinkedList<>();
       queue.add(rot);
       
       for(;!queue.isEmpty();){
           node current=queue.poll();/*/
           if(val>rot.da){
             lft=new node(val);
              
               
           }
           else
              
           
           if(val<rot.da){
              rght=new node(val);
               
               
           }
       
             
           
       }
    }





