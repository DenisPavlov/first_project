/*
Поиск отрицательного числа
 */
def containsNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}

def containsNeg1(nums: List[Int]) = nums.exists(_ == 0)