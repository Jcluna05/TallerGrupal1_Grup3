object Lista extends App{

  /*
  INTEGRANTES:
  Jhoel Ordoñez
  Adrian Rivera
  Julio Luna
  Kriss Bustamante
  Luis Granda
  Jandry Jaramillo
  */
  import java.util.concurrent.ThreadLocalRandom
  import java.util.stream.IntStream

  println("------------------------------------------")
  println("Listado de Numeros")
  val numbers = IntStream.generate(() => ThreadLocalRandom.current.nextInt(10_000, 1_000_000)).limit(25).boxed.toList
  numbers.stream.forEach(println)


  println("------------------------------------------")
  println("Numeros ascendentes")
  numbers.stream().sorted().forEach(println)D

  println("------------------------------------------")
  println("Numeros descendentes")
  numbers.stream().sorted((x, y) => y.compareTo(x)).forEach(println)

  println("------------------------------------------")
  println("Numeros Pares")
  numbers.stream().filter(x => x % 2 == 0).forEach(println)

  println("------------------------------------------")
  println("Numeros Impares")
  numbers.stream().filter(x => x % 2 != 0).forEach(println)

  println("------------------------------------------")
  println("Numeros Primos")
  numbers.stream().filter(x => !(2 until x).exists(y => x % y == 0)).forEach(println)

  println("------------------------------------------")
  println("Numeros Perfectos")
  numbers.stream().filter(x => (1 until x).filter(y => x % y == 0).sum == x).forEach(println)

  println("------------------------------------------")
  println("Numeros Deficienntes")
  numbers.stream().filter(x => (1 until x).filter(y => x % y == 0).sum < x).forEach(println)

  println("------------------------------------------")
  println("Numeros Abundantes")
  numbers.stream().filter(x => (1 until x).filter(y => x % y == 0).sum > x).forEach(println)
}


