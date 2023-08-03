package logic;

public class Help_functions {

    static public boolean type_checker(Object element1, String element2){
        if(element1.getClass().getName()==element2){
            return true;
        }
        return false;


    }
}
