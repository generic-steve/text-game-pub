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
            int keyx = GameFrame.KeyX;
            int keyy = GameFrame.KeyY;
            RenderEngine.Frame(Constants.TestStage, EntList1, MainFrame);//TODO when adding multiple frames, remember to call BufferFlip in RenderEngine
            //To gus: updte entlist using keypresses here.
            if (keyx == 1){
                Ent1.ChangeX(-1);
            }else if (keyx == 2) {
                Ent1.ChangeX(1);
            }else if (keyy == 1) {
                Ent1.ChangeY(-1);
            }else if (keyy == 2) {
                Ent1.ChangeY(1); 
            }else {
            
            }
        }
      
    }
    
}