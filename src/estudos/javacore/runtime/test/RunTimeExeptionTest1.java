package src.estudos.javacore.runtime.test;

public class RunTimeExeptionTest1 {
    public static void main(String[] args) {
        // checked ´é obrigatorio tratar --> filhas da classe exeption diretamente, se n tratadas, lamcam um erro em tempo de compilação, nem compila
        // unchecked não é obrigatorio tratar --> filhas de runtime lançadas pelo proprio java, significa que vc fez algma coisa errada na regra


      
        int [] nums = {1,2};



        System.out.println(nums[2]); // vai causar um erro por burrice sua --> unchecked
    }



    
}
