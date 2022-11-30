package in.ashokit.service;
import in.ashokit.beans.IReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ReportCreater 
{
	@Autowired
	private IReport ireport;
	
	public void createMyReport()
	{
		ireport.generateReport();
	}

}
