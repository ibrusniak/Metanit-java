
/**
 * Table - describes table in database
 */
public class Table {

    private Header header;

    public void setHeader(Header header) {
        this.header = header;
    }

    public class Header {
        
        private Column[] columns;

        public Header(Column[] columns) {
            this.columns = columns;
        }
    }

    public class Column {
        
        public enum typeOfData {
            INT,
            VARCHAR,
            FLOAT
        }

        private String name;
        private typeOfData typeOfData;

        public Column(String name, typeOfData typeOfData) {
            
            this.name = name;
            this.typeOfData = typeOfData;
        }

        public typeOfData gettypeOfData() {
            return this.typeOfData;
        }

        public String getName() {
            return this.name;
        }
    }
}

