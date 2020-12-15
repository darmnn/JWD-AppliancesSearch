package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria("Oven");
		criteriaOven.add(OvenCriteria.CAPACITY.toString(), 32);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria("Oven");
		criteriaOven.add(OvenCriteria.HEIGHT.toString(), 40);
		criteriaOven.add(OvenCriteria.DEPTH.toString(), 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria("TabletPC");
		criteriaTabletPC.add(TabletPCCriteria.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPCCriteria.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPCCriteria.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
