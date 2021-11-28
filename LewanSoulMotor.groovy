import eu.mihosoft.vrl.v3d.parametrics.*;
import java.util.stream.Collectors;
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins;
import eu.mihosoft.vrl.v3d.CSG;
import eu.mihosoft.vrl.v3d.Cube;
CSG generate(){
	String type= "LewanSoulMotor"
	if(args==null)
		args=["lx_224"]
	// The variable that stores the current size of this vitamin
	StringParameter size = new StringParameter(	type+" Default",args.get(0),Vitamins.listVitaminSizes(type))
	HashMap<String,Object> measurments = Vitamins.getConfiguration( type,size.getStrValue())

	def MaxFreeSpeedRadPerSecValue = measurments.MaxFreeSpeedRadPerSec
	def MaxTorqueNewtonmetersValue = measurments.MaxTorqueNewtonmeters
	def body_xValue = measurments.body_x
	def body_yValue = measurments.body_y
	def body_zValue = measurments.body_z
	def bottomHoleDistanceFromCornerValue = measurments.bottomHoleDistanceFromCorner
	def bottomShaftDiameterValue = measurments.bottomShaftDiameter
	def bottomShaftLengthValue = measurments.bottomShaftLength
	def bottomShaftRetainingScrewHeadDiameterValue = measurments.bottomShaftRetainingScrewHeadDiameter
	def bottomSquareMountHoleSizeValue = measurments.bottomSquareMountHoleSize
	def cable_xValue = measurments.cable_x
	def cable_zValue = measurments.cable_z
	def caseHoleDiameterValue = measurments.caseHoleDiameter
	def caseScrewHeadDiameterValue = measurments.caseScrewHeadDiameter
	def caseScrewKeepawayLengthValue = measurments.caseScrewKeepawayLength
	def massCentroidXValue = measurments.massCentroidX
	def massCentroidYValue = measurments.massCentroidY
	def massCentroidZValue = measurments.massCentroidZ
	def massKgValue = measurments.massKg
	def priceValue = measurments.price
	def shaftSizeValue = measurments.shaftSize
	def shaftTypeValue = measurments.shaftType
	def shoulderDiameterValue = measurments.shoulderDiameter
	def shoulderHeightValue = measurments.shoulderHeight
	def sourceValue = measurments.source
	def topHoleCircleDiameterValue = measurments.topHoleCircleDiameter
	def topHoleCornerInsetValue = measurments.topHoleCornerInset
	for(String key:measurments.keySet().stream().sorted().collect(Collectors.toList())){
		println "LewanSoulMotor value "+key+" "+measurments.get(key);
}
	// Stub of a CAD object
	CSG part = new Cube().toCSG()
	return part
		.setParameter(size)
		.setRegenerate({generate()})
}
return generate() 