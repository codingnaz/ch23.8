package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    @FXML
    public TextField input;
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
        public Integer[] goodInput(){
            String s= input.getText();
            ArrayList templist= new ArrayList();
            Integer[] temp=null;
            if(input.getText().isEmpty()){
                output.setText("not a good array");
                output.setVisible(true);

                return null;
            }
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                templist.add(matcher.group());
                System.out.println(matcher.group());
            }
            try{
                for(int i=0; i<templist.size();i++){
                    temp[i]= (Integer) templist.get(i);
                }
            }catch (Exception e){
                output.setText("not a good array");
                output.setVisible(true);
                output.setTextFill(Color.RED);
            }
            for (int i = 0; i < templist.size(); i++)
                System.out.print(templist.get(i) + " ");
            System.out.println();



            return temp;
        }




        public void sortCalc(){
            sort(goodInput());

        }

        public static void main(String[] args) {
            Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5,-10, 53};
            //sorty(list);

            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();
        }


}

