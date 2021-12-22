
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

        public void addColumnt(Column column) {

            if(columns == null) {
                columns = new Column[] {column};
            } else {
                Column[] newColumns = new Column[columns.length + 1];
                for(int i = 0; i < columns.length; i++) {
                    newColumns[i] = columns[i];
                }
                newColumns[newColumns.length - 1] = column;
                columns = newColumns;
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
}

