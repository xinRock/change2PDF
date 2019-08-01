package DesignPatterns.builderPattern.abstractBuilder.impl;

import java.util.ArrayList;

import DesignPatterns.builderPattern.abstractBuilder.CarBuilder;
import DesignPatterns.builderPattern.product.BMWModel;
import DesignPatterns.builderPattern.product.CarModel;

public class BMWBuilder  extends CarBuilder{

	private BMWModel bmwM=new BMWModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bmwM.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmwM;
	}

}
