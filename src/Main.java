/**
 * Created by JERNIK on 6/9/2014.
 */
public class Main {

    public static void main(String[] args){
        //ExampleStaticClass - класс
        //example - обект
        ExampleStaticClass example = new ExampleStaticClass();
        //class level field - поле класса
        ExampleStaticClass.staticField = 5;
        example.nonStaticField = 4;
        //example.staticField = 5;

        ExampleStaticClass example2 = new ExampleStaticClass();
        example2.nonStaticField = 5;
        ExampleStaticClass.staticField = 6;
        //example2.staticField = 6;
        System.out.println(ExampleStaticClass.staticField + " , " + ExampleStaticClass.staticField);




    }
}
