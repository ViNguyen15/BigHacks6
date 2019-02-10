
public class pseudoPrint 
{
	
	public static String operations(String a,String b, String c)
	{
		String operator = "";
		String[] ops = {"is","equals","=","greater than","more than","higher than","less than", 						
						"lower than","or","and","not equal","not","greater than or equal to",
						"less than or equal to",">","<","<=",">=","!=","||","&&","&","!","equal to"};									

		String y = "";
		
		for(int i = 0; i < ops.length;i++)
		{
		
			if(ops[i].equalsIgnoreCase(b))
			{	
				if(b.equals(ops[0])||b.equals(ops[1])||b.equals(ops[2])||b.equals(ops[23]))
				{
					operator= "==";
				
				}
				else if(b.equals(ops[3]) || b.equals(ops[4]) || b.equals(ops[5]) || b.equals(ops[14]))
				{
					operator = ">";
					
				}
				else if(b.equals(ops[6])||b.equals(ops[7])||b.equals(ops[15]))
				{
					operator= "<";
					
				}
				else if(b.equals(ops[8])||b.equals(ops[19]))
				{
					operator="||";
				
				}
				else if(b.equals(ops[9])||b.equals(ops[20])||b.equals(ops[21]))
				{
					operator="&&";
					
				}
				else if(b.equals(ops[10])||b.equals(ops[18]))
				{
					operator= "!=";
				
				}
				else if(b.equals(ops[22])||b.equals(ops[11]))
				{
					operator="!";
				
				}
				else if(b.equals(ops[13])||b.equals(ops[16]))
				{
					operator="<=";
					
				}
				else if(b.equals(ops[12])||b.equals(ops[17]))
				{
					operator=">=";
					
					
				}
				else;
			}
		}
		return 	y =(a+" "+operator+" "+c);
	}
	
	
	
	
	public static String reader(String a,String b,String c, String d)
	{
		
		String[] key = { "print", "if", "else", "double", "int", "String","boolean"};
		
		String x = "";
		String y = "";
		
		for(int i = 0; i<key.length;i++)
		{
			
			if(key[i].equalsIgnoreCase(a))
			{
				
				x=key[i];
				
				
			}
		
			
		}
		
		
		switch(x) 
		{
			case "print":
			{	
				y = ("System.out.println(\"" + b + "\");\n");
				break;
			}
			case "if":
			{
				y=(a+"("+b+")\n{\n\t"+d+"\n}\n");
				break;
			}	
			case "else":
			{
				 y = (a+"\n{\n\t"+b+"\n}\n");
				break;
			}	
			case "double":
			{
				 y=(a+" "+b+" = "+c+";\n");
				break;
			}	
			case "int":
			{
				 y =(a+" "+b+" = "+c+";\n");
				break;
			}	
			case "String":
			{
				 y =(a+" "+b+" = "+"\""+c+"\""+";\n");
				break;
			}
			case "boolean":
			{
				 y = (a+" "+ b+" = "+c+";\n");
				break;
			}

		}
		
		return y ;	
		
		

	}
	
	public static void main(String[] args) 
	{	
		
		
		System.out.println(reader("if",operations("water", "not equal","wet"),"then","print x;"));
		
	}
}
