package Main.Physics;

public class EntityHitboxChecking {
    public static void HitboxCheck (String[][] stage, int[] spritex, int[] spritey, String[][][] sprites){//TODO make this callnum universal
        String[][] frame = stage;
        for(int i = 0; (i) < (sprites.length); i++) {
            frame = spriteCheck(spritex[i], spritey[i], sprites[i], frame, i);
        }

    }
    public static String[][] spriteCheck(int spritex, int spritey, String[][] sprite, String[][] frame, int callNum) {
        String[][] frameBackup = frame;
        final int spritePhysicalX = sprite.length;
        final int spritePhysicalY = sprite[1].length;
            if (spritePhysicalY + spritey > frame[1].length || spritePhysicalX + spritex > frame.length){
                System.err.println("Sprite" + callNum + "is outside stage boundries");
                return frame;
            }
        for (int x = 0; (x) < spritePhysicalX; x++){
            for (int y = 0; (y) < spritePhysicalY; y++) {
                if (frame[spritePhysicalX + x][spritePhysicalY + y] == "" || frame[spritePhysicalX + x][spritePhysicalY + y] == " "){
                    frame[spritePhysicalX + x][spritePhysicalY + y] = Integer.toString(callNum);
                } else {
                    System.err.println("Sprite" + callNum + "overlaps another sprite. the AIs should make this impossible, but they do not exist as of yet.");
                    return frameBackup;
                }
            }
        }
        return frame;
    }
}