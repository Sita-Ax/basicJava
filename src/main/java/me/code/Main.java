package me.code;

public class Main {
    public static void main(String[] args) {
        MyName name = new MyName();
        Year year = new Year();
        Calculate calculate = new Calculate();
        InputName inputName = new InputName();
        TimeCount timeCount = new TimeCount();
        RandomNumber randomNumber = new RandomNumber();
        LoopsExamples loopsExamples = new LoopsExamples();
        ArraysExamples arraysExamples = new ArraysExamples();
        ArraysExercise arraysExercise = new ArraysExercise();
        ArrayUtilExamples arrayUtilExamples = new ArrayUtilExamples();
        ArrayExercise2 arrayExercise2 = new ArrayExercise2();

       // name.name();
       // year.inputYear();
        //calculate.calculation();
        //inputName.inputName();
        //timeCount.times();
        //randomNumber.guess();
        //extracted(loopsExamples);
        //extracted(arraysExamples);
        //arrayUtilExamples.sortAndSearch();
        //arrayUtilExamples.putTogether();
        //extracted(arraysExercise);
        arrayExercise2.expandArray();
    }

    private static void extracted(ArraysExamples arraysExamples) {
        System.out.println("Extracted Main Examples");
       arraysExamples.numberArrays();
        arraysExamples.arrayNr();
        arraysExamples.iterationNumbers();
        arraysExamples.dimArray();
        arraysExamples.dimArrays();
        arraysExamples.dimArrayValues();
        arraysExamples.ticTacToe();
    }

    private static void extracted(ArraysExercise arraysExercise) {
        System.out.println("Extracted Main Exercise");
        arraysExercise.emptyArray();
        arraysExercise.storedInts();
        arraysExercise.indexOf();
        arraysExercise.cityArr();
        arraysExercise.copyArr();
        arraysExercise.citContSOUT();
        arraysExercise.citCont();
        arraysExercise.averageArr();
        arraysExercise.oddEven();
        arraysExercise.duplicate();
    }

    private static void extracted(LoopsExamples loopsExamples) {
        System.out.println("Extracted Main Loop");
        loopsExamples.increment();
        loopsExamples.decrement();
        loopsExamples.oddOrEven();
        loopsExamples.numberArr();
        loopsExamples.numArrForEach();
        loopsExamples.continueLoop();
        loopsExamples.whileLoopBreak();
        loopsExamples.whileLoop();
    }
}