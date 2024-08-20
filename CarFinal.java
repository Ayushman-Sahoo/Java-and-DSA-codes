package Project;
public class CarFinal {
    final int noOfWheel;
    final String model;
    final String engineinLiter;
    public CarFinal(int noOfWheel, String model,String engineinLiter){
        this.noOfWheel= noOfWheel;
        this.model= model;
        this.engineinLiter= engineinLiter;
    }
    public static void main(String[] args) {
        int noOfWheel= 30;
        String model= "XUV-500";
        String engineinLiter= "2.2L";
        CarFinal car= new CarFinal(noOfWheel, model, engineinLiter);
        System.out.println("No of wheel: "+ noOfWheel);
        System.out.println("Model: " + model);
        System.out.println("Engine in Liter: " + engineinLiter);
    }
}
