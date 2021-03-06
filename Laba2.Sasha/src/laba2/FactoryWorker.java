/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

import java.util.ArrayList;
import java.util.Objects;

public class FactoryWorker extends Employee{
    protected ArrayList<Product> bagpack;

    public FactoryWorker(String name, String profession, Workplace workplace, int salary, AttitudeToBoss attitudeToBoss, byte workQuality) {
        super(name, profession, workplace, salary, attitudeToBoss, workQuality);
        bagpack = new ArrayList<Product>();
    }

    public void changeQuality(byte up){
        super.workQuality += up;
    }

    public void raiseAttitude (){
        if (attitudeToBoss == AttitudeToBoss.HATE)
            super.attitudeToBoss = AttitudeToBoss.LOW;
        if (attitudeToBoss == AttitudeToBoss.LOW)
            super.attitudeToBoss = AttitudeToBoss.DEFAULT;
        if (attitudeToBoss == AttitudeToBoss.DEFAULT)
            super.attitudeToBoss = AttitudeToBoss.NORMAL;
        if (attitudeToBoss == AttitudeToBoss.NORMAL)
            super.attitudeToBoss = AttitudeToBoss.HIGH;
    }

    public void receiveSausage(Product sausage){
        bagpack.add(sausage);
        byte up = 5;
        this.changeQuality(up);
        this.raiseAttitude();
    }

    @Override
    public String toString() {
        return "FactoryWorker{" + "bagpack=" + bagpack + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.bagpack);
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
        final FactoryWorker other = (FactoryWorker) obj;
        if (!Objects.equals(this.bagpack, other.bagpack)) {
            return false;
        }
        return true;
    }

    public void sign(ManagerNotebook notebook){
        notebook.addSign(this.getName());
    }
}
