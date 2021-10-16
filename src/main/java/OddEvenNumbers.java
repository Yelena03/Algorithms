public class OddEvenNumbers {


    //Создать алгоритм OddEven, который примет на вход число, вернет “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    //
    //Test Data:
    //-345 -> “Odd”
    //0 -> “Even”
    //222222 -> “Even”
    //2147483647 + 1 -> “Undefined”

    public String oddEvenNumbers(long number) {

        String result;

        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
           // result = number % 2 == 0 ? "Even" : "Odd";
            if(number % 2 == 0){
                result = "Even";
            } else {
                result = "Odd";
            }
        } else {
            result = "Undefined";
        }
        return result;


    }
}