package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class ParticipantDTO implements Serializable {
    private Integer id;
    private String nume;
    private int varsta;
    private int nrProbe;
    ArrayList<Proba> probe;

    public ParticipantDTO(Integer id, String nume, int varsta, int nrProbe,ArrayList<Proba> pr) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
        this.nrProbe = nrProbe;
        probe=pr;
    }
    public void addProba(Proba proba){
        this.probe.add(proba);
    }

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public int getNrProbe() {
        return nrProbe;
    }

    public ArrayList<Proba> getProbe() {
        return probe;
    }

    public Proba getProba1(){
        if (probe.size()>=1)
            return probe.get(0);
        return null;
    }
    public Proba getProba2(){
        if (probe.size()==2)
            return probe.get(1);
        return null;
    }
    public Participant getParticipantFromDTO(){
        return new Participant(this.id,this.nume,this.varsta,this.nrProbe);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantDTO that = (ParticipantDTO) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
