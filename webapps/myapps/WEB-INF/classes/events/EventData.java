package events;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EventData 
{
    public String csvToHtmlTable()
	{
        String csvFile = System.getProperty("user.home") + "\\events.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
		String outputHtml = "";
		
        try 
		{
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) 
			{
                // use comma as separator
                String[] tuple = line.split(cvsSplitBy);
						
				outputHtml = outputHtml + "<tr>";
				
				for(int n=0; n<tuple.length; n++)
				{
					outputHtml = outputHtml + "<td>" + tuple[n] + "</td>";
				}
				
				outputHtml = outputHtml + "</tr>";
            }
			return outputHtml;
        }
		catch (FileNotFoundException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        } 
		finally 
		{
            if (br != null) 
			{
                try 
				{
                    br.close();
                } 
				catch (IOException e) 
				{
                    e.printStackTrace();
                }
            }
			return outputHtml;
        }
    }
}