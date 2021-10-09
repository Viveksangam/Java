class FinalRunner{
public static void main(String[] args)
{
System.out.println("invoked main method");
Fish fish=new Fish();
System.out.println("fish.fishName");
System.out.println("fish.weigth");
System.out.println("fish.color");
System.out.println("fish.shape");
System.out.println("fish.length");


fish.fishName="prawn";
fish.weight=25f;
System.out.println("fish.fishName");
System.out.println("fish.weigth");
System.out.println("fish.color");
System.out.println("fish.shape");
System.out.println("fish.length");

System.out.println("==============");


Train train=new Train();
System.out.println("train.name");
System.out.println("train.length");
System.out.println("train.frequency");
System.out.println("train.color");
System.out.println("train.mass");


train.name="dhadhar express";
train.length=25;
train.color="blue";
System.out.println("train.name");
System.out.println("train.length");
System.out.println("train.frequency");
System.out.println("train.color");
System.out.println("train.mass");

System.out.println("================");



Charger charger=new Charger();
System.out.println("charger.capacity");
System.out.println("charger.current");
System.out.println("charger.color");
System.out.println("charger.voltage");
System.out.println("charger.name");

charger.color="green";
System.out.println("charger.capacity");
System.out.println("charger.current");
System.out.println("charger.color");
System.out.println("charger.voltage");
System.out.println("charger.name");

System.out.println("================");

}

}