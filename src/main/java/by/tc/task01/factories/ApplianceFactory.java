package by.tc.task01.factories;

import by.tc.task01.entity.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplianceFactory
{
    Appliance appliance;

    public Appliance create(String groupName, ArrayList<String> parameters)
    {
        switch (groupName)
        {
            case "Oven":
            {
                appliance = new Oven(Integer.parseInt(parameters.get(0)), Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)), Integer.parseInt(parameters.get(3)), Float.parseFloat(parameters.get(4)),
                        Float.parseFloat(parameters.get(5)));
                break;
            }
            case "TabletPC":
            {
                appliance = new TabletPC(Integer.parseInt(parameters.get(0)), Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)), Integer.parseInt(parameters.get(3)), parameters.get(4));
                break;
            }
            case "Laptop":
            {
                appliance = new Laptop(Float.parseFloat(parameters.get(0)), parameters.get(1),
                        Integer.parseInt(parameters.get(2)), Integer.parseInt(parameters.get(3)), Float.parseFloat(parameters.get(4)),
                        Integer.parseInt(parameters.get(5)));
                break;
            }
            case "Refrigerator" :
            {
                appliance = new Refrigerator(Integer.parseInt(parameters.get(0)), Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)), Integer.parseInt(parameters.get(3)), Integer.parseInt(parameters.get(4)),
                        Integer.parseInt(parameters.get(5)));
                break;
            }
            case "Speakers":
            {
                appliance = new Speakers(Integer.parseInt(parameters.get(0)), Integer.parseInt(parameters.get(1)),
                        parameters.get(2), Integer.parseInt(parameters.get(3)));
                break;
            }
            case "VacuumCleaner":
            {
                appliance = new VacuumCleaner(Integer.parseInt(parameters.get(0)), parameters.get(1).charAt(0),
                        parameters.get(2), parameters.get(3), parameters.get(4),
                        Integer.parseInt(parameters.get(5)));
            }
        }
        return appliance;
    }
}
