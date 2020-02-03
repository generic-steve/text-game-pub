public class RenderEngine{
    public static void Frame(String[][] stage, int[] spritex, int[] spritey, String[][][] sprites){
        new String[][] frame = stage;
        for(int i = 0; x <= sprites.length; i++) {
            spriteAdd(spritex[i], spritey[i], sprites[1], frame);
        }
        new String frameLine = null
        for(int i = 0; i <= frame.length; i++)={
            for(int j = 0; j <= frame[i].length; j++;){
                if j == 0
            }
        }
    }
    //TODO fix error when subarrays are different lengths, and when x or y are outside of stage boundaries
    public static void spriteAdd(int spritex, int spritey, String[][] sprite, String[][] frame){
        new private int spritePhysicalX = sprite.length;
        new private int spritePhysicalY = sprite[1].length;
        for (int x = 0; x < spritePhysicalX; x++)
            for (int y = 0; y < spritePhysicalY; y++) {
                frame[spritePhysicalX + x][spritePhysicalY + y] = sprite[x][y];
            }
    }

}