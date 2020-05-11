public class Car {

    private boolean started;
    private String make;
    private String model;

    public Car(String make, String model){
        this.started = false;
        this.make = make;
        this.model = model;
    }

    // TODO Write Drive Method

    public void carOn(){
        this.started = true;
    }

    public void carOff(){
        this.started = false;
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public boolean equals(Car aCar){
        if(this.make.equals(aCar.make) && this.model.equals(aCar.model)){
            return true;
        }else{
            return false;
        }
    }

    public int compareTo(Car aCar){
        return (this.make + this.model).compareTo(aCar.make + aCar.model);
    }
}
