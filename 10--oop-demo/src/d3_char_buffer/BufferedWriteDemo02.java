package d3_char_buffer;

/**
      缓冲流概述:
      1. 缓冲流也称为高效流，或者高级流。之前学习的字节流可以称为原始流
      2. 作用：缓冲流自带缓冲区，可以提高原始字节流，字符流读写数据的性能
      3. 字节缓冲输入流自带了8KB缓冲池，以后我们之间从缓冲池读取数据，所以性能较好
      4. 字节缓冲输出流自带了8KB缓冲池，数据就直接写入到缓冲池中去，写数据性能极高了

      IO流的体系:
                                      字节流                                     字符流
                          字节输入流            字节输出流               字符输入流        字符输出流
      (抽象类)             InputStream          OutputStream           Reader           Writer
      (实现类，可以使用的)   FileInputStream      FileOutputStream       FileReader       FileWriter
      (实现类，可以使用的)   BufferedInputStream  BufferedOutputStream   BufferedReader   BufferedWriter
                                 |                     |                    |                 |
                          字节缓冲输入流            字节缓冲输出流         字符缓冲输入流       字符缓冲输出流

      字符缓冲输出流:
      1. 字符缓冲输出流：BufferedWriter
      2. 作用：提高字符输出流写取数据的性能，除此之外多了换行功能
      -- 构造器：
      public BufferedWriter(Writer w): 可以把低级的字符输出流包装成一个高级的缓冲字符输出流管道，
                                       从而提高字符输出流写数据的性能
      -- 字符缓冲输出流新增功能：
      public void newLine(): 换行操作
 */
public class BufferedWriteDemo02 {
    public static void main(String[] args) {
        // 1. 创建一个字符输出流管道与目标文件接通
    }
}
