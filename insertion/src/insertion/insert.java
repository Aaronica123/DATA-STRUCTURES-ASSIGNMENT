
package insertion;
import java.util.LinkedList;
import java.util.Queue;

 class Nod{
     Nod(){};
     int da;//declare node value
Nod lft;//left pointer for left child
Nod rght;//right pointer for right child
Nod(int x){//node initializing constructor
    
    da=x;
    lft=null;
    rght=null;
}
        
}
public class insert {
Nod rot=null;
    
    public void in(int val){
       if(rot==null){
             rot=new Nod(val);
         return;
       }
       Queue<Nod> queue=new LinkedList<>();
       queue.add(rot);
       
       while(!queue.isEmpty()){
           Nod current=queue.poll();
           if(current.lft==null){
               current.lft=new Nod(val);
               break;
               
           }
           else
               queue.add(current.lft);
           
           if(current.rght==null){
               current.rght=new Nod(val);
               break;
               
           }
           else
               queue.add(current.rght);
           
       }
    }
    public void display(Nod rot){
        if(rot==null)
            return;
        Queue<Nod> queue=new LinkedList<>();
        queue.add(rot);
        
        while(queue.isEmpty()){
            Nod current=queue.poll();
            System.out.print(current.da);
             
            if(current.lft ==null)
                System.out.print(" ");
            else if(current.lft!=null)
                queue.add(current.lft);
            if(current.rght==null)
                 System.out.print(" ");
            else if(current.rght!=null)
                queue.add(current.rght);
            
        }
        
        
}
}

