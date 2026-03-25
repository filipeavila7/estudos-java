package src.estudos.javaintermediario.colecoes.dominio;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    
    // regras
    // reflexivo : x.equals(x) tem que ser true para tudo que for diferente de null
    // simetrico: para x e y diferente de null, se x.equals(y) == true, logo y.equals(x) == true
    // consistente : x.equals(x) sempre ture se x for difente de null
    // para x diferente de null, x.eauals(null) == false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
            
        
    }


    
    
    @Override
    public String toString() {
        return "SmartPhone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
    }


    // regras
    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // se y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // se  y.hashCode() != x.hashCode(), o equals é falso
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    
}
