package ru.job4j.professions;

public class Doctor extends Profession {
    public Diagnose heal(Pacient pacient) {
        Diagnose diag = new Diagnose("DiagName", "DiagDiscr");
        return diag;
    }
}
