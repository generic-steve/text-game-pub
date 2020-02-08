import Main.Constants;
public class Main{
    public static void main(String[] args){
        RenderEngine.Frame(Constants.TestStage, Constants.TestNumList, Constants.TestNumList, Constants.TestSprites);
        GameFrame.NewFrame();
    }
}