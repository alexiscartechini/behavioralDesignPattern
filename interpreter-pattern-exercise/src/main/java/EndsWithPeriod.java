public class EndsWithPeriod implements Expression {

    NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

    public static String endsWithPeriod(String context) {
        if(!context.endsWith(".")) {
            context = context + ".";
        }
        return context;
    }

    @Override
    public String translate(String context) {
        context = endsWithPeriod(context);
        context = noRepeatedWords.translate(context);
        return context;
    }
}
