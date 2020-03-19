package Main.Rendering;

import Main.Types.Entity;

public class RenderEngine {
    static boolean DoubleBufferFlipFlop = true;
    public static GameFrame init(){
        return GameFrame.NewFrame();
    }
    public static void Frame (String[][] stage, Entity[] entList, GameFrame Frame1){
        DoubleBufferFlipFlop = !DoubleBufferFlipFlop;
        String[][] frame = stage;
        for(int i = 0; (i) < (entList.length); i++) {
            frame = spriteAdd(entList[i].GetX(), entList[i].GetY(), entList[i].GetSprite(), frame);
        }
        for(int i = 0; (i) < (frame.length); i++){
            for(int j = 0; (j) < frame[1].length; j++){
                if(DoubleBufferFlipFlop){
                    GameFrame.PixelMatrixB[i][j].setText(frame[i][j]);
                } else{
                    GameFrame.PixelMatrixA[i][j].setText(frame[i][j]);
                }
            }
        }
        BufferFlip(DoubleBufferFlipFlop, Frame1);
    }

    // TODO fix error when subarrays are different lengths, or just don't do that.
    // note: many other classes also crash when this happens
    public static String[][] spriteAdd(int spritex, int spritey, String[][] sprite, String[][] frame) {
        int spritePhysicalX = sprite.length;
        int spritePhysicalY = sprite[0].length;
        if (spritePhysicalY + spritey > frame[1].length || spritePhysicalX + spritex > frame.length) {
            return frame;
        }
        for (int x = 0; x < spritePhysicalX; x++) {
            for (int y = 0; y < spritePhysicalY; y++) {
                frame[spritex + x][spritey + y] = sprite[x][y];
            }
        }
        return frame;
    }

    public static void BufferFlip(boolean FlipState, GameFrame Frame1) {
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 40; y++) {
                if(FlipState){
                    Frame1.add(GameFrame.PanelB);
                } else {
                    Frame1.add(GameFrame.PanelA);
                }
            }
        }
    }

}