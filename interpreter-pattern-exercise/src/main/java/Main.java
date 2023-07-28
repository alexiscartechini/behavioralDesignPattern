public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    FirstLetterLowerCase firstLetterLowerCase = new FirstLetterLowerCase();
    context = firstLetterLowerCase.translate(context);

    System.out.println(context);

  }

}
