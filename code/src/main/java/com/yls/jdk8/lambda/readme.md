## jdk8 函数式编程

### 函数式接口
1. 如果一个接口只有一个**抽象**方法，那么该接口就是函数式接口
2. 如果我们在某接口上声明了FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要求改接口
3. 如果一个接口只有一个抽象方法，但并没有给该接口声明FunctionalInterface注解，那么编译器依然会将该接口看作是函数式接口，
也就是说，FunctionalInterface注解只有检验该接口是否为函数式接口的作用，并没有决定性作用

### lambda表达式
1. 依赖于函数式接口
2. 在java中，lambda表达式是对象
3. 与面向对象的不同
   1. 面向对象提前定义好行为，lambda在使用时再定义行为
       ```
           public class Test3 {
               public static void main(String[] args) {
           
                   //lambda表达式是对象，在使用时定义行为，增加使用者的灵活性
                   Function<Integer, Integer> f = v -> v * v;
                   System.out.println(Test3.compute(3, f));
           
                   System.out.println(Test3.method1(4));
               }
           
               public static int compute(int a, Function<Integer, Integer> function) {
                   return function.apply(a);
               }
           
               /**
                * 传统写法：提前定义好行为
                *
                * @param a
                * @return
                */
               public static int method1(int a) {
                   return a * a;
               }
           }
        
       ```
      
### stream（不会改变底部数据）
1. 源
2. 一个或多个中间操作
3. 终止操作（只有发生终止操作时，前面的中间操作才会执行）
   ```
   public static void main(String[] args) {
           List<Integer> list = Arrays.asList(1, 2, 3, 4);
           //对list集合中的数平方再求和
           //方法一
           System.out.println(list.parallelStream().map(i -> i * i).reduce(0, Integer::sum));
           //方法二
           System.out.println(list.stream().map(i -> i * i).reduce(0, (a, b) -> a + b));
   
   
           //通过stream去重
           Stream<Integer> stream=Stream.of(1,1,2,3,4);
           stream.distinct().forEach(System.out::println);
       }
   ```
   
   