
public class Inventory implements Iterable {

    private Item[] items;

    public Item[] getItems() {
        return items;
    }

    public Inventory(Item...items){
        this.items = items;
    }

    @Override
    public StockIterator iterator() {
        return new StockIterator(this);
    }
}
