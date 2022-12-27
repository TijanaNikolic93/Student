package Student;

public class Student {

    public String ime;
    public String prezime;
    public int ocena;

    public Student (){
    }

    public Student (String ime, String prezime, int ocena){
        this.ime  = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getOcena() {
        return ocena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena=" + ocena +
                '}';
    }

}
