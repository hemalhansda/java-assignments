abstract class Animal
{
	public abstract void talk();
}
class Dog extends Animal
{
	public void talk()
	{
		System.out.println("Vow, Vow");
	}
}
class Cat extends Animal
{
	public void talk()
	{
		System.out.println("Meaow, Meaow");
	}
}
class MyAnimalVoice
{
	public static void makeitTalk(Animal a)
	{
		a.talk();
	}
}
class Data
{
	public static void main(String args[])
	{
		MyAnimalVoice.makeitTalk(new Dog());
	}
}