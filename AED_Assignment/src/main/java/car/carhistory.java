/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

import java.util.ArrayList;


/**
 *
 * @author rishi
 */
public class carhistory {
    ArrayList<carinput> chd;
    
    public carhistory(){
        chd=new ArrayList<carinput>();
    }

    public ArrayList<carinput> getObj() {
        return chd;
    }

    public void setObj(ArrayList<carinput> obj) {
        this.chd = chd;
    }
    
    public carinput addnew(carinput newcar){
//        carinput newdata= new carinput();
        chd.add(newcar);
        return newcar;
      
    }
    public void printCars(){
        int i;
        for(i=0;i<chd.size();i++){
            System.out.println(chd.get(i)); 
        }
       
    }
    
/*    public carinput getcarbyengine(int engine_no){
        for(int i=0;i<chd.size();i++){
            if(chd.get(i).getEngine_no()==engine_no){
                return chd.get(i);
            }
        }
        return null;
    }*/
    
}
