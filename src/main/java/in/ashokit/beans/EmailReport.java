package in.ashokit.beans;
import org.springframework.stereotype.Component;
@Component(value="ireport")
public class EmailReport implements IReport 
{
	public void generateReport()
	{
		System.out.println("Generating Email Report");

	}

}
