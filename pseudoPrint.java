
public class pseudoPrint 
{
	
	public static String reader(String a,String b,String c, String d)
	{
		
		String[] key = { "print", "if", "else", "double", "int", "String",
                "boolean", "for", "while"};
		
		String x= "";
		
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
				
				System.out.println("System.out.println(\"" + b + "\");\n");
				break;
			
			case "if":
				System.out.println("if("+b+")");
				System.out.println("{");
				System.out.println("\t"+d);
				System.out.println("}\n");
				break;
				
			case "else":
				System.out.println(a);
				System.out.println("{");
				System.out.println("\t"+b);
				System.out.println("}\n");
				break;
				
			case "double":
				System.out.println(a+" "+b+" = "+c+";\n");
				break;
				
			case "int":
				System.out.println(a+" "+b+" = "+c+";\n");
				break;
				
			case "String":
				System.out.println(a+" "+b+" = "+"\""+c+"\""+";\n");
				break;
				
			case "boolean":
				System.out.println(a+" "+ b+" = "+c+";\n");
				break;
				
			// for case
				
			//while case
		}
				
		
		
		return x;
	}
	
	
	public static String operations(String a,String b, String c)
	{
		String operator = "";
		String[] ops = {"is","equals","=","greater than","more than","higher than","less than", 						
						"lower than","or","and","not equal","not","greater than or equal to",
						"less than or equal to",">","<","<=",">=","!=","||","&&","&","!"};									
		
		String y= "";
		
		for(int i = 0; i < ops.length;i++)
		{
		
			if(ops[i].equalsIgnoreCase(b))
			{	
				if(b.equals(ops[0])||b.equals(ops[1])||b.equals(ops[2]))
				{
					operator= "=";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[3]) || b.equals(ops[4]) || b.equals(ops[5]) || b.equals(ops[14]))
				{
					operator = ">";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[6])||b.equals(ops[7])||b.equals(ops[15]))
				{
					operator= "<";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[8])||b.equals(ops[19]))
				{
					operator="||";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[9])||b.equals(ops[20])||b.equals(ops[21]))
				{
					operator="&&";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[10])||b.equals(ops[18]))
				{
					operator= "!=";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[22])||b.equals(ops[11]))
				{
					operator="!";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[13])||b.equals(ops[16]))
				{
					operator="<=";
					System.out.println(a+operator+c+"\n");
				}
				else if(b.equals(ops[12])||b.equals(ops[17]))
				{
					operator=">=";
					System.out.println(a+operator+c+"\n");
					
				}
				else;
			}
		}
		return y;
	}
	
	public static void main(String[] args) 
	{
		operations("x","not equal","5");
	}
}
