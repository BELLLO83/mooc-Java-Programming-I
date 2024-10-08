public class Bird {
    
    public String commonName;
    public String latinName;
    public int numberOfObservations;
    
    public Bird(String name, String latinName) {
        this.commonName = name;
        this.latinName = latinName;
        this.numberOfObservations = 0;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getNumberOfObservations() {
        return this.numberOfObservations;
    }

    public void makeObservation() {
        this.numberOfObservations++;
    }

    @Override
    public String toString() {
        return this.getCommonName() + " (" + this.getLatinName() + "): " + this.getNumberOfObservations() + " observations";
    }  
}

