package beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UsageClass {
	@Inject
	@Qualifier("pencil")
    Drawing drawing;
	public void usage()
	{
		System.out.println("Mode of Usage: ");
		drawing.draw();
	}
}
