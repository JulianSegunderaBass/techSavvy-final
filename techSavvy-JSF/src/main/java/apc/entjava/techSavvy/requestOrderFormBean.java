package apc.entjava.techSavvy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@RequestScoped
@Named
public class requestOrderFormBean {

    private String Model, OS, Processor, Graphics, Memory, Storage, Display, Warranty;
    private int price;

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getGraphics() {
        return Graphics;
    }

    public void setGraphics(String Graphics) {
        this.Graphics = Graphics;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String Display) {
        this.Display = Display;
    }

    public String getWarranty() {
        return Warranty;
    }

    public void setWarranty(String Warranty) {
        this.Warranty = Warranty;
    }

    public int getPrice() {
        if (Model.equals("Laptop Package 1") || Model.equals("PC Package 1")) {
            this.price = 38000;
        } else if (Model.equals("Laptop Package 2") || Model.equals("PC Package 2")) {
            this.price = 50000;
        } else if (Model.equals("Laptop Package 3")) {
            this.price = 72000;
        } else if (Model.equals("PC Package 3") || Model.equals("Laptop Package 4")) {
            this.price = 25000;
        }

        return price;
    }

    public void setPrice(int price) { this.price = price; }
}
