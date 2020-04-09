public class Body {
    private int bodyTag;
    private float weight;
    private double height;
    private String [] characteristics;
private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public int getBodyTag() {
        return bodyTag;
    }

    public void setBodyTag(int bodyTag) {
        this.bodyTag = bodyTag;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }
    
}//class
