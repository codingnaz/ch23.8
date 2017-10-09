package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    @FXML
    public Label inputlable;
    @FXML
    public Button sortIt;
    @FXML
    public Label output;

        public static <E extends Comparable<E>> void sort(E[] list) {
            // Create a Heap of objects
            Heap<E> heap = new Heap<>(list);

            // Remove elements from the heap
            for (int i = list.length - 1; i >= 0; i--)
                list[i] = heap.remove();
        }





        public void sortCalc(){
            String fList="";
            String sList="";
            Integer[] list = {22, 2,-22,-3,4,-6,3,0,6};
            for(int i=0;i<list.length;i++){
                fList= fList +" " +list[i];
            }
            inputlable.setText("List is { "+fList+" }");
            sort(list);
            for(int i=0;i<list.length;i++){
                sList= sList +" " +list[i];
            }
            output.setText("After the sort {"+ sList+"}");
            output.setVisible(true);

        }

        public static void main(String[] args) {
            Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5,-10, 53};
            //sorty(list);

            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        }


}

