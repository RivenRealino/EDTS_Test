package com.test.EDTS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.EDTS.Entity.Employee;
import com.test.EDTS.Service.EDTSService;

@RestController
@RequestMapping(path = "APIX")
public class APIController {
	
	@Autowired
	EDTSService edtsService;
	
	@RequestMapping("/Test")
	public String test() {
		return "API Jalan";
	}
	
	@GetMapping("/List")
	public List<Employee> listPSAK5055Param() {
		return edtsService.list();
	}
	
	@GetMapping("/Create")
	public String createPSAK5055Parameter(@RequestBody Employee employee) {
		return edtsService.create(employee);
	}
//	
//	@GetMapping("/Get")
//	public PSAK5055ParamGetDTO getPSAK5055Parameter() {
//		return psak5055ParamService.getData();
//	}
//	
	@GetMapping("/Update")
	public String updatePSAK5055Parameter(@RequestBody Employee employee) {
		return edtsService.update(employee);
	}
//	
//	@DeleteMapping("/Delete")
//	public ObjectStatus deletePSAK5055Parameter(@RequestParam String recid) {
//		return psak5055ParamService.deleteData(recid);
//	}

}
