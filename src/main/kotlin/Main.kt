fun main(){
    average(numArray = arrayOf(45, 67, 45, 20, 33, 45))
    arrayNumbers(arrayOf(4,5,6,7,8,9,2,2,3))
    hightest(arrayOf(23.4, 34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5))
    multiple()
}
//Write a function that takes an array of numbers and returns the sum of all the even numbers in the array.
fun arrayNumbers(numbers:Array<Int>){
    var sum=0
    for (n in numbers){
        if (n%2==0){
            sum++
        }
    }
    println(sum)
}
//Write a function that takes an array of numbers and returns the average of all the numbers in the array.
fun average(numArray: Array<Int>){
    var sum = 0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println(average)
}
//Write a function that takes an array of numbers,the highest number in the array.
fun hightest(nums:Array<Double>){
    var largest = nums[0]

    for (num in nums) {
        if (largest < num)
            largest = num
    }
    println(largest)

}
///Write a program in Kotlin to print the multiplication table of a given number using a while loop.
fun multiple() {
    val num = 7

    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
    }
}


