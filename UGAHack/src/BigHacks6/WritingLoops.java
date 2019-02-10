
package BigHacks6;
public class WritingLoops extends pseudoPrint{
	
	
	
	public static String iterators(String a)
	{
		String iterator="";
		String y = "";
		
		String [] iterators = {"x++","x=x+1","x--","x=x-1"};
		
		for(int i = 0;i<iterators.length;i++)
		{
			
			if(iterators[i].equalsIgnoreCase(a))
			{
				
				if(a.equals(iterators[0])||a.equals(iterators[1]))
				{
					
					iterator = "x++";
					
				}
				else if(a.equals(iterators[2])||a.equals(iterators[3]))
				{
					iterator = "x--";
					
				}
				
			}
			
					
		}
		
		
		return y= iterator;
	}
	
	public static String loops(String a, String b, String c, String d,String e,String f)
	{
		
		String loop = b;
		String x="";
		String y="";
		String z="";
		String L = "";
		
		String[] looptyp = { "for"};
		
		for(int i = 0;i<looptyp.length;i++)
		{
			
			if(looptyp[i].equalsIgnoreCase(b));
			{
				
				loop = looptyp[i];
				
				switch(loop)
				{
					case "for":
						
					{
						
						{
							int space = b.indexOf(" ");						
							String datatype = b.substring(0,space);
							String bfix = b.replace(datatype, " ");
							b=bfix.trim();
							
							space = b.indexOf(" ");	
							String var = b.substring(0,space);
							bfix=b.replace(var, " ");
							b=bfix.trim();
								
							String initialize = b.substring(2,b.length());
							bfix=b.replace(initialize, " ");
							b=bfix.trim();
							
							x=reader(datatype,var,initialize,null);
							
							
							space = c.indexOf(" ");	
							String lol = c.substring(0,space);
							String cfix =c.replace(lol, " ");
							c= cfix.trim();	
							
							space = c.indexOf(" ");	
							String op = c.substring(0,space);
							cfix = c.replace(op, " ");
							c = cfix.trim();
							
						 	space = c.indexOf(" ");	
							String range = c.substring(0,c.length());
							cfix = c.replace(range, " ");
							c = cfix.trim();
							
							
							y=operations(var,op,range);
							
							
							z = d;
							
							L = (a+"("+x+y+";"+z+")\n{\n\t"+f+"\n}\n");	
									
						}
							
				
					}
					
				}
						
			}
			
		}

		return L;			
}
	

	public static void main(String[] args)
	
	{
		String w = reader("print", "x",null,null);
		
		System.out.print(loops("for","int x = 0", "x < 10","x++","then",w));
	}

}
