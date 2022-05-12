public class Persona {
    protected String name;
    protected String idCard;

    public Persona()
    {
        name="";
        idCard="";
    }

    public Persona(String name,String idCard)
    {
        this.name=name;
        this.idCard=idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object p)
    {
        return (this.idCard.equals(((Persona)p).idCard));
    }

    @Override
    public String toString()
    {
        return name + " " + idCard;
    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }
}
