import Main.Constants;
import Main.Rendering.GameFrame;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;

public class Main {
    public static void main(String[] args){
        Entity Ent1 = new Entity(15, 35, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        GameFrame MainFrame = RenderEngine.init();
        while(true){
            RenderEngine.Frame(Constants.TestStage, EntList1, MainFrame);//TODO when adding multiple frames, remember to call BufferFlip in RenderEngine
        //To gus: updte entlist using keypresses here.
        }
    }
}