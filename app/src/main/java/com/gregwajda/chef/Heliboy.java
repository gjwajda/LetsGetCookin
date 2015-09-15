package com.gregwajda.chef;

public class Heliboy extends Enemy {

    public float atktime = 0;

    public Heliboy(int centerX, int centerY) {

        setCenterX(centerX);
        setCenterY(centerY);

       /* if(atktime > 2){
            atktime = 0;
            this.attack();
        }
        else{
            atktime += deltaTime;
        }*/
    }




}
