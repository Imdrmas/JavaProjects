public class Table {
    
    public int columns;
    public Object[][] Items;
    
    public Table(int columns){
        this.columns = columns;
        Items = new Object[0][columns];
    }
    
    public void addNewRow(Object row[]){
        // Save the Old Item In The Var 
        Object TempItems[][] = Items;
        //Add the main var per one item
        Items = new Object[Items.length + 1][columns];
        // full the old items in the main var
        for(int x = 0; x < TempItems.length; x++){
            Items[x] = TempItems[x];
        }
        // add the new item to main var
        Items[Items.length - 1] = row;
    }
    
    public void printItems(){
        for(Object objs[] : Items){
            for(Object obj : objs){
                System.out.print(obj + ": ");
            }
            System.out.println();
        }
    }
    
    public void editRow(int rowIndex, int columnIndex, Object newData ){
        Items[rowIndex][columnIndex] = newData;
    }
    
    public void deleteRow(int rowIndex){
        Object TempItems[][] = Items;
        Items = new Object[Items.length - 1][columns];
        int y = 0;
        for(int x = 0; x < TempItems.length; x++){
            if(x != rowIndex){
                Items[y] = TempItems[x];
                y++;
            }
        }
    }
    
    public Object getValue(int rowIndex, int columnIndex){
        return Items[rowIndex][columnIndex];
    }
    public Object[] getRow(int rowIndex){
        return Items[rowIndex];
    }
    
} //endding
