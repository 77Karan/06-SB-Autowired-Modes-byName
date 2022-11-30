package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class PdfReport implements IReport 
{

	public void generateReport()
	{
		System.out.println("Generating PDF report");

	}

}
