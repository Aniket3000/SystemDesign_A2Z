package DesignPatterns.Bridge;

public class ClientMain {
    public void main(){
        Engine petrolEng = new PetrolEngine();
        Engine dieselEng= new DieselEngine();

        Car mySedan = new SedanCar(petrolEng);
        Car mySUV = new SUVCar(petrolEng);
        Car mySUV2 = new SUVCar(dieselEng);

        mySedan.drive();
        mySUV2.drive();
        mySUV.drive();
    }
}
