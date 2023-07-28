public class FirstLetterLowerCase implements Expression {

    EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    public static String firstLetterLowerCase(String context) {
        context = context.substring(0,1).toUpperCase() + context.substring(1);
        return context;
    }

    @Override
    public String translate(String context) {
        context = firstLetterLowerCase(context);
        context = endsWithPeriod.translate(context);
        return context;
    }
}
