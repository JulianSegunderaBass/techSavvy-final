package apc.entjava.techSavvy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@RequestScoped
@Named
public class requestOrderFormBean {

    private String pcModel, pcOS, pcProcessor, pcGraphics, pcMemory, pcStorage, pcDisplay, pcWarranty;

    public String getPcModel() {
        return pcModel;
    }

    public void setPcModel(String pcModel) {
        this.pcModel = pcModel;
    }

    public String getPcOS() {
        return pcOS;
    }

    public void setPcOS(String pcOS) {
        this.pcOS = pcOS;
    }

    public String getPcProcessor() {
        return pcProcessor;
    }

    public void setPcProcessor(String pcProcessor) {
        this.pcProcessor = pcProcessor;
    }

    public String getPcGraphics() {
        return pcGraphics;
    }

    public void setPcGraphics(String pcGraphics) {
        this.pcGraphics = pcGraphics;
    }

    public String getPcMemory() {
        return pcMemory;
    }

    public void setPcMemory(String pcMemory) {
        this.pcMemory = pcMemory;
    }

    public String getPcStorage() {
        return pcStorage;
    }

    public void setPcStorage(String pcStorage) {
        this.pcStorage = pcStorage;
    }

    public String getPcDisplay() {
        return pcDisplay;
    }

    public void setPcDisplay(String pcDisplay) {
        this.pcDisplay = pcDisplay;
    }

    public String getPcWarranty() {
        return pcWarranty;
    }

    public void setPcWarranty(String pcWarranty) {
        this.pcWarranty = pcWarranty;
    }

}
