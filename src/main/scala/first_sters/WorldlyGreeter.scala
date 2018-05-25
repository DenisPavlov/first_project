// Класс WorldlyGreeter
class WorldlyGreeter(greeting: String)
{
  def greet() =
  {
    val worldlyGreeting = WorldlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}

// Singleton-объект WorldlyGreeter
object WorldlyGreeter
{
  def worldify(s: String) = s + ", world!"
}