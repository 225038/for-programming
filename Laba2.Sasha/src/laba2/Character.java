/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

import java.util.*;

/**
 *
 * @author саша и кирюша
 */
abstract class Character implements Movement{
    protected String name;
    protected String profession;
    protected laba2.Workplace workplace;
    
    public Character(String name, String profession, Workplace workplace){
        this.name = name;
        this.profession = profession;
        this.workplace = workplace;
    }
    
    public String getName(){
        return this.name;
    }
    
    abstract public void work();
    
    @Override
    public void move(String address) {
        System.out.println(this.name + " направляется по адресу:" + address);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.profession);
        hash = 47 * hash + Objects.hashCode(this.workplace);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.profession, other.profession)) {
            return false;
        }
        if (!Objects.equals(this.workplace, other.workplace)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", profession=" + profession + ", workplace=" + workplace + '}';
    }
}


