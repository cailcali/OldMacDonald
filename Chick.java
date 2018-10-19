class Chick implements Animal {     
  private String myType;
  private String mySound;
  public Chick(String type, String sound){
    myType = type;
    mySound = sound;
  }
  public Chick(String type, String sound, String sound2){
    myType = type;
    if(Math.random() < 0.5)
      mySound = sound;
    else
      mySound = sound2;
  }
  public String getSound(){
    return mySound;
  }
  public String getType(){
    return myType;
  }
}