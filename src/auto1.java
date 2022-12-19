public class auto1 {
    String brand;
    String model;
    String bodyColor;
    double engineSize;
    String countryOfOrigin;
    int yearOfManufacture;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public auto1(String brand, String model, String bodyColor, String countryOfOrigin, double engineSize, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.bodyColor = bodyColor;
        this.countryOfOrigin = countryOfOrigin;
        this.engineSize = engineSize;
        this.yearOfManufacture = yearOfManufacture;

    }
}


