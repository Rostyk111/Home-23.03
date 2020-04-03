import java.util.ArrayList;
import java.util.List;

public class Fruction {

//    String nameFructions;
//    public Fruction(String nameFructions){
//        this.nameFructions = nameFructions;
//    }
//    public String getNameFructions(){
//        return nameFructions;
//    }
//    public void setNameFructions(String nameFructions){
//        this.nameFructions =nameFructions;
//    }

    List<Deputy> deputies = new ArrayList<>();

    public void addDeputi(Deputy deputy){
        deputies.add(deputy);
    }
    public void remuveDeputi(Deputy deputy){
        deputies.remove(deputy);
    }
    public void printAllBribeTakers(){
        if (deputies.isEmpty()){
            System.out.println("Фракція порожня");
            return;
        }
        System.out.println("Список всіх хабарників");
        for (Deputy d: deputies){
            if (d.isBribeTaker){
                System.out.println(d.getName()+""+ d.getSurname());

            }
        }
    }
    public void printBiggerBriber(){
        Deputy bigestBriberTaker = null;
        for (Deputy currentDeputy: deputies){
            if (currentDeputy.isBribeTaker()){
                if (bigestBriberTaker == null) {
                    bigestBriberTaker = currentDeputy;
                }else {
                    if (bigestBriberTaker.getSizeOfBribe() < currentDeputy.getSizeOfBribe()){
                        bigestBriberTaker = currentDeputy;
                    }else {

                    }
                }

            }
        }
        if (bigestBriberTaker == null){
            System.out.println("У фракції нема хабарників");
        }
        System.out.println("Найбільший хабарник " + bigestBriberTaker.getSurname()+ " " + bigestBriberTaker.getName());


    }

    public void printAllDeputy(){
        if (deputies.isEmpty()){
            System.out.println("Фракція порожня");
            return;
        }
        for (Deputy deputy: deputies){
            System.out.println(deputy.toString());
        }
    }
    public void remuveAllDeouty(){
        for (Deputy deputy: deputies){
            deputies.remove(deputy);
        }
    }
}
