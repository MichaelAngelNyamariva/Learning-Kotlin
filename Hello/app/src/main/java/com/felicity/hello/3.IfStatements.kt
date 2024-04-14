package com.felicity.hello

fun main()
{
 heightIf(23,45);
}

fun heightIf(heightA: Int, heightB: Int) {
 if (heightA > heightB)
 {
  println("The height A $heightA is greater than height B $heightB");
 }
 else
 {
  println("The height A $heightA is less than height B $heightB");
 }

}
