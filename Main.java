import Main.Constants;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;
public class Main{
    public static void main(String[] args){
        Entity Ent1 = new Entity(15, 35, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        RenderEngine.init();
        RenderEngine.Frame(Constants.TestStage, EntList1);//TODO when adding multiple frames, remember to call BufferFlip in RenderEngine
    }
}