package Main.Types;
public class Entity {
    private int sizeX;
    private int sizeY;
    private int posY;
    private int posX;
    private String[][][] sprites;
    private String[][] currentSprite;
    public Entity(int startX, int startY, String[][] sprite){
        sizeX = startX;
        posY = startY;
        sizeX = sprite.length;
        sizeY = sprite[1].length;
        sprites = new String[][][] {sprite};
        currentSprite = sprites[0];
    }
    public Entity(int startX, int startY, String[][][] sprites){//TODO make this not crash with differently sized matrices, or just don't do that.
        posX = startX;
        posY = startY;
        sizeX = this.sprites[1].length;
        sizeY = this.sprites[1][1].length;
        sprites = this.sprites;
        currentSprite = this.sprites[1];
    }
    public void ChangeY(int Amount){
        posY += Amount;
    }
    public void ChangeX(int Amount){
        posX += Amount;
    }
    public void SetY(int Y){
        posY = Y;
    }
    public void SetX(int X){
        posX = X;
    }
    public int GetX(){
        return posX;
    }
    public int GetY(){
        return posY;
    }
    public int GetSizeY(){
        return sizeY;
    }
    public int GetSizeX(){
        return sizeX;
    }
    public String[][] GetSprite(){
        return currentSprite;
    }
    public String[][] SetSprite(int index){//TODO this currently returns an error if run on a single-sprite entity, or the index is outside of the range
        currentSprite = sprites[index];
        return currentSprite;
    }
}