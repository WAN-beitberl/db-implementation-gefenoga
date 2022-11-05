public class Hello{

public static void main(String[] args){
	
	Table t1 = new Table();
	
	t1.InsertColumnNames("name","last_name");
	t1.InsertRow("Israel", "Israeli");
	System.out.println(t1.getValue("name", 1));
}
}

class Table
{
	
	public String[][] table = new String[2][20];
	int Index = 1;
	
	public void InsertColumnNames(String col1, String col2)
    {
        table[0][0] = col1;
        table[0][1] = col2;
    }

    public void InsertRow(String row1, String row2)
    {
        table[Index][0] = row1;
        table[Index][1] = row2;
        Index++;
    }

    public String getValue(String col, int idx)
    {
        if(col.equals(table[0][0]))
            return table[idx][0];
        return table[idx][1];
    }
	

	
	}	