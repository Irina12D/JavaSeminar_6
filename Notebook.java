public class Notebook {

    int serialNumber;
    int screenSize;
    String CPU;
    double CPUfrequencies;
    int drive;
    String brand;
    int RAM;
    String operatingSystem;
    String color;
    int price;

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Notebook))
            return false;  
        Notebook laptop = (Notebook) obj;
        return serialNumber == laptop.serialNumber;
    }

    @Override
    public String toString() {
        String driveToPrint = (drive > 1000)? drive/1024 + " TByte, ": drive + " GByte, ";
        String result =  "NOTEBOOK " + brand + " " + screenSize + "\", " +  CPU + " " + CPUfrequencies + " Hz, " + driveToPrint + "RAM " + RAM + " GB, "  ;
        result += operatingSystem + ", " + color + ", "  + "No " + serialNumber + ", " + price + " rub.";
        return result;
    }


    
}
