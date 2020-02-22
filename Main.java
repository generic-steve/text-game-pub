import Main.Constants;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;
public class Main{
    public static void main(String[] args){
        Entity Ent1 = new Entity(5, 5, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        RenderEngine.init();
        RenderEngine.Frame(Constants.TestStage, EntList1);
    }
}