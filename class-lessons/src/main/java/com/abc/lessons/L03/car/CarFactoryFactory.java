/**
 * 
 */
package com.abc.lessons.L03.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.lessons.L03.car.electric.ElectricCarFactory;
import com.abc.lessons.L03.car.gasoline.GasolineCarFactory;

/**
 * @author Soham.Chakravarti
 *
 */
@Component
public class CarFactoryFactory {
	
	@Autowired
	private ElectricCarFactory electricCarFactory;
	
	@Autowired
	private GasolineCarFactory gasolineCarFactory;
	
	

	public CarFactory createCarFactory(boolean isElectric) {
		//return isElectric ? new ElectricCarFactory() : new GasolineCarFactory();
		return isElectric ? electricCarFactory : gasolineCarFactory;
	}
}
 