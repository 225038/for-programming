/**
 * Created by саша on 09.03.2017.
 */
import java.util.ArrayList;
import java.util.Objects;

public class ManagerNotebook implements Owned{
    private ArrayList<FactoryWorker> workerList;
    private ArrayList<String> sign;
    private Employer owner;

    public ManagerNotebook(Employer owner){
        this.owner = owner;
        sign = new ArrayList<String>();
        workerList = new ArrayList<FactoryWorker>();
    }

    @Override
    public String toString() {
        return "ManagerNotebook{" + "workerList=" + workerList + ", sign=" + sign + ", owner=" + owner + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.workerList);
        hash = 29 * hash + Objects.hashCode(this.sign);
        hash = 29 * hash + Objects.hashCode(this.owner);
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
        final ManagerNotebook other = (ManagerNotebook) obj;
        if (!Objects.equals(this.workerList, other.workerList)) {
            return false;
        }
        if (!Objects.equals(this.sign, other.sign)) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        return true;
    }

    @Override
    public void setOwner(Employer owner){
        this.owner = owner;
    }

    public void addSign(String workerName){
        sign.add("Я, " + workerName + ", получил бутерброд с сосиской");
    }

    public void addWorker(FactoryWorker worker){
        workerList.add(worker);
    }
}
