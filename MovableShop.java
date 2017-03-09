/**
 * Created by саша on 09.03.2017.
 */
import java.util.ArrayList;

public class MovableShop extends Shop implements Movement{

    static class Direction{
        String goToAddress(String address){
            return "напрвляется по адресу: " + address;
        }
    }

    Direction dir = new Direction();

    public MovableShop(String name, String shopType, ArrayList <Product> assortment, ArrayList <Employee> employeeList) {
        super(name, shopType, assortment, employeeList);
    }

    @Override
    public void move(String address) {
        System.out.println("Передвижной магазин \"" + this.name + dir.goToAddress(address));
    }
}
