public class Student {
    private String nume;
    private int nota;

    public Student(){
        nume="";
        nota=0;
    }

    public Student(String nume, int nota){
        this.nota = nota;
        this.nume  = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

