import Main.Constants;
import Main.Rendering.GameFrame;
import Main.Rendering.RenderEngine;
import Main.Types.Entity;


public class Main{

    public static void main(String[] args){
        int X = GameFrame.entityPosX;
        int Y = GameFrame.entityPosY;
        Entity Ent1 = new Entity(X, Y, Constants.TestSprite);
        Entity[] EntList1 = {Ent1};
        System.out.println(X);
        System.out.println(Y);
        RenderEngine.init();
        RenderEngine.Frame(Constants.TestStage, EntList1);
    }
    

}