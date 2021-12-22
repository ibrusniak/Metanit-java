
public class Main {

    public static void main(String[] args) {
        
        Table t1 = new Table();
        Table.Header header1 = t1.new Header();
        header1.addColumnt(header1.new Column("age", Table.Header.Column.typeOfData.INT));
    }
}
