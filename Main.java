import Main.Constants;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;
public class Main{
    public static void main(String[] args){
        Entity Ent1 = new Entity(10, 10, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        System.out.println(Ent1.GetX());
        System.out.println(Ent1.GetSizeX());
        RenderEngine.init();
        RenderEngine.Frame(Constants.TestStage, EntList1);
    }
}