public class ReturnOrder implements Command{
    Jacket jacket;

    public ReturnOrder(Jacket jacket){
        this.jacket = jacket;
    }

    @Override
    public void generateOrder() {
        jacket.returnOrder();
    }
}
