package DesignPatterns.builderPattern.abstractBuilder.impl;

import java.util.ArrayList;

import DesignPatterns.builderPattern.abstractBuilder.CarBuilder;
import DesignPatterns.builderPattern.product.BenzModel;
import DesignPatterns.builderPattern.product.CarModel;

public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
