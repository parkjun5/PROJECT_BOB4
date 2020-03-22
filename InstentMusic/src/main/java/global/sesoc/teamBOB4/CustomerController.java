package global.sesoc.teamBOB4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import global.sesoc.teamBOB4.dao.CustomerDao;

@Controller
@RestController
public class CustomerController {

	@Autowired
	CustomerDao dao;
}
