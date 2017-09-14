/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author HP
 */
public class CarName implements CarModel {
    private String carModel;
    private String carMake;
    @Override
    public void honk() {
        System.out.println("Honk honk!");
    }

    @Override
    public String getCarModel() {
        return carModel;
    }

    @Override
    public void setCarModel(String carModel) {
       this.carModel = carModel;
    }

    @Override
    public String getCarMake() {
        return carMake;
    }

    @Override
    public void setCarMake() {
        this.carMake = carMake;
    }
    
    
}
