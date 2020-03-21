import Main.Constants;
import Main.Rendering.GameFrame;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;

public class Main {
    public static void main(String[] args){
        Entity Ent1 = new Entity(5, 5, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        GameFrame MainFrame = RenderEngine.init();
        while(true){
            RenderEngine.Frame(Constants.TestStage, EntList1, MainFrame);//TODO when adding multiple frames, remember to call BufferFlip in RenderEngine
            Ent1.ChangeX(MainFrame.GetKey()[0]);
            Ent1.ChangeY(MainFrame.GetKey()[1]);
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
      
    }
    
}