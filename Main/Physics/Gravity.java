package Main.Physics;


import Main.Types.Entity;

class Gravity {
    public void EntityUpdate(Entity[] entList){
        for(int i = 0; i < entList.length; i++){
            entList[i].ChangeY(entList[i].GetThrust()-1);
        }
    }
}
