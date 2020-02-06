public class RenderEngine{
    public static void Frame(String[][] stage, int[] spritex, int[] spritey, String[][][] sprites){
        String[][] frame = stage;
        for(int i = 0; (i) < (sprites.length); i++) {
            frame = spriteAdd(spritex[i], spritey[i], sprites[i], frame);
        }
        for(int i = 0; (i) < (frame.length - 1); i++){
            System.out.println(String.join("", frame[i]));
        }
    }
    //TODO fix error when subarrays are different lengths, and when x or y are outside of stage boundaries
    public static String[][] spriteAdd(int spritex, int spritey, String[][] sprite, String[][] frame) {
        final int spritePhysicalX = sprite.length;
        final int spritePhysicalY = sprite[1].length;
        for (int x = 0; (x) < spritePhysicalX; x++){
            for (int y = 0; (y) < spritePhysicalY; y++) {
                frame[spritePhysicalX + x][spritePhysicalY + y] = sprite[x][y];
            }
        }
        return frame;
    }

}