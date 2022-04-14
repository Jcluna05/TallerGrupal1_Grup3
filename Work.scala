object Work extends App{

  import java.util.concurrent.ThreadLocalRandom
  import java.util.stream.IntStream

  val numbers = IntStream.generate(() => ThreadLocalRandom.current.nextInt(10_000, 1_000_000)).limit(25).boxed.toList
  numbers.stream.forEach(println)
}
