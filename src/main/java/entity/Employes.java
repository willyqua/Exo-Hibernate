package entity;

import javax.persistence.*;


@Entity
@Table(name = "employes")
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private int age ;
    private String fonction;
    private String telephone;
    private String adresse_postal;

    public Employes(){}

    public Employes(long id, String nom, String prenom, String email, int age, String fonction, String telephone, String adresse_postal) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
        this.fonction = fonction;
        this.telephone = telephone;
        this.adresse_postal = adresse_postal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse_postal() {
        return adresse_postal;
    }

    public void setAdresse_postal(String adresse_postal) {
        this.adresse_postal = adresse_postal;
    }
}
