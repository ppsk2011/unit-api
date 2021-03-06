/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package javax.measure.test.quantity;

import javax.measure.Measurement;
import javax.measure.Unit;
import javax.measure.quantity.InformationRate;
import javax.measure.test.unit.BitRateUnit;

/**
 * @author Werner Keil
 * @version 1.1
 */
public class BitRateQuantity extends TestQuantity<InformationRate> {
    public BitRateQuantity() {
    }

    public BitRateQuantity(double val, BitRateUnit un) {
        units = val;
        unit = un;
        scalar = val * unit.getMultFactor();
    }

    public BitRateQuantity add(BitRateQuantity d1) {
        BitRateQuantity dn = new BitRateQuantity();
        Object o = super.add(dn, this, d1, BitRateUnit.REF_UNIT);
        return (BitRateQuantity) o;
    }

    public BitRateQuantity subtract(BitRateQuantity d1) {
        BitRateQuantity dn = new BitRateQuantity();
        Object o = super.subtract(dn, this, d1, BitRateUnit.REF_UNIT);
        return (BitRateQuantity) o;
    }

    public boolean eq(BitRateQuantity d1) {
        return super.eq(d1);
    }

    public boolean ne(BitRateQuantity d1) {
        return super.ne(d1);
    }

    public boolean gt(BitRateQuantity d1) {
        return super.gt(d1);
    }

    public boolean lt(BitRateQuantity d1) {
        return super.lt(d1);
    }

    public boolean ge(BitRateQuantity d1) {
        return super.ge(d1);
    }

    public boolean le(BitRateQuantity d1) {
        return super.le(d1);
    }

    public BitRateQuantity multiply(double v) {
        return new BitRateQuantity(units * v, (BitRateUnit) unit);
    }

    public BitRateQuantity divide(double v) {
        return new BitRateQuantity(units / v, (BitRateUnit) unit);
    }

    // mixed type operations

    // public DistanceQuantity divide(DistanceQuantity d1) {
    // BitRateQuantity dq0 = convert(AreaUnit.sqmetre);
    // DistanceQuantity dq1 = d1.convert(DistanceUnit.m);
    // return new DistanceQuantity(dq0.units / dq1.units, DistanceUnit.m);
    // }
    // public VolumeQuantity multiply(DistanceQuantity d1) {
    // BitRateQuantity dq0 = convert(BitRateUnit.bps);
    // DistanceQuantity dq1 = d1.convert(DistanceUnit.m);
    // return new VolumeQuantity(dq0.units * dq1.units, VolumeUnit.cumetre);
    // }

    public BitRateQuantity convert(BitRateUnit newUnit) {
        return new BitRateQuantity(scalar / newUnit.getMultFactor(), newUnit);
    }

    public String showInUnits(BitRateUnit u, int precision) {
        return super.showInUnits(u, precision);
    }

	@Override
	public Measurement<InformationRate, Number> add(
			Measurement<InformationRate, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<InformationRate, Number> substract(
			Measurement<InformationRate, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> multiply(Measurement<?, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> multiply(Number that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> divide(Measurement<?, Number> that) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<InformationRate, Number> to(Unit<InformationRate> unit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<InformationRate, Number> inverse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement<?, Number> divide(Number that) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public double doubleValue(Unit<InformationRate> unit) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public long longValue(Unit<InformationRate> unit) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
