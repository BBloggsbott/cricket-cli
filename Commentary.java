import cricbuzz.Cricbuzz;
import java.util.Map;

class Commentary extends Thread{
    Cricbuzz c; int id;
    Map<String,Map> comm;
    Commentary(int id){
        c = new Cricbuzz();
        this.id = id;
    }

    public void run(){
        try{
        comm = c.commentary(id+"");
        System.out.println(comm.get("commentary").get("text"));
        }
        catch(Exception e){
            System.out.println("Error getting commentary: "+e);
        }
    }
}