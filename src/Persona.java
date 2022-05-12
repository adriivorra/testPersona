public class Persona {
    protected String idCard;

    protected String correo;

    public Persona()
    {

        idCard="";
        correo="";
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
