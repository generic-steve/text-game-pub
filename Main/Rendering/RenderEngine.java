package Main.Rendering;

import Main.Types.Entity;

public class RenderEngine {
    public static void init(){
        GameFrame.NewFrame();
    }
    public static void Frame (String[][] stage, Entity[] entList){
        String[][] frame = stage;
        for(int i = 0; (i) < (entList.length); i++) {
            frame = spriteAdd(entList[i].GetX(), entList[i].GetY(), entList[i].GetSprite(), frame);
        }
        for(int i = 0; (i) < (frame.length); i++){
            for(int j = 0; (j) < frame[1].length; j++){
                GameFrame.PixelMatrix[i][j].setText(frame[i][j]);
            }
        }
    }
    //TODO fix error when subarrays are different lengths, or just don't do that. note: many other classes also crash when this happens
    public static String[][] spriteAdd(int spritex, int spritey, String[][] sprite, String[][] frame) {
        int spritePhysicalX = sprite.length;
        int spritePhysicalY = sprite[0].length;
        if (spritePhysicalY + spritey > frame[1].length || spritePhysicalX + spritex > frame.length){
            return frame;
        }
        for (int x = 0; x < spritePhysicalX; x++){
            for (int y = 0; y < spritePhysicalY; y++) {
                frame[spritex + x][spritey + y] = sprite[x][y];
            }
        }
        return frame;
    }

}