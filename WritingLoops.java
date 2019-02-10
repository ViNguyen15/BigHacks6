
public class WritingLoops extends pseudoPrint{
	
	
	public static String loops(String a, String b, String c, String d,String e)
	{
		
		String loop = b;
		String[] looptyp = { "for", "while", "do"};
		
		for(int i = 0;i<looptyp.length;i++)
		{
			
			if(looptyp[i].equalsIgnoreCase(b));
			{
				
				loop = looptyp[i];
				
				switch(loop)
				{
					case "for":
						
					{
						
						//"for("
						
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
							
							//reader(datatype,var,initialize,null);
							
						
							int grt = c.indexOf("<");
							int les = c.indexOf(">");
							
							String x = String.valueOf(c.charAt(grt+1));
							String y = String.valueOf(c.charAt(les+1));
							
							if(x == "="|| y== "=")
							{
								c.substring(grt,grt+1);
								c.substring(les,les+1);
							}
							else
							{
								String s = String.valueOf(c.charAt(grt));
								String t = String.valueOf(c.charAt(les));
								
								System.out.println(s);
								System.out.println(t);
								
							}
							
							//operations(var,,value);
							
						}
						
					}
						
				}
			}
			
			
		}
		
		
		
		return "";
	}

	public static void main(String[] args)
	
	{
		loops("for","int x = 0", "x<10","x++","then");
	}

}
