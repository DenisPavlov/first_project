import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def meth():FileReader = {
  try {
    val f = new FileReader("input.txt")
    // Use and close file
  } catch {
    case ex: FileNotFoundException => // Handle missing file
    case ex: IOException => // Handle other I/O error
  }
}
